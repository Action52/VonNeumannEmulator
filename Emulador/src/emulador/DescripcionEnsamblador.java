/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emulador;

/**
 *
 * @author Luisito
 */
public class DescripcionEnsamblador extends javax.swing.JFrame {

    /**
     * Creates new form Descripcion
     */
    public DescripcionEnsamblador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona:", "LDA", "STA", "ADD", "SUB", "JMP", "JMZ", "JMN", "IN", "OUT", "HLT", "CLA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lenguaje Ensamblador\n\nEl lenguaje ensamblador es un intermediario entre el lenguaje maquinal y los lenguajes de alto nivel (que son los que escribe el programador), ya que un comando en lenguaje ensamblador es una serie de ordenesen lenguaje maquinal, facilitando la capacidad de dar órdenes a una máquina y a la comprensiónde estas órdenes.  ");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emulador/Captura de pantalla 2015-03-30 a la(s) 20.28.04.png"))); // NOI18N

        jLabel2.setText("Averigua sobre las instrucciones más importantes en ensamblador: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       new Interfaz().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        preguntaCual();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void preguntaCual() {
        Object seleccion = jComboBox1.getSelectedItem();
        String slc = seleccion.toString();
        String textoLDA = "LDA\n\nMediante esta instrucción puede ponerse un dato en el regsitro acumulador. El dato que estaba anteriormente en "
                + "el acumulador se pierde. Dependiendo del dato, se puede encender la bandera N o Z.";
        String textoSTA = "STA\n\nEsta instrucción se utiliza para guardar en la unidad de memoria el dato que actualmente está en el registro acumulador."
                + " El contenido del registro acumulador no se modifica al realizar esta instrucción.";
        String textoADD = "ADD\n\nEsta instruccion permite sumar un dato al que actualmente se encuentra en el registro acumulador. El resultado"
                + " de la operación se almacena en el acumulador. El dato que estaba anteriormente en el registro acumulador se pierde. Las banderas"
                + " N, Z y V se modifican de acuerdo con el resultado de la operación.";
        String textoSUB = "SUB\n\nEsta instruccion permite restar un dato al que actualmente se encuentra en el registro acumulador. El resultado"
                + " de la operación se almacena en el acumulador. El dato que estaba anteriormente en el registro acumulador se pierde. Las banderas"
                + "N, Z y V se modifican de acuerdo con el resultado de la operación.";
        String textoJMP = "JMP\n\nComprueba si la bandera V está encendida, si lo está, transfiere el control de la ejecución del programa a la dirección especificada"
                + "por la instrucción. Si no está encendida, la instrucción continúa de forma normal.";
        String textoJMZ = "JMZ\n\nComprueba si la bandera Z (Cero) está encendida, si lo está, transfiere el control de la ejecución del programa a la dirección especificada"
                + "por la instrucción. Si no está encendida, la instrucción continúa de forma normal.";
        String textoJMN = "JMN\n\nComprueba si la bandera N (Negativo) está encendida, si lo está, transfiere el control de la ejecución del programa a la dirección especificada"
                + "por la instrucción. Si no está encendida, la instrucción continúa de forma normal.";
        String textoIN = "IN\n\nInstruccion que recibe un dato desde un puerto";
        String textoOUT = "OUT\n\nInstruccion que escribe un dato a un puerto";
        String textoHLT = "HLT\n\nAl ejecutarse esta instrucción se detendrá la operación de la computadora.";
        String textoCLA = "CLA\n\nEsta instrucción permite poner el registro acumulador en 0. Esto hace que la bandera N se apague y la bandera Z se encienda.";
                String textoDefault = "Lenguaje Ensamblador\n\nEl lenguaje ensamblador es un intermediario entre el "
                + "lenguaje maquinal y los lenguajes de alto nivel (que son los que escribe el programador)"
                + ", ya que un comando en lenguaje ensamblador es una serie de ordenes"
                + "en lenguaje maquinal, facilitando la capacidad de dar órdenes a una máquina y a la comprensión"
                + "de estas órdenes.  ";
        switch (slc)
        {
            case "LDA":
                jTextArea1.setText(textoLDA);
                break;
            case "STA":
                jTextArea1.setText(textoSTA);
                break;
            case "ADD":
                jTextArea1.setText(textoADD);
                break;
            case "SUB":
                jTextArea1.setText(textoSUB);
                break;
            case "JMP":
                jTextArea1.setText(textoJMP);
                break;
            case "JMZ":
                jTextArea1.setText(textoJMZ);
                break; 
            case "JMN":
                jTextArea1.setText(textoJMN);
                break;
            case "IN":
                jTextArea1.setText(textoIN);
                break;
            case "OUT":
                jTextArea1.setText(textoOUT);
                break;
            case "HLT":
                jTextArea1.setText(textoHLT);
                break;
            case "CLA":
                jTextArea1.setText(textoCLA);
                break; 
            default:
                jTextArea1.setText(textoDefault);
                break;
        }
    }
         
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
            java.util.logging.Logger.getLogger(DescripcionEnsamblador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescripcionEnsamblador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescripcionEnsamblador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescripcionEnsamblador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescripcionEnsamblador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}