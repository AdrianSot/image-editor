package contour;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.lang.Math; 
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class FrameBC extends javax.swing.JFrame {

    /**
     * Creates new form FrameBC
     */
    private BufferedImage imageIn;
            
    public FrameBC() {
        initComponents();
        String imageInName = "entradaBC.jpg";
        try{
           imageIn = ImageIO.read(new File(imageInName));
           imageToBlackAndWhite(imageIn);
           lImg1.setIcon(new ImageIcon(new ImageIcon(imageIn).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT)));
           pImage1.setSize(500, 500);
           lImg1.setSize(500, 500);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pImage2 = new javax.swing.JPanel();
        lImg2 = new javax.swing.JLabel();
        pImage1 = new javax.swing.JPanel();
        lImg1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bDo = new javax.swing.JButton();
        jbContour = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1200, 800));

        pImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pImage2.setMaximumSize(new java.awt.Dimension(500, 500));
        pImage2.setMinimumSize(new java.awt.Dimension(500, 500));
        pImage2.setPreferredSize(new java.awt.Dimension(500, 500));
        pImage2.setLayout(new java.awt.BorderLayout());

        lImg2.setMaximumSize(new java.awt.Dimension(500, 500));
        lImg2.setMinimumSize(new java.awt.Dimension(500, 500));
        lImg2.setPreferredSize(new java.awt.Dimension(500, 500));
        pImage2.add(lImg2, java.awt.BorderLayout.CENTER);

        pImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pImage1.setMaximumSize(new java.awt.Dimension(500, 500));
        pImage1.setMinimumSize(new java.awt.Dimension(500, 500));
        pImage1.setPreferredSize(new java.awt.Dimension(500, 500));
        pImage1.setLayout(new java.awt.BorderLayout());

        lImg1.setMaximumSize(new java.awt.Dimension(500, 500));
        lImg1.setMinimumSize(new java.awt.Dimension(500, 500));
        lImg1.setPreferredSize(new java.awt.Dimension(500, 500));
        pImage1.add(lImg1, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        bDo.setText("Flood-Fill");
        bDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoActionPerformed(evt);
            }
        });

        jbContour.setText("Contour");
        jbContour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContourActionPerformed(evt);
            }
        });

        jLabel1.setText("");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel2.setText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bDo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(jbContour, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(137, 137, 137))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbContour, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(pImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static BufferedImage copyImage(BufferedImage source){
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = b.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
    }
    
    void imageToBlackAndWhite(BufferedImage imageIn){
        int width = imageIn.getWidth();
        int height = imageIn.getHeight();
        for(int x = 0; x < width; x++){
            for (int y = 0; y < height; y++) {
                int rgbIn = imageIn.getRGB(x,y);
                int alpha = (rgbIn & 0xff000000) >>> 24;
                int red = (rgbIn & 0x00ff0000) >> 16;
                int green = (rgbIn & 0x0000ff00) >> 8;
                int blue = rgbIn & 0x000000ff;
                int rgbOut;
                if(red < 100 && green < 100 && blue < 100){
                    rgbOut = alpha << 24;
                }else{
                    rgbOut = alpha << 24 | 255 << 16 | 255 << 8 | 255;
                }
                imageIn.setRGB(x, y, rgbOut);
            }
        }
    }
    
    private void bDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoActionPerformed
        String imageOutName = "salida.jpg";
        lImg2.setIcon(null);
        
        HashSet<Integer> colors = new HashSet<>();
        Queue<Point> points = new LinkedList<>();
        Random rand = new Random();
        
        try {
            
            int width = imageIn.getWidth();
            int height = imageIn.getHeight();
            BufferedImage imageOut = copyImage(imageIn);
           
            for(int x = 0; x < width; x++){
                for (int y = 0; y < height; y++) {
                    
                    int rgbIn = imageIn.getRGB(x,y);
                    int alpha = (rgbIn & 0xff000000) >>> 24;
                    int red = (rgbIn & 0x00ff0000) >> 16;
                    int green = (rgbIn & 0x0000ff00) >> 8;
                    int blue = rgbIn & 0x000000ff;
                    int rgbOut = rgbIn;
                    
                    if(red == 0 && green == 0 && blue == 0){
                        points.add(new Point(x,y));
                        do{
                            rgbOut = alpha << 24 | rand.nextInt(256) << 16 | rand.nextInt(256) << 8 | rand.nextInt(256);
                        }while(colors.contains(rgbOut));
                        colors.add(rgbOut);
                    }
                    
                    while(!points.isEmpty()){
                        Point p = points.remove();
                        if(p.x < 0 || p.x >= width || p.y < 0 || p.y > height) continue;
                        rgbIn = imageOut.getRGB(p.x,p.y);
                        red = (rgbIn & 0x00ff0000) >> 16;
                        green = (rgbIn & 0x0000ff00) >> 8;
                        blue = rgbIn & 0x000000ff;
                        if(red != 0 || green != 0 || blue != 0) continue;
                        
                        points.add(new Point(p.x+1,p.y));
                        points.add(new Point(p.x-1,p.y));
                        points.add(new Point(p.x,p.y+1));
                        points.add(new Point(p.x,p.y-1));
                        
                        imageOut.setRGB(p.x, p.y, rgbOut);
                    }
                }
            }
                
            ImageIO.write(imageOut, "png", new File(imageOutName));
            lImg2.setIcon(new ImageIcon(new ImageIcon(imageOut).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT)));
            pImage2.setSize(500, 500);
            lImg2.setSize(500, 500);
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        
        


    }//GEN-LAST:event_bDoActionPerformed

    private void jbContourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContourActionPerformed
        BinaryContour bc = new BinaryContour(imageIn);
        bc.Contouring();
        List<Contour> outerContours = bc.getOuterContours();
	List<Contour> innerContours = bc.getInnerContours();
      
        lImg2.setIcon(null);
        BufferedImage bi = new BufferedImage(imageIn.getWidth(), imageIn.getHeight(),BufferedImage.TYPE_INT_ARGB);
        Graphics2D ig2 = bi.createGraphics();
        ig2.setBackground(Color.WHITE);
        ig2.clearRect(0, 0, imageIn.getWidth(), imageIn.getHeight());
        
        int rgbColor;
        
        FileWriter writer = null; 
        try {
            writer = new FileWriter("outerContour.txt");
            for(Contour con : outerContours){
                writer.write("==================" + System.lineSeparator());
                rgbColor = 255 << 24 | 255 << 16;
                for(Point point : con.getPointList()){
                    bi.setRGB(point.x, point.y, rgbColor);
                    writer.write("(" + point.x + "," + point.y + ")" + System.lineSeparator());
                }
            }
            writer.close();

            writer = new FileWriter("innerContour.txt");

            for(Contour con : innerContours){
                writer.write("==================" + System.lineSeparator());
                rgbColor = 255 << 24 | 255;
                for(Point point : con.getPointList()){
                    bi.setRGB(point.x, point.y, rgbColor);
                    writer.write("(" + point.x + "," + point.y + ")" + System.lineSeparator());
                }
            }

            writer.close();

            ImageIO.write(bi, "png", new File("salida.jpg"));
            lImg2.setIcon(new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT)));
            pImage2.setSize(500, 500);
            lImg2.setSize(500, 500);
        }catch(IOException e){}

        
    }//GEN-LAST:event_jbContourActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDo;
    private javax.swing.ButtonGroup bGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbContour;
    private javax.swing.JLabel lImg1;
    private javax.swing.JLabel lImg2;
    private javax.swing.JPanel pImage1;
    private javax.swing.JPanel pImage2;
    // End of variables declaration//GEN-END:variables
}
