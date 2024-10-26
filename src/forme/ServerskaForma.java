/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import controller.Controller;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.SkriveniBroj;
import niti.PokreniServer;

/**
 *
 * @author vldmrk
 */
public class ServerskaForma extends javax.swing.JFrame {

    private int skrBr = 0;

    /**
     * Creates new form ServerskaForma
     */
    public ServerskaForma() {
        initComponents();
        startuj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelIme = new javax.swing.JLabel();
        jButtonPokreniIgru = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableServer.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jTableServer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableServer.setMaximumSize(new java.awt.Dimension(100, 200));
        jTableServer.setMinimumSize(new java.awt.Dimension(100, 200));
        jTableServer.setPreferredSize(new java.awt.Dimension(100, 200));
        jTableServer.setRowHeight(70);
        jTableServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableServerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableServer);

        jLabel1.setText("Korisnik:");

        jLabelIme.setText("jLabel3");

        jButtonPokreniIgru.setText("POKRENI IGRU");
        jButtonPokreniIgru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPokreniIgruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIme, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPokreniIgru)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelIme))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButtonPokreniIgru)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPokreniIgruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPokreniIgruActionPerformed
        PokreniServer ps = new PokreniServer();
        ps.start();
        JOptionPane.showMessageDialog(this, "USPESNO", "IGRA JE POKRENUTA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonPokreniIgruActionPerformed

    private void jTableServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServerMouseClicked

    }//GEN-LAST:event_jTableServerMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPokreniIgru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableServer;
    // End of variables declaration//GEN-END:variables

    private void startuj() {
        jButtonPokreniIgru.setEnabled(false);
        jLabelIme.setText(Controller.getInstance().getUser().getIme() + " " + Controller.getInstance().getUser().getPrezime());
        jTableServer.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                TableModel tabela = (TableModel) e.getSource();
                if (Controller.getInstance().getBrojevi().size() >= 3 && tabela.getValueAt(e.getLastRow(), e.getColumn()) != null) {
                    tabela.setValueAt(null, e.getLastRow(), e.getColumn());
                    JOptionPane.showMessageDialog(null, "NE MOZE VISE", "UNEO SI MAKS", JOptionPane.ERROR_MESSAGE);
                } else if (tabela.getValueAt(e.getLastRow(), e.getColumn()) != null) {
                    int red = e.getLastRow();
                    int kol = e.getColumn();
                    SkriveniBroj sb = new SkriveniBroj();
                    sb.setKolona(kol);
                    sb.setRed(red);
                    int vred = (int) tabela.getValueAt(red, kol);
                    sb.setVrednost(vred);
                    Controller.getInstance().dodaj(sb);
                    skrBr++;
                    if (skrBr == 3) {
                        jButtonPokreniIgru.setEnabled(true);
                    }
                }
            }
        });
    }
}
