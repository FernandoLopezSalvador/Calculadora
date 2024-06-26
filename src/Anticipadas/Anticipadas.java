/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Anticipadas;

import Vistas.Menu;
import calculadora.Cal_tiempo;
import javax.swing.JOptionPane;

/**
 *
 * @author UNSIS
 * 
 */
public class Anticipadas extends javax.swing.JFrame {

    /**
     * Creates new form Anticipadas
     */
    public static int b;
    public Anticipadas(int x) {
        b=x;
        initComponents();
        switch (b) {
            case 1:
                this.jLabel1.setText("VP Anualidad Anticipada");
                this.jLabel2.setText("Interes");
                this.jLabel3.setText("Anualidad");
                this.jLabel4.setText("Periodos");
                break;
            case 2:
                this.jLabel1.setText("Monto Anualidad Anticipada");
                this.jLabel2.setText("Tasa de Interes");
                this.jLabel3.setText("Anualidad");
                this.jLabel4.setText("Periodos");
                break;
            case 3:
                this.jLabel1.setText("Anualidad Anticipada");
                this.jLabel2.setText("Interes");
                this.jLabel3.setText("Monto");
                this.jLabel4.setText("Periodo");

                break;
            case 4:
                this.jLabel1.setText("Tiempo Monto Anualidad Anticipada");
                this.jLabel2.setText("Interes");
                this.jLabel3.setText("Monto");
                this.jLabel4.setText("Anualidad");
                this.cmbtiempo.setVisible(false);
                break;
            case 5:
                this.jLabel1.setText("Tiempo VP Anualidad Anticipada");
                this.jLabel2.setText("Interes");
                this.jLabel3.setText("VP");
                this.jLabel4.setText("Anualidad");
                this.cmbtiempo.setVisible(false);
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
        interes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmbinteres = new javax.swing.JComboBox<>();
        cmbtiempo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Capital interes Simple");

        interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                interesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                interesKeyTyped(evt);
            }
        });

        jLabel2.setText("Interes");

        jLabel3.setText("Monto");

        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoKeyTyped(evt);
            }
        });

        tiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tiempoKeyTyped(evt);
            }
        });

        jLabel4.setText("Tiempo");

        jButton1.setText("Calcular");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        cmbinteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dias", "Mensual", "Bimestres", "Trimestres", "Cuatrimestres", "Semestres", "Años" }));
        cmbinteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinteresActionPerformed(evt);
            }
        });

        cmbtiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dias", "Mensual", "Bimestres", "Trimestres", "Cuatrimestres", "Semestres", "Años" }));

        jLabel5.setText("Capital");

        resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resultadoKeyTyped(evt);
            }
        });

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interes)
                    .addComponent(monto)
                    .addComponent(tiempo)
                    .addComponent(resultado)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbtiempo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(cmbinteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbinteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void interesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_interesKeyPressed

    private void interesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interesKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (interes.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (interes.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_interesKeyTyped

    private void montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (monto.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (monto.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_montoKeyTyped

    private void tiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (tiempo.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (tiempo.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_tiempoKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (("".equals(interes.getText())) || ("".equals(monto.getText())) || ("".equals(tiempo.getText()))) {
            JOptionPane.showMessageDialog(interes, "Por favor llene todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            double i = Double.parseDouble(interes.getText());
            i = i / 100;
            double m = Double.parseDouble(monto.getText());
            double t = Double.parseDouble(tiempo.getText());
            String ti = (String) cmbinteres.getSelectedItem();
            String tt = (String) cmbtiempo.getSelectedItem();
            //i = Cal_intereses.caltiempo(ti, i);
            t = Cal_tiempo.caltiempo(ti, tt, t);
            double r = 0;
            switch (b) {
                case 1:
                r = m*(1+(1-Math.pow(1+i,-t+1))/i);
                resultado.setText(String.valueOf(r));
                break;
                
                case 2:
                r = m*(((Math.pow(i+1,t)-1)/i)*(1+i));
                resultado.setText(String.valueOf(r));
                break;
                case 3:
                    
                r = m/(((Math.pow(1+i,t)/i)-1)*(1+i));
                resultado.setText(String.valueOf(r));
                break;
                case 4:
                double k = Double.parseDouble(tiempo.getText());
                r = (Math.log((m*i)/(k*(1+i)))+1)/(Math.log(1+i));
                resultado.setText(String.valueOf(r));
                break;
                
                case 5:
                double j = Double.parseDouble(tiempo.getText());
                r = (Math.log((m*i)/(j*(1+i)))+1)/(Math.log(1+i));
                resultado.setText(String.valueOf(r));
                break;
                
                default:
                break;
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void cmbinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbinteresActionPerformed

    private void resultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoKeyTyped
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyChar();

        // Permitir solo números, punto decimal y coma decimal
        boolean numeros = (key >= 48 && key <= 57) || keyChar == '.' || keyChar == ',';

        // Si no es un número o un punto/coma decimal, consumir el evento
        if (!numeros) {
            evt.consume();
        }

        // Permitir solo un punto/coma decimal
        if ((keyChar == '.' || keyChar == ',') && (tiempo.getText().contains("."))) {
            evt.consume();
        }

        // Limitar la longitud del texto a 100 caracteres
        if (tiempo.getText().trim().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_resultadoKeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        interes.setText("");
        monto.setText("");
        tiempo.setText("");
        resultado.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Menu menu = new Menu();
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
            java.util.logging.Logger.getLogger(Anticipadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anticipadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anticipadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anticipadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anticipadas(b).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbinteres;
    private javax.swing.JComboBox<String> cmbtiempo;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField tiempo;
    // End of variables declaration//GEN-END:variables
}
