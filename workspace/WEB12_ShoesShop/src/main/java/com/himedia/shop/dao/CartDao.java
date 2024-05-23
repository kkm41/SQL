package com.himedia.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.himedia.shop.dto.CartVO;
import com.himedia.shop.util.Db;

public class CartDao {
	private CartDao() {}
	private static CartDao itc = new CartDao();
	public static CartDao getInstance() {
		return itc;
	}
	
	Connection con =null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	public void inertCart(CartVO cvo) {
		con = Db.getConnection();
		String sql ="insert into cart (quantity,userid , pseq) values (? , ? , ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cvo.getQuantity());
			pstmt.setString(2, cvo.getUserid());
			pstmt.setInt(3, cvo.getPseq());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
			
		}
		
	
		
	}
	
	public ArrayList<CartVO> selectCart(String userid) {
		ArrayList<CartVO> list = new ArrayList<CartVO>();
		con = Db.getConnection();
		String sql ="select * from cart_view where userid = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//int cseq, String userid, int pseq, String mname, String pname, int quantity, int price2, Timestamp indate
				list.add(new CartVO(
							rs.getInt("cseq"),
							rs.getString("userid"),
							rs.getInt("pseq"),
							rs.getString("mname"),
							rs.getString("pname"),
							rs.getInt("quantity"),
							rs.getInt("price2"),
							rs.getTimestamp("indate")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
			
		}
		return list;
	}

	public void deleteCart(int cseq) {
		con = Db.getConnection();
		String sql ="delete from cart where cseq = ?";
	
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cseq);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
		}
		
	}

	public CartVO getCart(String cseq) {
		CartVO cvo = null;
		con = Db.getConnection();
		String sql ="select * from cart_view where cseq = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(cseq));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cvo =new CartVO(
							rs.getInt("cseq"),
							rs.getString("userid"),
							rs.getInt("pseq"),
							rs.getString("mname"),
							rs.getString("pname"),
							rs.getInt("quantity"),
							rs.getInt("price2"),
							rs.getTimestamp("indate")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
			
		}
		return cvo;
	}
}
