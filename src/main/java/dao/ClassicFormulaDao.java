package dao;



import pojo.ClassicFormula;
import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ClassicFormulaDao
 * @Description
 * @Author wangyang
 * @Date 2022/11/11 11:31
 * @Version 1.0
 */
public class ClassicFormulaDao {
    /**
     * 查询所有记录
     */
    
    public List<ClassicFormula> queryAll() throws SQLException {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        conn = DbUtil.getConnection();

        List<ClassicFormula> result =new ArrayList();

        String sql = "select * from classicformula ";
        pstm=conn.prepareStatement(sql);
        rs=pstm.executeQuery();
        while (rs.next()){
            ClassicFormula classicFormula = new ClassicFormula();
            classicFormula.setId(rs.getInt("id"));
            classicFormula.setName(rs.getString("name"));
            classicFormula.setAlias(rs.getString("alias"));
            classicFormula.setUsage1(rs.getString("usage1"));
            classicFormula.setComment(rs.getString("comment"));
            result.add(classicFormula);
        }
        DbUtil.closeBest(conn, pstm, rs);
        return result;
    }


}
