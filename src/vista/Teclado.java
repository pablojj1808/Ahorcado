/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public class Teclado extends javax.swing.JPanel {

    
    public Teclado() {
        initComponents();
        
        var letras = new ArrayList<>(Arrays.asList(
            'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G',
               'H','J','K','L','Ñ','Z','X','C','V','B','N','M'
        ));
        
        letras.forEach((l) -> {
            add(new JButton(l.toString()));
        });
        System.out.println("creado");
        this.setVisible(true);
         repaint();
        revalidate();
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
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setLayout(new java.awt.GridLayout(3, 10));

        jLabel1.setText("fggr");
        add(jLabel1);
        add(jSpinner1);

        jScrollPane1.setViewportView(jTree1);

        add(jScrollPane1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
