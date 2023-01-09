package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pojo.TcmRelation;
import pojo.TraditionalChineseMedicine;
import util.DbUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Shanghantiaobian {

	/**
	 * 查询所有记录
	 */
	public List<Shanghantiaobian> queryAll(String id,String num ,String content ,String comment) throws SQLException {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		conn = DbUtil.getConnection();

		List<Shanghantiaobian> result =new ArrayList();
		String sql = "SELECT * FROM `shanghantiaobian` where id like CONCAT('%', ?, '%') and num like CONCAT('%', ?, '%') and content like CONCAT('%', ?, '%') and comment like CONCAT('%', ?, '%')";
		pstm = conn.prepareStatement(sql);
		pstm.setString(1,id);
		pstm.setString(2,num);
		pstm.setString(3,content);
		pstm.setString(4,comment);
		rs=pstm.executeQuery();
		while (rs.next()){
			Shanghantiaobian shanghantiaobian = new Shanghantiaobian();
			shanghantiaobian.setId(rs.getInt("id"));
			shanghantiaobian.setNum(rs.getInt("num"));
			shanghantiaobian.setContent(rs.getString("content"));
			shanghantiaobian.setComment(rs.getString("comment"));
		/*	shanghantiaobian.setType(rs.getInt("type"));*/
			/*traditionalChineseMedicine.setBjyw(rs.getString("bjyw"));
			traditionalChineseMedicine.setZhuzhi(rs.getString("zhuzhi"));
			traditionalChineseMedicine.setXingwei(rs.getString("xingwei"));
			traditionalChineseMedicine.setChandi(rs.getString("chandi"));
			traditionalChineseMedicine.setDosage(rs.getString("dosage"));
			traditionalChineseMedicine.setTaboo(rs.getString("taboo"));
			traditionalChineseMedicine.setProcession(rs.getString("processing"));
			traditionalChineseMedicine.setNote(rs.getString("note"));*/
			result.add(traditionalChineseMedicine);
		}
		DbUtil.closeBest(conn, pstm, rs);
		return result;
	}
	/**
	 * @Description:
	 * @Author: wangyang
	 * @Date: 2022/11/11 12:48
	 * @param traditionalChineseMedicine
	 * @param traditionalChineseMedicine
	 **/
	public void add(Shanghantiaobian shanghantiaobian) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;

		conn = DbUtil.getConnection();
		String sql = "insert into shanghantiaobian(id,num,content,comment)values(?,?,?,?)";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1,shanghantiaobian.getNum());
		pstm.setString(2,shanghantiaobian.getName());
		pstm.setString(3,shanghantiaobian.getAlias());
		pstm.setInt(4,shanghantiaobian.getType());
		/*pstm.setString(5,traditionalChineseMedicine.getBjyw());
		pstm.setString(6,traditionalChineseMedicine.getZhuzhi());
		pstm.setString(7,traditionalChineseMedicine.getXingwei());
		pstm.setString(8,traditionalChineseMedicine.getChandi());
		pstm.setString(9,traditionalChineseMedicine.getDosage());
		pstm.setString(10,traditionalChineseMedicine.getTaboo());
		pstm.setString(11,traditionalChineseMedicine.getProcession());
		pstm.setString(12,traditionalChineseMedicine.getNote());*/

		pstm.executeUpdate();

		DbUtil.closeBest(conn, pstm, null);
	}

	public void delete(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		conn = DbUtil.getConnection();

		String sql = "delete from shanghantiaobian where id = ?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1,id);
		pstm.execute();

		DbUtil.closeBest(conn, pstm, rs);

	}


	public void update(Shanghantiaobian shanghantiaobian) throws SQLException {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		conn = DbUtil.getConnection();

		String sql = "update shanghantiaobian set id=? , num=? , content=? , comment=?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1,shanghantiaobian.getId());
		pstm.setString(2,shanghantiaobian.getNum());
		pstm.setString(3,shanghantiaobian.getContent());
		pstm.setInt(4,shanghantiaobian.getComment());
		/*pstm.setString(5,traditionalChineseMedicine.getBjyw());
		pstm.setString(6,traditionalChineseMedicine.getZhuzhi());
		pstm.setString(7,traditionalChineseMedicine.getXingwei());
		pstm.setString(8,traditionalChineseMedicine.getChandi());
		pstm.setString(9,traditionalChineseMedicine.getDosage());
		pstm.setString(10,traditionalChineseMedicine.getTaboo());
		pstm.setString(11,traditionalChineseMedicine.getProcession());
		pstm.setString(12,traditionalChineseMedicine.getNote());
		pstm.setInt(13,traditionalChineseMedicine.getId());*/
		pstm.execute();
		DbUtil.closeBest(conn, pstm, rs);
	}

	public Shanghantiaobian queryById(int id) throws Exception {

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		conn = DbUtil.getConnection();

		Shanghantiaobian tcm = new Shanghantiaobian();
		String sql = "select * from shanghantiaobian where id=?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1,id);
		rs = pstm.executeQuery();
		if (rs.next()){
			tcm.setId(rs.getInt("id"));
			tcm.setNum(rs.getNum("num"));
			tcm.setContent(rs.getString("content"));
			tcm.setComment(rs.getString("comment"));
			/*tcm.setType(rs.getInt("type"));
			tcm.setBjyw(rs.getString("bjyw"));
			tcm.setZhuzhi(rs.getString("zhuzhi"));
			tcm.setXingwei(rs.getString("xingwei"));
			tcm.setChandi(rs.getString("chandi"));
			tcm.setDosage(rs.getString("dosage"));
			tcm.setTaboo(rs.getString("taboo"));
			tcm.setProcession(rs.getString("processing"));
			tcm.setNote(rs.getString("note"));*/

		}

		DbUtil.closeBest(conn, pstm, rs);

		return tcm;

	}


	public TcmRelation detail(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		conn = DbUtil.getConnection();
		String sql = "select * from tcmrelation where tcmid=?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1,id);
		rs = pstm.executeQuery();
		TcmRelation tcmRelation = new TcmRelation();
		while (rs.next()){
			tcmRelation.setId(rs.getInt("id"));
			tcmRelation.setChuchu(rs.getString("chuchu"));
			tcmRelation.setContent(rs.getString("content"));
			tcmRelation.setTcmid(rs.getInt("tcmid"));
		}
		return tcmRelation;
	}

}
