/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.jloadpadronmav.ui;

import com.fvgprinc.tools.common.app.configuration.AppGlobalParamConfigFile;
import com.fvgprinc.tools.common.app.configuration.source.ConfigFile;
import com.fvgprinc.tools.common.app.configuration.source.ConfigFileFactory;
import com.fvgprinc.tools.common.datalayer.CommonDALExceptions;
import com.fvgprinc.tools.common.string.MyCommonString;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.SQLException;


/**
 *
 * @author fvargas
 */
public class JfrmPrincLoadPadron extends javax.swing.JFrame {

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(JfrmPrincLoadPadron.class);

    /**
     * Creates new form JfrmPrincLoadPadron
     */
    public JfrmPrincLoadPadron() {
        initComponents();
        initMyComponents();
    }

    private void initGlobalSettings() {
        // leer configuracion
        // Force Init Global Settings
        // Global Settings is a Singleton class to get global 
        // variables (hard coded).
        AppGlobalParamConfigFile.getInstance().setDefTypeConfFile(AppGlobalParamConfigFile.getInstance().getDefTypeConfFile());
        AppGlobalParamConfigFile.getInstance().setCfpath("appProperties.xml");

        // ConfigFileFactory is a singleton class to manipulate globla 
        // data from ConfigFile.
        // The ConfigFile is the gateway to Params objetct and Connection objetc
        ConfigFile xmlCf;
        xmlCf = ConfigFileFactory.getInstance().getConfigFileManager().getConfigurationFile();
        
        String locFileStr = "appProperties.xml";
        URL configURL = this.getClass().getClassLoader().getResource(locFileStr);
        xmlCf.setConfigURL(configURL);
        //System.out.println(xmlCf.getLocationFile());
        xmlCf.setLocation(AppGlobalParamConfigFile.getInstance().getCfpath());

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
        JPathTxtFld = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jDefuncChk = new javax.swing.JCheckBox();
        jNacimChk = new javax.swing.JCheckBox();
        jPadronChk = new javax.swing.JCheckBox();
        jCleanDataChk = new javax.swing.JCheckBox();
        jLoadFileBut = new javax.swing.JButton();
        jLblCantPad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("jfrmPrincipal"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ruta de Archivos:");

        JPathTxtFld.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jDefuncChk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jDefuncChk.setText("jCheckBox1");

        jNacimChk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jNacimChk.setText("jCheckBox1");

        jPadronChk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPadronChk.setText("jCheckBox1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPadronChk)
                    .addComponent(jDefuncChk)
                    .addComponent(jNacimChk))
                .addContainerGap(621, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPadronChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDefuncChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNacimChk)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jCleanDataChk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCleanDataChk.setText("Borrar Datos");

        jLoadFileBut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLoadFileBut.setText("Cargar");
        jLoadFileBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoadFileButActionPerformed(evt);
            }
        });

        jLblCantPad.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(JPathTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jCleanDataChk))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLoadFileBut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLblCantPad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JPathTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCleanDataChk))
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLoadFileBut, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCantPad))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoadFileButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoadFileButActionPerformed
        if (jPadronChk.isSelected()) {
            try {
                String archPadron = (String) SpecificAppProperties.getInstance().getCfgParams().get("nameArchPadron");
                cargarPadron(JPathTxtFld.getText(), archPadron);
            } catch (SQLException ex) {
                logger.fatal(ex.toString(), ex);
            } catch (IOException ex) {
                logger.fatal(ex.toString(), ex);
            } catch (CommonDALExceptions ex) {
                logger.fatal(ex.toString(), ex);
            }
        }
    }//GEN-LAST:event_jLoadFileButActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmPrincLoadPadron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincLoadPadron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincLoadPadron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincLoadPadron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPrincLoadPadron().setVisible(true);
            }
        });
    }

    private void initMyComponents() {
        this.setLocationRelativeTo(null);
        //init database

        initGlobalSettings();

        this.setTitle("Cargar Padron (" + this.getName() + ")");

        JPathTxtFld.setText((String) SpecificAppProperties.getInstance().getCfgParams().get("pathDefaultArchivos"));

        jPadronChk.setText((String) SpecificAppProperties.getInstance().getCfgParams().get("nameArchPadron"));
        jPadronChk.setSelected(true);
        jDefuncChk.setText((String) SpecificAppProperties.getInstance().getCfgParams().get("nameArchDefunc"));
        jNacimChk.setText((String) SpecificAppProperties.getInstance().getCfgParams().get("nameArchNacim"));

        jLblCantPad.setText(MyCommonString.EMPTYSTR);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JPathTxtFld;
    private javax.swing.JCheckBox jCleanDataChk;
    private javax.swing.JCheckBox jDefuncChk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCantPad;
    private javax.swing.JButton jLoadFileBut;
    private javax.swing.JCheckBox jNacimChk;
    private javax.swing.JCheckBox jPadronChk;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void cargarPadron(String pathFile, String fname) throws SQLException, IOException, CommonDALExceptions {
        PadronElecTmpBL padronElecTmpBL = new PadronElecTmpBL();

        PersonaPadronElecBE pp = new PersonaPadronElecBE();
        String scrap;
        int i = 0;
        boolean finCarga = false;

        fname = pathFile + File.separator + fname;

        if (jCleanDataChk.isSelected()) {
            padronElecTmpBL.borraTodo();
        }

        File fi = new File(fname);
        FileInputStream fis = new FileInputStream(fi);
        // Charset charset = Charset.forName("UTF-16");
        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
        String en = isr.getEncoding();
        try (BufferedReader br = new BufferedReader(isr)) {
            // <editor-fold defaultstate="collapsed" desc=" Buffered-reader ">
            String line = MyCommonString.EMPTYSTR;
            while ((line = br.readLine()) != null) {
                // pp.setNumCedula(Integer.parseInt(line.substring(0,9)));
                pp.setNumCedula(Integer.parseInt(line.substring(0, 9)));
                // pp.setCodElectoral(Integer.parseInt(line.substring(9, 6)));
                pp.setCodElectoral(Integer.parseInt(line.substring(9, 15)));
                // pp.setSexo(Integer.parseInt(line.substring(15, 1)));
                scrap = line.substring(15, 16);
                pp.setSexo(Integer.parseInt(line.substring(15, 16)));
                // String scrap = line.substring(16, 8);
                scrap = line.substring(16, 24);
                pp.setFecCaduca(Integer.parseInt(scrap));
                //pp.setNombre(line.substring(24, 30));
                pp.setNombre(line.substring(24, 54).trim());
                // pp.setPrimApellido(line.substring(54, 26));
                pp.setPrimApellido(line.substring(54, 80).trim());
                // pp.setSegApellido(line.substring(80, 26));
                pp.setSegApellido(line.substring(80, 106).trim());
                // pp.setJunta(Integer.parseInt(line.substring(106, 5)));
                pp.setJunta(Integer.parseInt(line.substring(106, 111)));
                // pp.setPosicion(Integer.parseInt(line.substring(111, 3)));
                pp.setPosicion(Integer.parseInt(line.substring(111, 114)));
                if (!padronElecTmpBL.existe(pp.getNumCedula())) {
                    padronElecTmpBL.insertar(pp);
                }
                jLblCantPad.setText(Integer.toString(i++));
            }
            // </editor-fold>
        } catch (Exception ex) {
            logger.fatal(ex.toString(), ex);
        }

    }
}
