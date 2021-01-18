package filters;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.lang.Math; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class FrameF extends javax.swing.JFrame {

    /**
     * Creates new form FrameF
     */
    private String selection = "Negative";
    private float constant = 0;
    private float gamma = 0;
    private BufferedImage imageIn;
            
    public FrameF() {
        initComponents();
        String imageInName = "entrada.jpg";
        try{
           imageIn = ImageIO.read(new File(imageInName));
           lImg1.setIcon(new ImageIcon(new ImageIcon(imageIn).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT)));
           pImage1.setSize(500, 500);
           lImg1.setSize(500, 500);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        tfConst.setEnabled(false);
        tfGamma.setEnabled(false);
       
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
        rbNegative = new javax.swing.JRadioButton();
        rbLog = new javax.swing.JRadioButton();
        rbLogI = new javax.swing.JRadioButton();
        rbGamma = new javax.swing.JRadioButton();
        bDo = new javax.swing.JButton();
        tfConst = new javax.swing.JTextField();
        tfGamma = new javax.swing.JTextField();
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

        bGroup.add(rbNegative);
        rbNegative.setSelected(true);
        rbNegative.setText("Negative");
        rbNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNegativeActionPerformed(evt);
            }
        });

        bGroup.add(rbLog);
        rbLog.setText("Log");
        rbLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLogActionPerformed(evt);
            }
        });

        bGroup.add(rbLogI);
        rbLogI.setText("Log Inverse");
        rbLogI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLogIActionPerformed(evt);
            }
        });

        bGroup.add(rbGamma);
        rbGamma.setText("Gamma");
        rbGamma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGammaActionPerformed(evt);
            }
        });

        bDo.setText("Transform");
        bDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoActionPerformed(evt);
            }
        });

        tfConst.setText("0");
        tfConst.setMinimumSize(new java.awt.Dimension(100, 41));
        tfConst.setPreferredSize(new java.awt.Dimension(100, 41));

        tfGamma.setText("0");
        tfGamma.setMinimumSize(new java.awt.Dimension(100, 41));
        tfGamma.setPreferredSize(new java.awt.Dimension(100, 41));

        jLabel1.setText("c :");

        jLabel2.setText("γ :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(rbNegative)
                        .addGap(75, 75, 75)
                        .addComponent(rbLog)
                        .addGap(75, 75, 75)
                        .addComponent(rbLogI)
                        .addGap(75, 75, 75)
                        .addComponent(rbGamma))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfConst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfGamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(bDo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNegative)
                    .addComponent(rbLog)
                    .addComponent(rbLogI)
                    .addComponent(rbGamma))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(bDo))
                .addContainerGap(10, Short.MAX_VALUE))
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

    private void bDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoActionPerformed
        String imageOutName = "salida.jpg";

        try {
            lImg2.setIcon(null);
            int width = imageIn.getWidth();
            int height = imageIn.getHeight();
            BufferedImage imageOut = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            constant = Float.valueOf(tfConst.getText());
            gamma = Float.valueOf(tfGamma.getText());

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    int rgbIn = imageIn.getRGB(x, y);
                    int alpha = (rgbIn & 0xff000000) >>> 24;
                    int red = (rgbIn & 0x00ff0000) >> 16;
                    int green = (rgbIn & 0x0000ff00) >> 8;
                    int blue = rgbIn & 0x000000ff;

                    //int grayScale = (int) (red * 0.2989 + green * 0.5870 + blue * 0.1140);
                    
                    switch(selection){
                        case "Negative":
                            red = 255 - red;
                            green = 255 - green;
                            blue = 255 - blue;
                            break;
                        case "Log":
                            red =(int)(constant*Math.log10(1 +red));
                            green = (int)(constant*Math.log10(1 +green));
                            blue = (int)(constant*Math.log10(1 +blue));
                            break;
                        case "LogI": //Log inversa o exponencial
                            red = (int)(constant*(Math.pow(1.02, red - 1)));
                            green = (int)(constant*(Math.pow(1.02, green - 1)));
                            blue = (int)(constant*(Math.pow(1.02, blue - 1)));
                            break;
                        case "Gamma":
                            red = (int)((constant * Math.pow((float)red/255, gamma))*255);
                            green = (int)((constant * Math.pow((float)green/255, gamma))*255);
                            blue = (int)((constant * Math.pow((float)blue/255, gamma))*255);
                            break;
                            

                    }
                    if(red>255)red=255;
                    if(green>255)green=255;
                    if(blue>255)blue=255;

                    int rgbOut = alpha << 24
                            | red << 16
                            | green << 8
                            | blue;

                    imageOut.setRGB(x, y, rgbOut);
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

    private void rbNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNegativeActionPerformed
        selection = "Negative";
        tfConst.setEnabled(false);
        tfGamma.setEnabled(false);
        tfConst.setText("0");
        tfGamma.setText("0");
    }//GEN-LAST:event_rbNegativeActionPerformed

    private void rbLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLogActionPerformed
        selection = "Log";
        tfConst.setEnabled(true);
        tfGamma.setEnabled(false);
        tfConst.setText("100");
        tfGamma.setText("0");
    }//GEN-LAST:event_rbLogActionPerformed

    private void rbLogIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLogIActionPerformed
        selection = "LogI";
        tfConst.setEnabled(true);
        tfGamma.setEnabled(false);
        tfConst.setText("1.64");
        tfGamma.setText("0");
    }//GEN-LAST:event_rbLogIActionPerformed

    private void rbGammaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGammaActionPerformed
        selection = "Gamma";
        tfConst.setEnabled(true);
        tfGamma.setEnabled(true);
        tfConst.setText("1");
        tfGamma.setText("1");
    }//GEN-LAST:event_rbGammaActionPerformed
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
            java.util.logging.Logger.getLogger(FrameF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameF().setVisible(true);
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
    private javax.swing.JLabel lImg1;
    private javax.swing.JLabel lImg2;
    private javax.swing.JPanel pImage1;
    private javax.swing.JPanel pImage2;
    private javax.swing.JRadioButton rbGamma;
    private javax.swing.JRadioButton rbLog;
    private javax.swing.JRadioButton rbLogI;
    private javax.swing.JRadioButton rbNegative;
    private javax.swing.JTextField tfConst;
    private javax.swing.JTextField tfGamma;
    // End of variables declaration//GEN-END:variables
}