package com.himedia.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.shop.controller.dto.MemberVO;
import com.himedia.shop.dto.AddressVO;
import com.himedia.shop.util.Db;

public class MemberDao {
	private static MemberDao itc = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public MemberVO getMember(String userid) {
		MemberVO mvo = null;
		
		con = Db.getConnection();
		String sql = "select * from member where userid = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mvo = new MemberVO(rs.getString("userid"), rs.getString("pwd"),
						rs.getString("name"), rs.getString("email"), rs.getString("zip_num"), rs.getString("address1"),
						rs.getString("address2"), rs.getString("phone"),
						rs.getString("useyn"), rs.getTimestamp("indate")
						);
				
				
			}

			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
		}
		
		return mvo;
	}
	public ArrayList<AddressVO> selectAddressByDong(String dong) {
		ArrayList<AddressVO> list = new  ArrayList<AddressVO>();
		con = Db.getConnection();
		String sql = "select * from address where dong like concat('%',?,'%')";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dong);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new AddressVO(rs.getString("zip_num"),rs.getString("sido"),
							rs.getString("gugun"), rs.getString("dong"),
							rs.getString("zip_code"), rs.getString("bunji") ));
				
			}
			
			
		} catch (SQLException e) { e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
		}
		
		return list;
	}
	public int insertMember(MemberVO mvo) {
		int reslut = 0;
		con = Db.getConnection();
		
		String sql = "insert into member (userid , pwd , name, email ,zip_num ,address1 ,address2 ,phone) values(? ,? ,? ,? ,? ,? ,? ,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mvo.getUserid());
			pstmt.setString(2, mvo.getPwd());
			pstmt.setString(3, mvo.getName());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setString(5, mvo.getZip_num());
			pstmt.setString(6, mvo.getAddress1());
			pstmt.setString(7, mvo.getAddress2());
			pstmt.setString(8, mvo.getPhone());
			
			reslut = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
		}
		
		return reslut;
	}
	public void updateMember(MemberVO mvo) {
		con = Db.getConnection();
		
		String sql = "update member set pwd =? , name=? , phone =?, email=? , zip_num =? , address1 = ? , address2 = ? where userid = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mvo.getPwd());
			pstmt.setString(2, mvo.getName());
			pstmt.setString(3, mvo.getPhone());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setString(5, mvo.getZip_num());
			pstmt.setString(6, mvo.getAddress1());
			pstmt.setString(7, mvo.getAddress2());
			pstmt.setString(8, mvo.getUserid());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
		}
		
		
	}
	public void delteMember(String userid) {
		con = Db.getConnection();
		String sql = "update member set useyn = ? where userid = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "N");
			pstmt.setString(2, userid);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Db.close(con, pstmt, rs);
		}
		
		
	}
}
