// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */
// package personalProject;

// import javax.swing.*;
// import java.awt.event.*;
// /**
//  *
//  * @author Janani
//  */
// public class GameGrid extends JFrame{
//     private static JPanel grid;
//     /**
//      * Creates new form gameGrid
//      */
//     public GameGrid() {
//         initComponents();
//     }

//     /**
//      * This method is called from within the constructor to initialize the form.
//      * WARNING: Do NOT modify this code. The content of this method is always
//      * regenerated by the Form Editor.
//      */
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//     private void initComponents() {

//         jButton5 = new javax.swing.JButton();
//         jLabel1 = new javax.swing.JLabel();
//         jButton1 = new javax.swing.JButton();
//         jPanel2 = new javax.swing.JPanel();
//         jButton52 = new javax.swing.JButton();
//         jButton53 = new javax.swing.JButton();

//         jButton5.setText("jButton5");

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
//         jLabel1.setText("BattleShip");

//         jButton1.setText("start Game");
//         jButton1.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jButton1ActionPerformed(evt);
//             }
//         });

//         jPanel2.setLayout(new java.awt.GridLayout());

//         jButton52.setText("jButton52");
//         jButton52.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jButton52ActionPerformed(evt);
//             }
//         });
//         jPanel2.add(jButton52);

//         jButton53.setText("jButton53");
//         jPanel2.add(jButton53);

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addGap(215, 215, 215)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(jLabel1)
//                     .addGroup(layout.createSequentialGroup()
//                         .addGap(10, 10, 10)
//                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jButton1))))
//                 .addContainerGap(326, Short.MAX_VALUE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel1)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jButton1)
//                 .addGap(48, 48, 48)
//                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap(68, Short.MAX_VALUE))
//         );

//         pack();
//     }// </editor-fold>                        

//     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//         grid.setVisible(true);
//     }                                        

//     private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {                                          
//         // TODO add your handling code here:
//     }                                         

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(gameGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(gameGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(gameGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(gameGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new gameGrid().setVisible(true);
//                 grid.setVisible(false);
//             }
//         });
//     }

//     // Variables declaration - do not modify                     
//     private javax.swing.JButton jButton1;
//     private javax.swing.JButton jButton5;
//     private javax.swing.JButton jButton52;
//     private javax.swing.JButton jButton53;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JPanel jPanel2;
//     // End of variables declaration                   
// }
