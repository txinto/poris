/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OPMSFrame.java
 *
 * Created on 20-mar-2009, 17:42:29
 */

package org.gatATAC.poris.systems.OPMSGUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.gatATAC.poris.systems.Cfg;
import org.gatATAC.poris.systems.SNodeLib;
import org.gatATAC.poris.systems.SNodeXML;
import org.gatATAC.poris.systems.SubSystem;
import org.gatATAC.poris.systems.app.PorisGUIAppDelegate;

/**
 *
 * @author osiris
 */
public class OPMSFrame extends javax.swing.JFrame {

    private OPMSXMLFrame xmlSystemFrame = new OPMSXMLFrame();
    private OPMSXMLFrame xmlConfigFrame = new OPMSXMLFrame();
    private final PorisGUIAppDelegate delegate;
    private final boolean showXMLButtons;

    /** Creates new form OPMSFrame */
    public OPMSFrame() {
        this.showXMLButtons=false;
        initComponents();
        delegate=null;
    }

    public OPMSFrame(PorisGUIAppDelegate delegate, boolean showXMLButtons) {
        this.showXMLButtons=showXMLButtons;
        this.delegate = delegate;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        resultPanel = new javax.swing.JPanel();
        filePanel = new javax.swing.JPanel();
        viewModelXMLButton = new javax.swing.JButton();
        viewCfgXMLButton = new javax.swing.JButton();
        changePanel = new javax.swing.JPanel();
        commitButton = new javax.swing.JButton();
        discardButton = new javax.swing.JButton();

        setTitle("OPMS");
        setName("Form"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("OPMS"));
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setLayout(new java.awt.GridBagLayout());

        resultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulo"));
        resultPanel.setName("resultPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout resultPanelLayout = new org.jdesktop.layout.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 500, Short.MAX_VALUE)
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 408, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(resultPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        filePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("File Management"));
        filePanel.setName("filePanel"); // NOI18N

        viewModelXMLButton.setText("View Model XML");
        viewModelXMLButton.setName("viewModelXMLButton"); // NOI18N
        viewModelXMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewModelXMLButtonActionPerformed(evt);
            }
        });

        viewCfgXMLButton.setText("View Cfg XML");
        viewCfgXMLButton.setName("viewCfgXMLButton"); // NOI18N
        viewCfgXMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCfgXMLButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout filePanelLayout = new org.jdesktop.layout.GroupLayout(filePanel);
        filePanel.setLayout(filePanelLayout);
        filePanelLayout.setHorizontalGroup(
            filePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(filePanelLayout.createSequentialGroup()
                .add(51, 51, 51)
                .add(viewModelXMLButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(viewCfgXMLButton)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        filePanelLayout.setVerticalGroup(
            filePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(filePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(filePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(viewModelXMLButton)
                    .add(viewCfgXMLButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(filePanel, gridBagConstraints);
        filePanel.setVisible(this.showXMLButtons);

        changePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Change Management"));
        changePanel.setName("changePanel"); // NOI18N

        commitButton.setText("Commit Changes");
        commitButton.setName("commitButton"); // NOI18N
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        discardButton.setText("Discard Changes");
        discardButton.setName("discardButton"); // NOI18N
        discardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout changePanelLayout = new org.jdesktop.layout.GroupLayout(changePanel);
        changePanel.setLayout(changePanelLayout);
        changePanelLayout.setHorizontalGroup(
            changePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(changePanelLayout.createSequentialGroup()
                .add(51, 51, 51)
                .add(commitButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(discardButton)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        changePanelLayout.setVerticalGroup(
            changePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(changePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(changePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(commitButton)
                    .add(discardButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(changePanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewModelXMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewModelXMLButtonActionPerformed
        if (xmlSystemFrame!=null) xmlSystemFrame.setVisible(true);
    }//GEN-LAST:event_viewModelXMLButtonActionPerformed

    private void viewCfgXMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCfgXMLButtonActionPerformed
        if (xmlConfigFrame!=null) xmlConfigFrame.setVisible(true);
    }//GEN-LAST:event_viewCfgXMLButtonActionPerformed

    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed
        this.delegate.commitChanges();
    }//GEN-LAST:event_commitButtonActionPerformed

    private void discardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardButtonActionPerformed
        this.delegate.discardChanges();
    }//GEN-LAST:event_discardButtonActionPerformed

    private JTabbedPane loadModelIntoResult(SNodeLib modelToLoad, String title, JPanel mainPanel, JTabbedPane resultPanel, int position) {
        // Represent the modelToLoad in the result panel
        SNodeXML modelXML = new SNodeXML(modelToLoad);
        if (resultPanel != null) {
            mainPanel.remove(resultPanel);
        }
        resultPanel = modelXML.getMainPanel();

        java.awt.GridBagConstraints gridBagConstraints;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridx = position;
        gridBagConstraints.gridy = 0;
        resultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(title)); // NOI18N
        mainPanel.add(resultPanel, gridBagConstraints);
        mainPanel.updateUI();
        return resultPanel;
    }

    public void loadSystemIntoResult(SNodeLib systemLib, SubSystem system){
                loadModelIntoResult(systemLib, system.toString(), xmlSystemFrame.mainPanel, xmlSystemFrame.resultPanel, 1);
                xmlSystemFrame.mainPanel.setMinimumSize(new java.awt.Dimension(200, 200));
                xmlSystemFrame.setMinimumSize(new java.awt.Dimension(400, 400));
                xmlSystemFrame.setTitle("XML Model de " + system);
    }
    public void loadConfigIntoResult(SNodeLib configLib, Cfg config){
                loadModelIntoResult(configLib, "Configuracion de " + config, xmlConfigFrame.mainPanel, xmlConfigFrame.resultPanel, 1);
                xmlConfigFrame.mainPanel.setMinimumSize(new java.awt.Dimension(200, 200));
                xmlConfigFrame.setMinimumSize(new java.awt.Dimension(400, 400));
                xmlConfigFrame.setTitle("XML de " + config + " Cfg");
    }

    @Override
    public void hide() {
        if (this.delegate!=null){
            this.delegate.frameWillHide();
        }
        super.hide();
    }

    public OPMSFrame(PorisGUIAppDelegate delegate, boolean showXMLButtons, JPanel changePanel, JButton commitButton, JButton discardButton, JPanel filePanel, JPanel mainPanel, JPanel resultPanel, JButton viewCfgXMLButton, JButton viewModelXMLButton) {
        this.delegate = delegate;
        this.showXMLButtons = showXMLButtons;
        this.changePanel = changePanel;
        this.commitButton = commitButton;
        this.discardButton = discardButton;
        this.filePanel = filePanel;
        this.mainPanel = mainPanel;
        this.resultPanel = resultPanel;
        this.viewCfgXMLButton = viewCfgXMLButton;
        this.viewModelXMLButton = viewModelXMLButton;
    }


    public void loadCfgIntoGUI(Cfg cfgToLoad, String title, JPanel mainPanel, JPanel resultPanel) {
        CfgGUI paramCfgGUI = new CfgGUI(cfgToLoad, true, true);
        if (resultPanel != null) {
            mainPanel.remove(resultPanel);
        }
        resultPanel = paramCfgGUI.getPanel();

        java.awt.GridBagConstraints gridBagConstraints;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        // Represent the modelToLoad in the result panel
        if (!title.equals("-")) {
            resultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(title)); // NOI18N
            mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(title + " OPMS")); // NOI18N
        } else {
            mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(cfgToLoad.getModel().getName() + " OPMS")); // NOI18N
        }
        mainPanel.add(resultPanel, gridBagConstraints);
        mainPanel.updateUI();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPMSFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel changePanel;
    private javax.swing.JButton commitButton;
    private javax.swing.JButton discardButton;
    private javax.swing.JPanel filePanel;
    public javax.swing.JPanel mainPanel;
    public javax.swing.JPanel resultPanel;
    private javax.swing.JButton viewCfgXMLButton;
    private javax.swing.JButton viewModelXMLButton;
    // End of variables declaration//GEN-END:variables

}
