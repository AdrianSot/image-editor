package contour;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class BinaryContour {
    
        static final int BACKGROUND = 0;
	static final int FOREGROUND = 1;
	static final int START_LABEL = 2;
        
        static  final int VISITED = -1;
	List<Contour> outerContours;
	List<Contour> innerContours;
        
	int width;
	int height;
	
	int[][] labelArray;
        int currentLabel;
	int maxLabel;	
        
        BufferedImage ip;
        
        BinaryContour(BufferedImage bi){
            ip = bi;
            width = bi.getWidth();
            height = bi.getHeight();
            labelArray = new int[width+2][height+2];
            outerContours = new ArrayList<>();
            innerContours = new ArrayList<>();
        }
        
        List<Contour> getOuterContours(){
            return outerContours;
        }
        
        List<Contour> getInnerContours(){
            return innerContours;
        }
        
    	public void Contouring() {
		resetLabel();
		for (int v = 0; v < height; v++) {
			int label = 0;	
			for (int u = 0; u < width; u++) {
				if (ip.getRGB(u, v) != -1) {	
					if (label != 0) { 
						setLabel(u, v, label);
					}
					else {	
						label = getLabel(u, v);
						if (label == 0) {	
							label = getNextLabel(); 
							Contour oc = traceContour(u, v, 0, label);
							outerContours.add(oc);
							setLabel(u, v, label);
						}
					}
				} 
				else {	
					if (label != 0) {
						if (getLabel(u, v) == BACKGROUND) { 
							Contour ic = traceContour(u - 1, v, 1, label);
							innerContours.add(ic);
						}
						label = 0;
					}
				}
			}
		}
	}
           
        private Contour traceContour(int xS, int yS, int dS, int label) {
            Contour contr = new Contour(label);
            int xT, yT; 
            int xP, yP; 
            int xC, yC; 
            int[] pt = {xS, yS};
            int dNext = findNextPoint(pt, dS);
            contr.addPoint(new Point(pt[0], pt[1]));
            xP = xS; yP = yS;
            xC = xT = pt[0];
            yC = yT = pt[1];

            boolean done = (xS == xT && yS == yT);  
            while (!done) {
                    setLabel(xC, yC, label);
                    int[] pn = {xC, yC};
                    int dSearch = (dNext + 6) % 8;
                    dNext = findNextPoint(pn, dSearch);
                    xP = xC;  yP = yC;	
                    xC = pn[0]; 
                    yC = pn[1]; 
                    done = (xP==xS && yP==yS && xC==xT && yC==yT);
                    if (!done) {
                            contr.addPoint(new Point(pn[0], pn[1]));
                    }
            }
            return contr;
	}
	
	static final int[][] delta = {
			{ 1,0}, { 1, 1}, {0, 1}, {-1, 1}, 
			{-1,0}, {-1,-1}, {0,-1}, { 1,-1}};
        
        private int findNextPoint (int[] pos, int dir) { 	
            
            for (int i = 0; i < 7; i++) {
                    int x = pos[0] + delta[dir][0];
                    int y = pos[1] + delta[dir][1];
                    if (ip.getRGB(x, y) == -1) {
                            setLabel(x, y, VISITED);	
                            dir = (dir + 1) % 8;
                    } 
                    else {	
                            pos[0] = x; 
                            pos[1] = y; 
                            break;
                    }
            }
            return dir;
	}
        
        int getLabel(int u, int v) {
		if (u >= 0 && u < width && v >= 0 && v < height)
			return labelArray[u][v];
		else
			return BACKGROUND;
	}
	
	void setLabel(int u, int v, int label) {
		if (u >= 0 && u < width && v >= 0 && v < height)
			labelArray[u][v] = label;
	}
	
	void resetLabel() {
		currentLabel = -1;
		maxLabel = -1;
	}
	
	int getNextLabel() {
		if (currentLabel < 1)
			currentLabel = START_LABEL;
		else
			currentLabel = currentLabel + 1;
		maxLabel = currentLabel;
		return currentLabel;
	}
    
}
