/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptoño;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Pango
 */
public class main extends javax.swing.JFrame {
    float x=1;
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcComBox = new javax.swing.JComboBox<>();
        opcLabel = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        sepPrincp = new javax.swing.JSeparator();
        rbtnAcetona = new javax.swing.JRadioButton();
        rbtnEtanol = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        tempLabel = new javax.swing.JLabel();
        tempTextF = new javax.swing.JTextField();
        gravLabel = new javax.swing.JLabel();
        gravTextF = new javax.swing.JTextField();
        denLabel = new javax.swing.JLabel();
        denTextF = new javax.swing.JTextField();
        angLabel = new javax.swing.JLabel();
        angTextF = new javax.swing.JTextField();
        delKLabel = new javax.swing.JLabel();
        delKTextF = new javax.swing.JTextField();
        wLabel = new javax.swing.JLabel();
        wTextF = new javax.swing.JTextField();
        pbsLabel = new javax.swing.JLabel();
        pbsTextF = new javax.swing.JTextField();
        pmodOLabel = new javax.swing.JLabel();
        pmodOTextF = new javax.swing.JTextField();
        pmodLLabel = new javax.swing.JLabel();
        pmodLTextF = new javax.swing.JTextField();
        radMenLabel = new javax.swing.JLabel();
        radMenTextF = new javax.swing.JTextField();
        radMayLabel = new javax.swing.JLabel();
        radMayTextF = new javax.swing.JTextField();
        viscLabel = new javax.swing.JLabel();
        viscTextF = new javax.swing.JTextField();
        vzLabel = new javax.swing.JLabel();
        vzTextF = new javax.swing.JTextField();
        opcCombBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion de las ecucaciones de continuidad y de cantidad de movimiento al sistema de flujo laminar y turbulento isotermico");
        setBackground(new java.awt.Color(51, 100, 94));

        opcComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flujo de una pelicula descendente", "Flujo a través de un tubo circular inclinado", "Flujo tapón", "Prototipo" }));

