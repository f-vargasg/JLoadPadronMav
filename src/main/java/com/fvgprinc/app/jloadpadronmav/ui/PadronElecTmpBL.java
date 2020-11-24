/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.jloadpadronmav.ui;

import com.fvgprinc.tools.common.app.layers.ParamAction;
import com.fvgprinc.tools.common.datalayer.CommonDALExceptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author fvargas
 */
public class PadronElecTmpBL {

    public void insertar(PersonaPadronElecBE persPadronBE) throws SQLException, FileNotFoundException, IOException, CommonDALExceptions {
        PadronElecTmpDL padronElecTmpDL = new PadronElecTmpDL();
        ArrayList<ParamAction> lst = new ArrayList<ParamAction>();
        lst.add(new ParamAction(ParamAction.JavaTypes.LONG, persPadronBE.getNumCedula()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getCodElectoral()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getSexo()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getFecCaduca()));
        lst.add(new ParamAction(ParamAction.JavaTypes.STRING, persPadronBE.getPrimApellido()));
        lst.add(new ParamAction(ParamAction.JavaTypes.STRING, persPadronBE.getSegApellido()));
        lst.add(new ParamAction(ParamAction.JavaTypes.STRING, persPadronBE.getNombre()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getJunta()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getPosicion()));
        padronElecTmpDL.insert(lst);
    }

    public void modificar(PersonaPadronElecBE persPadronBE) throws SQLException, FileNotFoundException, IOException, CommonDALExceptions {
        PadronElecTmpDL padronElecTmpDL = new PadronElecTmpDL();
        ArrayList<ParamAction> lst = new ArrayList<ParamAction>();
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getNumCedula()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getCodElectoral()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getSexo()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getFecCaduca()));
        lst.add(new ParamAction(ParamAction.JavaTypes.STRING, persPadronBE.getPrimApellido()));
        lst.add(new ParamAction(ParamAction.JavaTypes.STRING, persPadronBE.getSegApellido()));
        lst.add(new ParamAction(ParamAction.JavaTypes.STRING, persPadronBE.getNombre()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getJunta()));
        lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getPosicion()));
        padronElecTmpDL.update(lst);
    }

    public void borrar(PersonaPadronElecBE persPadronBE) throws SQLException, FileNotFoundException, IOException, CommonDALExceptions {
        PadronElecTmpDL padronElecTmpDL = new PadronElecTmpDL();
        ArrayList<ParamAction> lst = new ArrayList<ParamAction>();
        if (persPadronBE.getNumCedula() > 0) {
            lst.add(new ParamAction(ParamAction.JavaTypes.INTEGER, persPadronBE.getNumCedula()));
        }
        padronElecTmpDL.delete(lst);
    }

    public ArrayList<PersonaPadronElecBE> list(ArrayList<ParamAction> paramAction) throws SQLException, CommonDALExceptions {
        PadronElecTmpDL padronElecTmpDL = new PadronElecTmpDL();

        return padronElecTmpDL.list(paramAction);
    }

    public boolean existe(long numCedula) throws SQLException, CommonDALExceptions {
        boolean res = false;

        PadronElecTmpDL padronElecTmpDL = new PadronElecTmpDL();
        res = padronElecTmpDL.existe(numCedula);
        return res;

    }

    public void borraTodo() throws SQLException, CommonDALExceptions {
        PadronElecTmpDL padronElecTmpDL = new PadronElecTmpDL();
        padronElecTmpDL.deleteAll();
    }
}
