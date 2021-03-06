/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BLL.Categorie;
import BLL.Verzameling;
import BLL.VerzamelingsType;
import Services.CategorieService;
import Services.TypeService;
import Services.VerzamelingService;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import javax.swing.UIManager;

/**
 *
 * @author Ernst
 */
public final class frmVerzamelingBeheer extends javax.swing.JFrame {

    /**
     * Creates new form frmToevoegen
     */
    public frmVerzamelingBeheer() {
        try {
        initComponents();
        
        lblId.setVisible(false);

        pnlEdit.setVisible(false);

        for (VerzamelingsType type : TypeService.GetAllTypes()) {
          cmbType.addItem(new VerzamelingsType(type.getId(), type.getNaam()));
           cmbEditType.addItem(new VerzamelingsType(type.getId(), type.getNaam()));
        }

        
        for (Categorie categorie : CategorieService.GetAllCategories()) {
            cmbCategorie.addItem(new Categorie(categorie.getId(), categorie.getNaam()));
            cmbEditCategorie.addItem(new Categorie(categorie.getId(), categorie.getNaam()));
        }
        
        //vertaling voor JOptionpane
   UIManager.put("OptionPane.cancelButtonText", "Annuleren");
    UIManager.put("OptionPane.noButtonText", "Nee");
    UIManager.put("OptionPane.okButtonText", "Oke");
    UIManager.put("OptionPane.yesButtonText", "Ja");
                
        this.setTitle("Verzamelingen beheren - Verzamelingenbeheer");
        
        ShowEditItems(false);
        RefreshList();
        }
        catch (ExceptionInInitializerError ex)
        {
            JOptionPane.showMessageDialog(null, "Er kan geen verbinding worden gemaakt met de database (" + ex.getMessage() + ").", "Fout", ERROR_MESSAGE);
            System.exit(1);
        }

    }
    
    private void ShowEditItems(boolean result)
    {
        pnlEdit.setVisible(result);
        cmbEditCategorie.setVisible(result);
        cmbEditType.setVisible(result);
        lblType.setVisible(result);
        lblCategorie.setVisible(result);
        btnBewerken.setVisible(result);
        btnVerwijderen.setVisible(result);
        btnCancel.setVisible(result);
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
        lstVerzamelingen = new javax.swing.JList();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtBeschrijving = new javax.swing.JTextField();
        txtNaam = new javax.swing.JTextField();
        cmbCategorie = new javax.swing.JComboBox();
        cmbType = new javax.swing.JComboBox();
        pnlEdit = new java.awt.Panel();
        txtEditBeschrijving = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        txtEditNaam = new javax.swing.JTextField();
        label10 = new java.awt.Label();
        lblId = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        chkEditInBezit = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btnToevoegen = new javax.swing.JButton();
        chkInbezit = new javax.swing.JCheckBox();
        btnBewerken = new javax.swing.JButton();
        btnVerwijderen = new javax.swing.JButton();
        cmbEditType = new javax.swing.JComboBox();
        cmbEditCategorie = new javax.swing.JComboBox();
        lblType = new java.awt.Label();
        lblCategorie = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstVerzamelingen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstVerzamelingen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstVerzamelingenValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstVerzamelingen);

        label1.setText("Naam");

        label2.setText("Beschrijving");

        label4.setVisible(false);

        label5.setText("categorie");

        label6.setText("Type");

        cmbCategorie.setMaximumRowCount(1000);
        cmbCategorie.setToolTipText("");

        cmbType.setMaximumRowCount(1000);

        label9.setText("Naam");

        label10.setText("Beschrijving");

        checkbox1.setLabel("checkbox1");

