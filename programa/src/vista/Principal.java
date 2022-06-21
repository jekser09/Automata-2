/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.EstadosCtrl;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import persistencia.Archivo;



/**
 *
 * @author Sala_606
 */
public class Principal extends javax.swing.JFrame {
    
    EstadosCtrl control;
    Archivo archivo;
    String cadena="";
    StringTokenizer st;
    ArrayList<String> correctos;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        archivo=new Archivo();
        correctos=new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEntero = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblNotC = new javax.swing.JLabel();
        lblReal = new javax.swing.JLabel();
        txtEntero = new javax.swing.JTextField();
        txtReal = new javax.swing.JTextField();
        txtNotC = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lbAviso1 = new javax.swing.JLabel();
        lbAviso2 = new javax.swing.JLabel();
        lbAviso3 = new javax.swing.JLabel();
        lbAviso4 = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblPalabra = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("SWRomnt", 1, 14)); // NOI18N
        jLabel5.setText("<html>NOTACION<p>CIENTIFICA<html>");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setAutoscrolls(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("SWRomnt", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDOS");

        lblEntero.setFont(new java.awt.Font("SWRomnt", 1, 14)); // NOI18N
        lblEntero.setText("ENTERO:");

        lblCorreo.setFont(new java.awt.Font("SWRomnt", 1, 14)); // NOI18N
        lblCorreo.setText("CORREO:");

        lblNotC.setFont(new java.awt.Font("SWRomnt", 1, 14)); // NOI18N
        lblNotC.setText("Not.Cientifica:");
        lblNotC.setToolTipText("");
        lblNotC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblNotC.setAutoscrolls(true);

        lblReal.setFont(new java.awt.Font("SWRomnt", 1, 14)); // NOI18N
        lblReal.setText("REAL:");

        txtEntero.setEnabled(false);

        txtReal.setEnabled(false);

        txtNotC.setEnabled(false);

        txtCorreo.setEnabled(false);

        lbAviso1.setForeground(new java.awt.Color(102, 255, 102));

        lbAviso2.setForeground(new java.awt.Color(102, 255, 102));

        lbAviso3.setForeground(new java.awt.Color(102, 255, 102));

        lbAviso4.setForeground(new java.awt.Color(102, 255, 102));

        btnLeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/archivito.png"))); // NOI18N
        btnLeer.setToolTipText("cargar archivo");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proximo.png"))); // NOI18N
        btnSiguiente.setToolTipText("siguiente");
        btnSiguiente.setEnabled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repetir.png"))); // NOI18N
        btnReiniciar.setToolTipText("reiniciar");
        btnReiniciar.setEnabled(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lblPalabra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPalabra.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pregunta.png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(lblCorreo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblReal, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEntero, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(lblNotC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtReal, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtNotC)
                            .addComponent(txtCorreo)
                            .addComponent(txtEntero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAviso3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAviso4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReiniciar)
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(btnLeer))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAyuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEntero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEntero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblReal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAviso3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNotC)
                                        .addComponent(txtNotC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAviso4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLeer)
                    .addComponent(btnReiniciar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        try{
            cadena=archivo.leerArchivo();
            st=new StringTokenizer(cadena," ");
            estadoBotones(false,true,true);
        }catch(NullPointerException nx){
            JOptionPane.showMessageDialog(this,"sin datos, por favor digite informacion\n en el archivo cadenas.txt recien creado\n y reinicie el programa","informacion",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        archivo.borrar();
        archivo=new Archivo();
        lblPalabra.setText("");
        estadoBotones(true,false,false);
        limpiarCampos();
        JOptionPane.showMessageDialog(this,"el archivo validacion.txt tambien ha sido limpiado","ALERTA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String palabra;                
        boolean bandera=false;
        while(bandera!=true){            
            try{       
                palabra=st.nextToken();
                control=new EstadosCtrl(palabra);
                lblPalabra.setText("Validar: "+palabra);
                String entero=control.getEstEnteros().getTipoCadena();
                String real=control.getEstReales().getTipoCadena();
                String notC=control.getEstNotC().getTipoCadena();
                String correo=control.getEstCorreo().getTipoCadena();
                rellenarCampos(entero,real,notC,correo);                
                correctos.add("("+control.getCorrecto()+")");              
                bandera=true;
            }catch(RuntimeException rx){                
                try{                    
                    archivo.escribir(concatenar(correctos));
                    correctos=new ArrayList();
                    cadena=archivo.leerArchivo();
                    st=new StringTokenizer(cadena," ");
                    bandera=false;
                }catch(NullPointerException nx){
                    JOptionPane.showMessageDialog(this,"No hay mas datos","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(this,"señor usuario puede revisar el archivo \n"
                                                       + "validacion.txt para revisar los resultados del analisis","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                    
                    bandera=true;
                }
            }
        }              
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(this,"Este es un programa para validar cadenas de caracteres\n\n\n"
                                      + "aqui podremos validar numeros enteros, numeros reales, notacion cientifica y correo de forma sintactica\n\n\n"
                                      + "aqui algunos ejemplos validos: \n\n"
                                      + "Enteros: +10 || -10 || 10 \n"
                                      + "Reales: +20.4 || -24.9 || 26.2 \n"
                                      + "Notacion cientifica: 60.7E-30 || +50.9E+4 || -80.3E6 \n"
                                      + "Correo: ejemplo_32@ejemplo10.ejemplo || aaaa@aaaa.aa || ejemplo3@ejemplo3.ejemplo","informacion",JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAviso1;
    private javax.swing.JLabel lbAviso2;
    private javax.swing.JLabel lbAviso3;
    private javax.swing.JLabel lbAviso4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEntero;
    private javax.swing.JLabel lblNotC;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblReal;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JTextField txtNotC;
    private javax.swing.JTextField txtReal;
    // End of variables declaration//GEN-END:variables
    private void estadoBotones(boolean bLeer, boolean bReiniciar, boolean bSiguiente){
        btnLeer.setEnabled(bLeer);
        btnReiniciar.setEnabled(bReiniciar);
        btnSiguiente.setEnabled(bSiguiente);
    }
    private void estadoCampos(boolean tEntero, boolean tReal, boolean tNotC, boolean tCorreo){
        txtEntero.setEnabled(tEntero);
        txtReal.setEnabled(tReal);
        txtNotC.setEnabled(tNotC);
        txtCorreo.setEnabled(tCorreo);        
    }
    private void limpiarCampos(){
        txtEntero.setText("");
        txtReal.setText("");
        txtNotC.setText("");
        txtCorreo.setText("");
    }
    private void rellenarCampos(String entero,String real, String notC, String correo){
        txtEntero.setText(entero);
        txtReal.setText(real);
        txtNotC.setText(notC);
        txtCorreo.setText(correo);
    }
    private String concatenar(ArrayList lista){
        String palabra="";       
        for(int i=0;i<lista.size();i++){
            palabra=palabra+(String) lista.get(i)+" ";                    
        }        
        return palabra;
    }
}