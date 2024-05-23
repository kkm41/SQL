package JDBCTEST;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.Dbman;
import JDBC.RentDao;
import JDBC.RentDto;

public class Dao {
	private Dao() {}
	private static Dao itc = new Dao();
	public static Dao getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<Dto> selectRent() {
	ArrayList<Dto> list = new ArrayList<Dto>();
	con = Dbman2.getConnection();
		
	String sql = "select*from mbba order by numseq desc";
	
	try {
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			RentDto rdto = new RentDto();
			rdto.setNumseq(rs.getInt("numseq"));
			rdto.setRentdate(rs.getString("rd"));
			rdto.setBnum(rs.getInt("bnum"));
			rdto.setName(rs.getString("name"));
			rdto.setSubject(rs.getString("subject"));
			rdto.setMnum(rs.getInt("mnum"));
			rdto.setRentprice(rs.getInt("rentprice"));
			rdto.setDiscount(rs.getInt("discount"));
			rdto.setAmount(rs.getInt("amount"));
			list.add(rdto);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}finally {
	Dbman.close(con,pstmt,rs);}
	return list;
	}
}