        opcLabel.setText("Selecciona una opción:");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        rbtnAcetona.setText("Acetona");
        rbtnAcetona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnStateChange(evt);
            }
        });

        rbtnEtanol.setText("Etanol");
        rbtnEtanol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnStateChange(evt);
            }
        });

        tempLabel.setText("Temperatura (*K)");

        tempTextF.setEditable(false);
        tempTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tempTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        gravLabel.setText("Gravedad (m/s^2)");

        gravTextF.setEditable(false);
        gravTextF.setBackground(new java.awt.Color(40, 52, 53));
        gravTextF.setForeground(new java.awt.Color(255, 255, 255));
        gravTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gravTextF.setText("9.81");

        denLabel.setText("Densidad (Kg/m^3)");

        denTextF.setEditable(false);
        denTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        denTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        angLabel.setText("Angulo (menor a 60*)");

        angTextF.setEditable(false);
        angTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        angTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        delKLabel.setText("Delta Kronecker");

        delKTextF.setEditable(false);
        delKTextF.setBackground(new java.awt.Color(40, 52, 53));
        delKTextF.setForeground(new java.awt.Color(255, 255, 255));
        delKTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        delKTextF.setText("1");
        delKTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                delKTextFtextFieldFocusLost(evt);
            }
        });

        wLabel.setText("W");

        wTextF.setEditable(false);
        wTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        pbsLabel.setText("Profundidad bajo la superficie (h)");

        pbsTextF.setEditable(false);
        pbsTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pbsTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        pmodOLabel.setText("Pmod. O");

        pmodOTextF.setEditable(false);
        pmodOTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pmodOTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        pmodLLabel.setText("Pmod. L");

        pmodLTextF.setEditable(false);
        pmodLTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pmodLTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        radMenLabel.setText("Rad. menor");

        radMenTextF.setEditable(false);
        radMenTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        radMenTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        radMayLabel.setText("Rad. mayor");

        radMayTextF.setEditable(false);
        radMayTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        radMayTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        viscLabel.setText("Viscosidad pas/seg");

        viscTextF.setEditable(false);
        viscTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viscTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        vzLabel.setText("Mediante la eq. de continuidad y la eq. de cantidad de movimiento se determina el perfil de velocidad Vz: ");

        vzTextF.setEditable(false);
        vzTextF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vzTextF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vzTextFtextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gravTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gravLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tempTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pbsLabel)
                                    .addComponent(pbsTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pmodLTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pmodLLabel)))
                            .addComponent(pmodOLabel)
                            .addComponent(pmodOTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radMayTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radMayLabel)
                            .addComponent(viscTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viscLabel)
                            .addComponent(radMenTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radMenLabel))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(denLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(angLabel)
                                    .addComponent(angTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(denTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delKTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delKLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vzLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vzTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempLabel)
                            .addComponent(wLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radMayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radMayTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(denLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(denTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravLabel)
                            .addComponent(pbsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pbsTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viscLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viscTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pmodOLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pmodOTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pmodLLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pmodLTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radMenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radMenTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delKLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delKTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vzLabel)
                    .addComponent(vzTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        opcCombBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Determinar el perfil de velocidad de la rampa", "Calcular la velocidad maxima", "Calcular <V>", "Calcular el flujo molar", "Calcular el perfil de esfuerzo viscoso" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sepPrincp)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(rbtnAcetona)
                .addGap(111, 111, 111)
                .addComponent(rbtnEtanol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(opcCombBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcLabel)
                    .addComponent(btnAceptar)
                    .addComponent(opcComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcCombBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAcetona)
                    .addComponent(rbtnEtanol))
                .addGap(10, 10, 10)
                .addComponent(sepPrincp, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(opcComBox.getSelectedItem().toString().equals("Flujo de una pelicula descendente")){
            float resultado = (Float.parseFloat(denTextF.getText()) * Float.parseFloat(gravTextF.getText()) * (float)Math.cos(Double.parseDouble(angTextF.getText())*3.1416/180)) / Float.parseFloat(viscTextF.getText()) * ((Float.parseFloat(delKTextF.getText()) * x) - ((float)Math.pow(x, 2)/2));
            x = x - 0.2f;
            vzTextF.setText(""+resultado);
        }
        new ChartTest().setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rbtnStateChange(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnStateChange
        if(rbtnEtanol.isSelected() && !rbtnAcetona.isSelected()){
            rbtnAcetona.setEnabled(false);
            btnAceptar.setEnabled(true);
            tempTextF.setEditable(true);
            denTextF.setEditable(true);
            angTextF.setEditable(true);
            wTextF.setEditable(true);
            pbsTextF.setEditable(true);
            pmodOTextF.setEditable(true);
            pmodLTextF.setEditable(true);
            radMenTextF.setEditable(true);
            radMayTextF.setEditable(true);
            viscTextF.setEditable(true);
        }else if(rbtnAcetona.isSelected() && !rbtnEtanol.isSelected()){
            rbtnEtanol.setEnabled(false);
            btnAceptar.setEnabled(true);
            tempTextF.setEditable(true);
            denTextF.setEditable(true);
            angTextF.setEditable(true);
            wTextF.setEditable(true);
            pbsTextF.setEditable(true);
            pmodOTextF.setEditable(true);
            pmodLTextF.setEditable(true);
            radMenTextF.setEditable(true);
            radMayTextF.setEditable(true);
            viscTextF.setEditable(true);
        }else{
            btnAceptar.setEnabled(false);
            rbtnAcetona.setEnabled(true);
            rbtnEtanol.setEnabled(true);
            tempTextF.setEditable(false);
            denTextF.setEditable(false);
            angTextF.setEditable(false);
            wTextF.setEditable(false);
            pbsTextF.setEditable(false);
            pmodOTextF.setEditable(false);
            pmodLTextF.setEditable(false);
            radMenTextF.setEditable(false);
            radMayTextF.setEditable(false);
            viscTextF.setEditable(false);
        }
//        if(rbtnEtanol.isSelected() || rbtnAcetona.isSelected()){
//            btnAceptar.setEnabled(true);
//        }else{
//            btnAceptar.setEnabled(false);
//        }
    }//GEN-LAST:event_rbtnStateChange

    private void textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusLost
            JTextField src = (JTextField) evt.getComponent();
            try{
                if(!src.getText().equals("")){
                    Float.parseFloat(src.getText());
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"No se admiten más que numeros","ERROR",JOptionPane.ERROR_MESSAGE);
                src.setText("");
            }
        
    }//GEN-LAST:event_textFieldFocusLost

    private void delKTextFtextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_delKTextFtextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_delKTextFtextFieldFocusLost

    private void vzTextFtextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vzTextFtextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_vzTextFtextFieldFocusLost

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angLabel;
    private javax.swing.JTextField angTextF;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel delKLabel;
    private javax.swing.JTextField delKTextF;
    private javax.swing.JLabel denLabel;
    private javax.swing.JTextField denTextF;
    private javax.swing.JLabel gravLabel;
    private javax.swing.JTextField gravTextF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcComBox;
    private javax.swing.JComboBox<String> opcCombBox1;
    private javax.swing.JLabel opcLabel;
    private javax.swing.JLabel pbsLabel;
    private javax.swing.JTextField pbsTextF;
    private javax.swing.JLabel pmodLLabel;
    private javax.swing.JTextField pmodLTextF;
    private javax.swing.JLabel pmodOLabel;
    private javax.swing.JTextField pmodOTextF;
    private javax.swing.JLabel radMayLabel;
    private javax.swing.JTextField radMayTextF;
    private javax.swing.JLabel radMenLabel;
    private javax.swing.JTextField radMenTextF;
    private javax.swing.JRadioButton rbtnAcetona;
    private javax.swing.JRadioButton rbtnEtanol;
    private javax.swing.JSeparator sepPrincp;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JTextField tempTextF;
    private javax.swing.JLabel viscLabel;
    private javax.swing.JTextField viscTextF;
    private javax.swing.JLabel vzLabel;
    private javax.swing.JTextField vzTextF;
    private javax.swing.JLabel wLabel;
    private javax.swing.JTextField wTextF;
    // End of variables declaration//GEN-END:variables
}
