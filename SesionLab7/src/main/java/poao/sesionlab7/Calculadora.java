/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poao.sesionlab7;
import org.apache.commons.lang3.StringUtils;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/**
 *
 * @author perez
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonMulti = new javax.swing.JButton();
        jButtonDivi = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonAp = new javax.swing.JButton();
        jButtonCp = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA");

        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonSuma.setText("+");
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });

        jButtonResta.setText("-");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });

        jButtonMulti.setText("*");
        jButtonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiActionPerformed(evt);
            }
        });

        jButtonDivi.setText("/");
        jButtonDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiviActionPerformed(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonAp.setText("(");
        jButtonAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApActionPerformed(evt);
            }
        });

        jButtonCp.setText(")");
        jButtonCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCpActionPerformed(evt);
            }
        });

        jButtonDel.setText("Borrar");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonCE.setText("CE");
        jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCEActionPerformed(evt);
            }
        });

        jButtonPunto.setText(".");
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrada)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonMulti, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jButtonResta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jButtonAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//region botones

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        entrada.setText(calcular(entrada.getText()));
    }//GEN-LAST:event_entradaActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        entrada.setText(calcular(entrada.getText()));
        entrada.requestFocus();
    }//GEN-LAST:event_jButtonIgualActionPerformed
    private void ponerEnEntrada(String numero){
        entrada.setText(entrada.getText() + numero);
        entrada.requestFocus();
    }
    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        ponerEnEntrada(jButton0.getText());
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ponerEnEntrada(jButton1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ponerEnEntrada(jButton2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ponerEnEntrada(jButton3.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ponerEnEntrada(jButton4.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ponerEnEntrada(jButton5.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ponerEnEntrada(jButton6.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ponerEnEntrada(jButton7.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ponerEnEntrada(jButton8.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ponerEnEntrada(jButton9.getText());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        ponerEnEntrada(jButtonSuma.getText());
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        ponerEnEntrada(jButtonResta.getText());
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiActionPerformed
        ponerEnEntrada(jButtonMulti.getText());
    }//GEN-LAST:event_jButtonMultiActionPerformed

    private void jButtonDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiviActionPerformed
        ponerEnEntrada(jButtonDivi.getText());
    }//GEN-LAST:event_jButtonDiviActionPerformed

    private void jButtonApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApActionPerformed
        ponerEnEntrada(jButtonAp.getText());
    }//GEN-LAST:event_jButtonApActionPerformed

    private void jButtonCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCpActionPerformed
        ponerEnEntrada(jButtonCp.getText());
    }//GEN-LAST:event_jButtonCpActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        entrada.setText(entrada.getText().substring(0,entrada.getText().length()-1));
        entrada.requestFocus();
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCEActionPerformed
        entrada.setText("");
        entrada.requestFocus();
    }//GEN-LAST:event_jButtonCEActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        ponerEnEntrada(jButtonPunto.getText());
    }//GEN-LAST:event_jButtonPuntoActionPerformed
    
//endregion
    /**
     * @param args the command line arguments
     */
    public String calcular(String expresion){
        try{
        expresion = expresion.replace(" ", "");
        if (StringUtils.countMatches(expresion, "(") != StringUtils.countMatches(expresion, ")")){
            throw new IllegalArgumentException("Paréntesis desiguales");
        }
        for (char e: expresion.toCharArray()){
            if (!Character.isDigit(e) && !"+-*/().".contains(String.valueOf(e))){
                throw new IllegalArgumentException("Caracteres no permitidos");
            }
        }
        if (expresion.contains("(")){
            List<String> dentroParentesis = new ArrayList<>();
            List<String> fueraParentesis = new ArrayList<>();
        
            // Pattern patternDentro = Pattern.compile("\\(([^)]+)\\)");
            // Matcher matcherDentro = patternDentro.matcher(expresion);
        
            // while (matcherDentro.find()) {
            //     dentroParentesis.add(matcherDentro.group(1));
            // }
        
            // Pattern patternFuera = Pattern.compile("[^()]+");
            // Matcher matcherFuera = patternFuera.matcher(expresion);
        
            // while (matcherFuera.find()) {
            //     fueraParentesis.add(matcherFuera.group().replaceAll("[\\(\\)]", ""));
            // }
            String nuevoTrozo="";
            int nivelParentesis=0;
            for (char e: expresion.toCharArray()){
                if (e=='('){
                    nivelParentesis++;
                    if (nivelParentesis>1){
                        nuevoTrozo+=e;
                    }
                    else{
                        fueraParentesis.add(nuevoTrozo);
                        nuevoTrozo="";
                    }
                }else if (e==')'){
                    nivelParentesis--;
                    if (nivelParentesis>0){
                        nuevoTrozo+=e;
                    }else{
                        dentroParentesis.add(nuevoTrozo);
                        nuevoTrozo="";
                    }
                }else{
                    nuevoTrozo+=e;
                }
            }
        
            // Convertir las listas a arrays
            String[] arrayDentro = dentroParentesis.toArray(new String[dentroParentesis.size()]);
            String[] arrayFuera = fueraParentesis.toArray(new String[fueraParentesis.size()]);
            System.out.println("Arrays dentro y fuera");
            System.out.println(Arrays.toString(arrayDentro));
            System.out.println(Arrays.toString(arrayFuera));
            int huecos=0;
            for (String e:arrayFuera){
                if("+-*/".contains(String.valueOf((e.charAt(e.length()-1)))))
                    huecos++;
            }
            if (huecos!=arrayDentro.length)
                throw new IllegalArgumentException("Operador sin operando");
            for (int i=0;i<arrayDentro.length;i++){
                System.out.println("Expresión dentro: "+Pattern.quote("("+arrayDentro[i]+")"));
                expresion = expresion.replaceFirst(Pattern.quote("("+arrayDentro[i]+")"), calcular(arrayDentro[i]));
            }
            System.out.println("Nueva expresión: "+expresion);
        }
        ArrayList<String> elementos = new ArrayList<String>(Arrays.asList(expresion.split("(?<=\\d)(?=[-+*/])|(?<=[-+*/])(?=\\d)")));
        System.out.println("Elementos: "+elementos.toString());
        ArrayList<String> operadores = new ArrayList<String>();
        ArrayList<Double> operandos = new ArrayList<Double>();
        for (String e:elementos){
            if ("+-*/".contains(e)){
                operadores.add(e);
            }else{
                operandos.add(Double.parseDouble(e));
            }
        }
        if (operadores.size() != operandos.size()-1){
            throw new IllegalArgumentException("Operador sin operando");
        }
        while (operadores.contains("*")|| operadores.contains("/")){
            for (int i=0;i<operadores.size();i++){
                if (operadores.get(i).equals("*")){
                    operandos.set(i, operandos.get(i)*operandos.get(i+1));
                    operandos.remove(i+1);
                    operadores.remove(i);
                    i--;
                }else if (operadores.get(i).equals("/")){
                    operandos.set(i, operandos.get(i)/operandos.get(i+1));
                    operandos.remove(i+1);
                    operadores.remove(i);
                    i--;
                }
            }
        }
        while (operadores.size()>0){
            if (operadores.get(0).equals("+")){
                operandos.set(0, operandos.get(0)+operandos.get(1));
            }else if (operadores.get(0).equals("-")){
                operandos.set(0, operandos.get(0)-operandos.get(1));
            }
            operandos.remove(1);
            operadores.remove(0);
        }
        System.out.println("Resultado: "+String.valueOf(operandos.get(0)));
        return operandos.get(0)==operandos.get(0).intValue()?String.valueOf(operandos.get(0).intValue()):String.valueOf(operandos.get(0));
        }catch (Exception e){
            System.err.println(e.toString());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return entrada.getText();
        }
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField entrada;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAp;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonCp;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonDivi;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMulti;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
