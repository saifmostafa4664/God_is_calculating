
import java.awt.Image;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20122
 */
public class clc extends javax.swing.JFrame {

  double f , g ;
  int clc ;
    public clc() {
        initComponents();
        this.setLocationRelativeTo(null);
         try{
            Image w = ImageIO.read(getClass().getResource("/Calculator-icon.png"));
            this.setIconImage(w);
        }catch(Exception e){
        
        }
    }
    public void opp(){
        switch(clc){
            case 1 :
        g = f + Double.parseDouble(jTextField1.getText());
        jTextField1.setText(Double.toString(g));
        break;
           case 2 :
        g = f - Double.parseDouble(jTextField1.getText());
        jTextField1.setText(Double.toString(g));
        break;  
           case 3 :
        g = f * Double.parseDouble(jTextField1.getText());
        jTextField1.setText(Double.toString(g));
        break;
           case 4 :
        g = f / Double.parseDouble(jTextField1.getText());
        jTextField1.setText(Double.toString(g));
        break;
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

        jButton21 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        jButton21.setText("jButton1");

        jButton28.setText("jButton1");

        jButton15.setText("jButton1");

        jButton1.setText("jButton1");

        jButton6.setText("jButton1");

        jButton18.setText("jButton1");

        jButton26.setText("jButton4");

        jButton29.setText("jButton3");

        jButton27.setText("jButton5");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(215, 405));
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 51, 196, 71);

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 44)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 196, 44);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(135, 198, 61, 27);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.setText("2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(67, 198, 61, 27);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton5.setText("1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 198, 61, 27);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton8.setText("6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(135, 231, 61, 27);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton9.setText("5");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(67, 231, 62, 27);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton10.setText("4");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 231, 61, 27);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton11.setText("7");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(0, 264, 61, 27);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton12.setText("9");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(135, 264, 61, 27);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton14.setText("8");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(67, 264, 62, 27);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton16.setText("000");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(135, 297, 61, 27);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton17.setText("0");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(67, 297, 62, 27);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton19.setText("00");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(0, 297, 61, 27);

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton30.setText("=");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30);
        jButton30.setBounds(28, 330, 145, 27);

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton22.setText("*");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(0, 128, 61, 27);

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton23.setText("-");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(67, 165, 61, 27);

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton24.setText("+");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24);
        jButton24.setBounds(0, 165, 61, 27);

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton25.setText("/");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(134, 165, 62, 27);

        jToggleButton1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jToggleButton1.setText("cler");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(67, 128, 61, 27);

        jToggleButton3.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jToggleButton3.setText("off");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(134, 128, 62, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OIP.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 200, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jTextField1.getText();
        
       opp();
        
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     jTextField1.setText(jTextField1.getText() +"1");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jTextField1.setText(jTextField1.getText() +"2");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTextField1.setText(jTextField1.getText() +"3");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
jTextField1.setText(jTextField1.getText() +"4");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
jTextField1.setText(jTextField1.getText() +"5");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
jTextField1.setText(jTextField1.getText() +"6");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
jTextField1.setText(jTextField1.getText() +"7");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
   
     f = Double.parseDouble(jTextField1.getText());    
    clc = 3;
   jTextField1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
  
     f = Double.parseDouble(jTextField1.getText());    
    clc = 2;
   jTextField1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        f = Double.parseDouble(jTextField1.getText());    
    clc = 1;
   jTextField1.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
 
     f = Double.parseDouble(jTextField1.getText());    
    clc = 4;
   jTextField1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
jTextField1.setText(jTextField1.getText() +"9");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
jTextField1.setText(jTextField1.getText() +"8");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
jTextField1.setText(jTextField1.getText() +"00");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
jTextField1.setText(jTextField1.getText() +"0");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
jTextField1.setText(jTextField1.getText() +"000");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int legent = jTextField1.getText().length();
        int numper = jTextField1.getText().length() - 1 ;
        String h ;
        if(legent > 0){
        StringBuilder fg = new StringBuilder(jTextField1.getText());
        fg.deleteCharAt(numper);
         h=fg.toString();
         jTextField1.setText(h);
         
        
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(clc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
