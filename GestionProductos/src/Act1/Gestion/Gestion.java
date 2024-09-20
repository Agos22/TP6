package Act1.Gestion;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 54266
 */
public class Gestion extends javax.swing.JFrame {
    
    private JComboBox<String> categoryComboBox;
    private JTextField nameField;
    private JTextField priceField;
    private JButton addButton;
    private JTable productTable;
    private DefaultTableModel tableModel;
    
    public Gestion() {
        
        setTitle("Gestion de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior con JComboBox y JButton
        
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        
        JLabel titulo = new JLabel("Gestión de Productos");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setForeground(Color.BLUE);
        titulo.setAlignmentX(Component.TOP_ALIGNMENT);
        topPanel.add(titulo);
        
        
        String[] categories = {"Electrónica", "Ropa", "Alimentos"};
        categoryComboBox = new JComboBox<>(categories);
        topPanel.add(new JLabel("Categoría:"));
        topPanel.add(categoryComboBox);

        nameField = new JTextField(10);
        topPanel.add(new JLabel("Nombre:"));
        topPanel.add(nameField);

        priceField = new JTextField(10);
        topPanel.add(new JLabel("Precio:"));
        topPanel.add(priceField);

        addButton = new JButton("Agregar Producto");
        topPanel.add(addButton);

        add(topPanel, BorderLayout.NORTH);

        // Modelo de la tabla y JTable
        tableModel = new DefaultTableModel(new Object[]{"Nombre", "Categoría", "Precio"}, 0);
        productTable = new JTable(tableModel);
        add(new JScrollPane(productTable), BorderLayout.CENTER);
    
                // Acción del botón
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String category = (String) categoryComboBox.getSelectedItem();
                String name = nameField.getText();
                String price = priceField.getText();

                if (name.isEmpty() || price.isEmpty()) {
                    JOptionPane.showMessageDialog(Gestion.this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    tableModel.addRow(new Object[]{name, category, price});
                    nameField.setText("");
                    priceField.setText("");
                }
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
         
    }
};

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
