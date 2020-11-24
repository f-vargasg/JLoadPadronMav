/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.jloadpadronmav.ui;
import com.fvgprinc.tools.common.app.layers.ParamAction;
import com.fvgprinc.tools.common.datalayer.CommonDALExceptions;
import com.fvgprinc.tools.common.datalayer.Mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
import org.edvprinc.tools.common.app.layers.ParamAction;
import org.edvprinc.tools.common.datalayer.CommonDALExceptions;
import org.edvprinc.tools.common.datalayer.Mapper;
*/

/**
 *
 * @author fvargas
 */
public class PadronElecTmpDL extends Mapper {

    private final String tableName = "PADRONELECTTMP";
    private final String selectStm = "Select * "
            + "from " + tableName;
    private final String insertStm = "insert into " + tableName + " ("
            + "NUM_CEDULA,\n" +
            "COD_ELECTORAL,\n" +
            "SEXO,\n" +
            "FEC_CADUCA,\n" +
            "DES_PRIMAPE,\n" +
            "DES_SEGAPE,\n" +
            "DES_NOMBRE,\n" +
            "NUM_JUNTA,\n" +
            "NUM_POSICION" + ") values ("
            + "?, \n" +
            "?, \n" +
            "?, \n" +
            "?, \n" +
            "?, \n" +
            "?, \n" +
            "?, \n" +
            "?, \n" +
            "?)";
    private final String updateStm = "update " + tableName + " set "
            +  "COD_ELECTORAL = ? ,\n" +
                "SEXO = ? ,\n" +
                "FEC_CADUCA = ? ,\n" +
                "DES_PRIMAPE = ? ,\n" +
                "DES_SEGAPE = ? ,\n" +
                "DES_NOMBRE = ? ,\n" +
                "NUM_JUNTA = ? ,\n" +
                "NUM_POSICION = ? "
            + " where "
            + " NUM_CEDULA = ?";
    private final String deleteStm = "delete from " + tableName ;
    
    private final String deleteByPkStm = deleteStm + " where "
            + " NUM_CEDULA = ?";
    
    private final String FindStm = selectStm + " where "
            + " NUM_CEDULA = ?";

    public PadronElecTmpDL() throws SQLException, CommonDALExceptions, com.fvgprinc.tools.common.datalayer.CommonDALExceptions  {
        super(0);
    }

    /*
    public void insertar(PersonaPadronElecBe personaPadronElecBe) throws SQLException {
        PreparedStatement stm;
        String sqlStm = "Insert into " + TABLE_NAME +  " (NUM_CEDULA,\n"
                + "COD_ELECTORAL,\n"
                + "SEXO,\n"
                + "FEC_CADUCA,\n"
                + "DES_PRIMAPE,\n"
                + "DES_SEGAPE,\n"
                + "DES_NOMBRE,\n"
                + "NUM_JUNTA,\n"
                + "NUM_POSICION)"
                + " values (?,?,?,?,\n "
                + "?,?,?,?,\n "
                + "?)";

        stm = this.conn.prepareStatement(sqlStm);
        stm.setLong(1, personaPadronElecBe.getNumCedula());
        stm.setInt(2, personaPadronElecBe.getCodElectoral());
        stm.setInt(3, personaPadronElecBe.getSexo());
        stm.setInt(4, personaPadronElecBe.getFecCaduca());
        stm.setString(5, personaPadronElecBe.getPrimApellido());
        stm.setString(6, personaPadronElecBe.getSegApellido());
        stm.setString(7, personaPadronElecBe.getNombre());
        stm.setInt(8, personaPadronElecBe.getJunta());
        stm.setInt(9, personaPadronElecBe.getPosicion());

        stm.execute();
        stm.close();
    }

    public void borrar(String numCedula) throws SQLException {
        PreparedStatement stm;
        String cond = MyCommonString.EMPTYSTR;
        String sqlStm = "DELETE "
                + "FROM  " + TABLE_NAME;

        if (numCedula.length() > 0) {
            cond = "WHERE NUM_CEDULA = " + MyCommonString.entreChar(numCedula, '\'');
        }
        sqlStm += cond;

        stm = this.conn.prepareStatement(sqlStm);

        stm.execute();
        stm.close();
    }

    boolean existe(long numCedula) throws SQLException {
        String sqlStm;
        boolean res = false;

        sqlStm = "SELECT * \n"
                + "FROM " + TABLE_NAME + " \n"
                + " WHERE NUM_CEDULA = " + Long.toString(numCedula);

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sqlStm);
        res = (rs.next());
        rs.close();
        stm.close();

        return res;
    }
     */
    @Override
    public void insert(ArrayList<ParamAction> paramDLs) throws SQLException {
        doStatement(insertStm, paramDLs);
    }

    @Override
    public void update(ArrayList<ParamAction> paramDLs) throws SQLException {
        doStatement(updateStm, paramDLs);
    }

    @Override
    public void delete(ArrayList<ParamAction> keyFields) throws SQLException {
        doStatement(deleteByPkStm, keyFields);
    }
    
    public void deleteAll() throws SQLException {
        ArrayList<ParamAction> dummyLst = new ArrayList<>();
        doStatement(deleteStm, dummyLst);
    }
    

    @Override
    protected Object doLoad(ResultSet rs) throws SQLException {
        PersonaPadronElecBE persPadronBE = new PersonaPadronElecBE();

        persPadronBE.setNumCedula(rs.getLong("NUM_CEDULA"));
        persPadronBE.setCodElectoral(rs.getInt("COD_ELECTORAL"));
        persPadronBE.setSexo(rs.getInt("SEXO"));
        persPadronBE.setFecCaduca(rs.getInt("FEC_CADUCA"));
        persPadronBE.setPrimApellido(rs.getString("DES_PRIMAPE"));
        persPadronBE.setSegApellido(rs.getString("DES_SEGAPE"));
        persPadronBE.setNombre(rs.getString("DES_NOMBRE"));
        persPadronBE.setJunta(rs.getInt("NUM_JUNTA"));
        persPadronBE.setPosicion(rs.getInt("NUM_POSICION"));

        return persPadronBE;
    }

    @Override
    protected Object doFind(ArrayList<ParamAction> keyFiedls) throws SQLException {
        PersonaPadronElecBE padronElecBE = null;
        ResultSet res = this.doStmReturnData(FindStm, keyFiedls);
        if (res.next()) {
            padronElecBE = (PersonaPadronElecBE) load(res);
        }
        return padronElecBE;
    }

    public ArrayList<PersonaPadronElecBE> list(ArrayList<ParamAction> paramAction) throws SQLException {
        ArrayList<PersonaPadronElecBE> res = new ArrayList<PersonaPadronElecBE>();
        ResultSet rs = doStmReturnData(selectStm, paramAction);
        while (rs.next()) {
            PersonaPadronElecBE padronElecBE = (PersonaPadronElecBE) load(rs);
            res.add(padronElecBE);
        }
        return res;
    }

    boolean existe(long numCedula) throws SQLException {
        ArrayList<ParamAction> lst = new ArrayList<>();
        
        lst.add(new ParamAction(ParamAction.JavaTypes.LONG, numCedula));
        Object res = doFind(lst);
        return (res != null);
    }

}
