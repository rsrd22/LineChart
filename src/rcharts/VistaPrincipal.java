/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcharts;

import Charts.Panel;
import java.util.ArrayList;

/**
 *
 * @author DOLFHANDLER
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private ArrayList<ArrayList<Object[]>> listaDatos;
    private ArrayList<Object[]> datos;

    public VistaPrincipal() {
        initComponents();
        datos = new ArrayList<>();
        listaDatos = new ArrayList<>();
        cargarDatos();
        Panel panel = new Panel(listaDatos, panelGrafico);
        panel.setBounds(0, 0, panelGrafico.getWidth(), panelGrafico.getHeight());
        panelGrafico.add(panel);
    }

    private void cargarDatos() {
        datos = new ArrayList<>();
        datos.add(new Object[]{"Fecha", "Peso"});
        datos.add(new Object[]{"2013", 1000});
        datos.add(new Object[]{"2014", 1170});
        datos.add(new Object[]{"2015", 1500});
        datos.add(new Object[]{"2016", 2000});
        datos.add(new Object[]{"2017", 1400});
        datos.add(new Object[]{"2018", 3000});
        datos.add(new Object[]{"2019", 3500});
        datos.add(new Object[]{"2020", 600});
        datos.add(new Object[]{"2021", 1870});
        listaDatos.add(datos);
        
        datos = new ArrayList<>();
        datos.add(new Object[]{"Fecha", "Peso"});
        datos.add(new Object[]{"2013", 400});
        datos.add(new Object[]{"2014", 500});
        datos.add(new Object[]{"2015", 750});
        datos.add(new Object[]{"2016", 890});
        datos.add(new Object[]{"2017", 1000});
        datos.add(new Object[]{"2018", 950});
        datos.add(new Object[]{"2019", 700});
        datos.add(new Object[]{"2020", 600});
        datos.add(new Object[]{"2021", 980});
        listaDatos.add(datos);
        
        datos = new ArrayList<>();
        datos.add(new Object[]{"Fecha", "Peso"});
        datos.add(new Object[]{"2013", 1200});
        datos.add(new Object[]{"2014", 300});
        datos.add(new Object[]{"2015", 850});
        datos.add(new Object[]{"2016", 2500});
        datos.add(new Object[]{"2017", 1000});
        datos.add(new Object[]{"2018", 1230});
        datos.add(new Object[]{"2019", 1560});
        datos.add(new Object[]{"2020", 1200});
        datos.add(new Object[]{"2021", 1100});
        listaDatos.add(datos);
        
        datos = new ArrayList<>();
        datos.add(new Object[]{"Fecha", "Peso"});
        datos.add(new Object[]{"2013", 1200});
        datos.add(new Object[]{"2014", 300});
        datos.add(new Object[]{"2015", 850});
        datos.add(new Object[]{"2016", 2500});
        datos.add(new Object[]{"2017", 1000});
        datos.add(new Object[]{"2018", 1230});
        datos.add(new Object[]{"2019", 990});
        datos.add(new Object[]{"2020", 1200});
        datos.add(new Object[]{"2021", 1100});
        listaDatos.add(datos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelGrafico.setBackground(new java.awt.Color(255, 0, 0));
        panelGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelGrafico, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