        chkEditInBezit.setText("In bezit");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bewerken");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblId)
                        .addContainerGap())
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(chkEditInBezit, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEditNaam)
                            .addComponent(txtEditBeschrijving)))))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(txtEditNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditBeschrijving, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkEditInBezit)
                .addContainerGap())
        );

        btnToevoegen.setText("Toevoegen");
        btnToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenActionPerformed(evt);
            }
        });

        chkInbezit.setText("In bezit");

        btnBewerken.setText("Bewerken");
        btnBewerken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBewerkenActionPerformed(evt);
            }
        });

        btnVerwijderen.setText("Verwijderen");
        btnVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerwijderenActionPerformed(evt);
            }
        });

        cmbEditType.setEditable(true);
        cmbEditType.setMaximumRowCount(1000);

        cmbEditCategorie.setEditable(true);
        cmbEditCategorie.setMaximumRowCount(1000);
        cmbEditCategorie.setToolTipText("");

        lblType.setText("Type");

        lblCategorie.setText("categorie");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Verzamelingen beheren");
        jLabel1.setToolTipText("");

        btnCancel.setText("Annuleren");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkInbezit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBeschrijving, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtNaam))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnToevoegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBewerken, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVerwijderen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cmbEditType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEditCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(pnlEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBeschrijving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(chkInbezit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cmbEditCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbEditType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnBewerken)
                                            .addComponent(btnVerwijderen)
                                            .addComponent(btnCancel)))
                                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnToevoegen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed
        if ("".equals(txtNaam.getText())) {
              JOptionPane.showMessageDialog(null, "Naam moet ingevuld zijn", "Vul naam in", ERROR_MESSAGE);
        } else {
            Verzameling verzameling = new Verzameling();
            verzameling.setNaam(txtNaam.getText());
            verzameling.setBeschrijving(txtBeschrijving.getText());
            verzameling.setInBezit(chkInbezit.isSelected());
            
            Categorie categorie = (Categorie)cmbCategorie.getSelectedItem();
            verzameling.setCategoryId(categorie.getId());
           VerzamelingsType type = (VerzamelingsType)cmbType.getSelectedItem();
            verzameling.setTypeId(type.getId());
            VerzamelingService.VerzamelingOpslaan(verzameling);
            ClearTextboxes();
            RefreshList();
        }
    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void lstVerzamelingenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstVerzamelingenValueChanged
        if (lstVerzamelingen.getSelectedIndex() != -1) {
            ShowEditItems(true);
            pnlEdit.validate();
            pnlEdit.repaint();
            
            cmbEditCategorie.setEditable(true);
            cmbEditType.setEditable(true);
            
            Verzameling verzamelingId = (Verzameling) lstVerzamelingen.getSelectedValue();
            int id = verzamelingId.getId();
            Verzameling verzameling = VerzamelingService.GetVerzameling(verzamelingId.getId());

            txtEditNaam.setText(verzameling.getNaam());
            txtEditBeschrijving.setText(verzameling.getBeschrijving());
            chkEditInBezit.setSelected(verzameling.getInBezit());

            Categorie categorie = CategorieService.GetCategorie(verzameling.getCategoryId());
           
            cmbEditCategorie.setSelectedItem(categorie);

            VerzamelingsType type = TypeService.GetType(verzameling.getTypeId());
            cmbEditType.setSelectedItem(type);
            
            cmbEditCategorie.setEditable(false);
           cmbEditType.setEditable(false);

            lblId.setText(Integer.toString(id));

        }

        RefreshList();
    }//GEN-LAST:event_lstVerzamelingenValueChanged

    private void btnBewerkenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBewerkenActionPerformed

        if ("".equals(txtEditNaam.getText()))
        {
            JOptionPane.showMessageDialog(null, "Naam kan niet leeg zijn", "Kan niet bewerken", ERROR_MESSAGE);
        } else {
        
        Verzameling verzameling = new Verzameling();
        verzameling.setId(Integer.parseInt(lblId.getText()));
        verzameling.setNaam(txtEditNaam.getText());
        verzameling.setBeschrijving(txtEditBeschrijving.getText());
        verzameling.setInBezit(chkEditInBezit.isSelected());
        
        Categorie categorie = (Categorie)cmbEditCategorie.getSelectedItem();
        verzameling.setCategoryId(categorie.getId());
            
        VerzamelingsType type = (VerzamelingsType)cmbEditType.getSelectedItem();
        verzameling.setTypeId(type.getId());

        VerzamelingService.VerzamelingOpslaan(verzameling);
        ClearTextboxes();
        ShowEditItems(false);
        RefreshList();
        }
    }//GEN-LAST:event_btnBewerkenActionPerformed

    private void btnVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u de verzameling '" + txtEditNaam.getText() + "' wilt verwijderen uit de lijst verzamelingen?", "Verzameling verwijderen", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION)   
        {
        if ( VerzamelingService.VerzamelingVerwijderen(Integer.parseInt(lblId.getText())))
           {
               ClearTextboxes();
               ShowEditItems(false);
           }
           else
           {
               JOptionPane.showMessageDialog(null, txtEditNaam.getText() + " kan niet verwijderd worden.", "Kan niet verwijderen", ERROR_MESSAGE);
           }

        pnlEdit.setVisible(false);
        pnlEdit.validate();
        pnlEdit.repaint();
        }

        
        RefreshList();
    }//GEN-LAST:event_btnVerwijderenActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ShowEditItems(false);
        lstVerzamelingen.setSelectedValue(null, false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void ClearTextboxes()
    {
        txtBeschrijving.setText("");
        txtEditBeschrijving.setText("");
        txtEditNaam.setText("");
        txtNaam.setText("");
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
            java.util.logging.Logger.getLogger(frmVerzamelingBeheer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerzamelingBeheer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerzamelingBeheer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerzamelingBeheer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerzamelingBeheer().setVisible(true);
            }
        });
    }

    public void RefreshList() {
        lstVerzamelingen.setListData(VerzamelingService.GetAllVerzamelingen().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBewerken;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnToevoegen;
    private javax.swing.JButton btnVerwijderen;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JCheckBox chkEditInBezit;
    private javax.swing.JCheckBox chkInbezit;
    private javax.swing.JComboBox cmbCategorie;
    private javax.swing.JComboBox cmbEditCategorie;
    private javax.swing.JComboBox cmbEditType;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label9;
    private java.awt.Label lblCategorie;
    private javax.swing.JLabel lblId;
    private java.awt.Label lblType;
    private javax.swing.JList lstVerzamelingen;
    private java.awt.Panel pnlEdit;
    private javax.swing.JTextField txtBeschrijving;
    private javax.swing.JTextField txtEditBeschrijving;
    private javax.swing.JTextField txtEditNaam;
    private javax.swing.JTextField txtNaam;
    // End of variables declaration//GEN-END:variables
}
