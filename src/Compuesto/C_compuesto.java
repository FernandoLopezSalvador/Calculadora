/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Compuesto;

import Vistas.Menu;
import calculadora.Cal_intereses;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class C_compuesto extends javax.swing.JFrame {

    /**
     * Creates new form C_compuesto
     * 
     * @param x
     */
    public static int b;
    public C_compuesto(int x) {
        b=x;
        initComponents();
        switch (b) {
                case 1:
                    this.jLabel1.setText("Capital  Compuesto");
                    this.jLabel2.setText("Interes");
                    this.jLabel3.setText("Monto");
                    this.jLabel4.setText("Tiempo");
                    break;
                case 2:
                    this.jLabel1.setText("interes Compuesto");
                    this.jLabel2.setText("Tiempo");
                    this.jLabel3.setText("Capital");
                    this.jLabel4.setText("Monto");
                    break;
                case 3:
                    this.jLabel1.setText("Monto Compuesto");
                    this.jLabel2.setText("Interes");
                    this.jLabel3.setText("Capital");
                    this.jLabel4.setText("Tiempo");
                    
                    break;
                case 4:
                    this.jLabel1.setText("Tiempo Compuesto");
                    this.jLabel2.setText("Interes");
                    this.jLabel3.setText("Capital");
                    this.jLabel4.setText("Monto");
                 break;
                default:
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

        jLabel1 = new javax.swing.JLabel();
        C_interes = new javax.swing.JTextField();
        cmb_tiempo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        C_Monto = new javax.swing.JTextField();
        C_tiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Monto interes Compuesto");

        C_interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C_interesKeyTyped(evt);
            }
        });

        cmb_tiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dias", "Mensual", "Bimestres", "Trimestres", "Cuatrimestres", "Semestres", "Años" }));

        jLabel2.setText("Interes");

        jLabel3.setText("Monto");

        C_Monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C_MontoKeyTyped(evt);
            }
        });

        C_tiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C_tiempoKeyTyped(evt);
            }
        });

        jLabel4.setText("Tiempo");

        jButton1.setText("Calcular");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setText("Monto");

        jButton2.setText("Nuevo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jMenu1.setText("Menu");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_tiempo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C_Monto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C_interes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(cmb_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(C_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_interesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_C_interesKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (C_interes.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (C_interes.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_C_interesKeyTyped

    private void C_MontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_C_MontoKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (C_Monto.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (C_Monto.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_C_MontoKeyTyped

    private void C_tiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_C_tiempoKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (C_tiempo.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (C_tiempo.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_C_tiempoKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (("".equals(C_interes.getText())) || ("".equals(C_Monto.getText())) || ("".equals(C_tiempo.getText()))) {
            JOptionPane.showMessageDialog(C_interes, "Por favor llene todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            double i = Double.parseDouble(C_interes.getText());
            double m = Double.parseDouble(C_Monto.getText());
            double t = Double.parseDouble(C_tiempo.getText());
            String ti = (String) cmb_tiempo.getSelectedItem();
            i = i / 100;
            i = Cal_intereses.caltiempo(ti, i);
            double r =0;
            
             switch (b) {
                case 1:
                    
                    r =m / (Math.pow((1 + i), t));
                    resultado.setText(String.valueOf(r));
                    break;
                case 2:
                    
                    r =((t/m)-1)/i;
                    resultado.setText(String.valueOf(r));
                    break;
                case 3:
                    
                    r =m*(Math.pow((1+i), t));
                    resultado.setText(String.valueOf(r));
                    
                    break;
                case 4:
                    
                    r =m*(Math.pow((1+i), t));
                    resultado.setText(String.valueOf(r));
                 break;
                default:
                    break;
            }
            
        }
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        C_interes.setText("");
        C_Monto.setText("");
        C_tiempo.setText("");
        resultado.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Menu menu=new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(C_compuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_compuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_compuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_compuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_compuesto(b).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C_Monto;
    private javax.swing.JTextField C_interes;
    private javax.swing.JTextField C_tiempo;
    private javax.swing.JComboBox<String> cmb_tiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}