/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.jloadpadronmav.ui;

import com.fvgprinc.tools.common.app.configuration.source.ConfigFile;
import com.fvgprinc.tools.common.app.configuration.source.ConfigFileFactory;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.configuration.HierarchicalConfiguration;
import org.apache.commons.configuration.XMLConfiguration;
/*
import org.edvprinc.tools.common.app.configuration.source.ConfigFile;
import org.edvprinc.tools.common.app.configuration.source.ConfigFileFactory;
*/
/**
 *
 * @author fvargas
 */
public class SpecificAppProperties {
        private static SpecificAppProperties instance;

    static {
        instance = new SpecificAppProperties();
    }

    private XMLConfiguration myConfig;

    private String sourcePath;

    public String getSourcePath() {
        return sourcePath;
    }

    private String targetPath;

    public String getTargetPath() {
        return targetPath;
    }
    
    private HashMap cfgParams;

    public HashMap getCfgParams() {
        return cfgParams;
    }
    
    
    // constructor definition
    private SpecificAppProperties() {
        try {
            //ConfigFile configFile = XMLConfigFileManager.getInstance().getConfigurationFile();
            ConfigFile configFile = ConfigFileFactory.getInstance().getConfigFileManager().getConfigurationFile();
            URL urlFile;
            urlFile = configFile.readURLFile();
            cfgParams = new HashMap();
            this.myConfig = new XMLConfiguration(urlFile);
            this.sourcePath = myConfig.getString("sourcePath");
            this.targetPath = myConfig.getString("targetPath");
            // params
            List<HierarchicalConfiguration> lstParams = myConfig.configurationsAt("params.param");
            System.out.println("Tam params: " + lstParams.size());
            for (HierarchicalConfiguration param : lstParams) {
                String paramId = param.getString("[@id]");
                String value = param.getString("[@value]");
//                System.out.println("paramId =>  " + paramId + " Value => " + value);
                cfgParams.put (paramId, value);
            }
        }   catch (org.apache.commons.configuration.ConfigurationException ex) {
                Logger.getLogger(SpecificAppProperties.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    // variables definition
    public static SpecificAppProperties getInstance() {
        return SpecificAppProperties.instance;
    }
}
