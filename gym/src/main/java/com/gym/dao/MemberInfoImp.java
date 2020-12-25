package com.gym.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.gym.connection.DBConnection;
import com.gym.model.MemberInfo;

public class MemberInfoImp implements MemberDao {
	DBConnection db = new DBConnection();
	

	@Override
	public int saveMember(MemberInfo memberInfo) {
		int saved =0;
		String query = "insert into gym_db(id,first_Name,last_Name,dateof_birth,location) VALUES(?,?,?,?,?)";
		try(PreparedStatement pa= db.getConnection().prepareStatement(query);){
			pa.setInt(1, memberInfo.getId());
			pa.setString(2, memberInfo.getFirstName());
			pa.setString(3, memberInfo.getLastName());
			pa.setString(4, memberInfo.getDob());
			pa.setString(5, memberInfo.getLocation());
			saved = pa.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return saved;
	}

	@Override
	public int deleteMember(int id) {
		int deleteNum =0;
		String query = "delete from gym_db where id=?";
		try(PreparedStatement pa = db.getConnection().prepareStatement(query);){
			pa.setInt(1, id);
        deleteNum= pa.executeUpdate();

	}catch(Exception e) {
		e.printStackTrace();
	}
		return deleteNum;
	}
	@Override
	public List<MemberInfo> getMembers() {
		List<MemberInfo> list = new ArrayList<>();
		ResultSet rs =null;
		String query = "select * from gym_db";
		try(PreparedStatement pa = db.getConnection().prepareStatement(query);){

			rs = pa.executeQuery();
			
	        while(rs.next()) {
	        	MemberInfo memberInfo =new MemberInfo();
	            memberInfo.setId(rs.getInt("id"));
	            memberInfo.setFirstName(rs.getString("first_Name"));
	            memberInfo.setLastName(rs.getString("last_Name"));
	            memberInfo.setDob(rs.getString("dateof_birth"));
	            memberInfo.setLocation(rs.getString("location"));
	           // System.out.println(rs.getString("first_Name"));
	            
	            list.add(memberInfo);
	          
	        }
	        rs.close();
	        pa.close();
	       
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override ///
	public MemberInfo getMemberById(int id) {
		String query = "select * from gym_db where id =?";
		MemberInfo memberInfo = new MemberInfo();
		try(PreparedStatement pa = db.getConnection().prepareStatement(query);){
			pa.setInt(1, id);
			ResultSet rs = pa.executeQuery();
	        if(rs.next()) {
	        	//MemberInfo memberInfo =new MemberInfo();
	            memberInfo.setId(rs.getInt("id"));
	            memberInfo.setFirstName(rs.getString("first_Name"));
	            memberInfo.setLastName(rs.getString("last_Name"));
	            memberInfo.setDob(rs.getString("dateof_birth"));
	            memberInfo.setLocation(rs.getString("location"));
	           // System.out.println(rs.getString("first_Name"));
	        }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return memberInfo;
	}

	@Override
	public int updateMember(MemberInfo memberInfo) {
		int updated=0;
		String query = "update gym_db set first_Name =?,last_Name =?,dateof_birth=?,location=? where id=?";
		try(PreparedStatement pa = db.getConnection().prepareStatement(query);){
			pa.setString(1, memberInfo.getFirstName());
			pa.setString(2, memberInfo.getLastName());
			pa.setString(3, memberInfo.getDob());
			pa.setString(4, memberInfo.getLocation());
			pa.setInt(5, memberInfo.getId());
			//pa.executeQuery();
			updated = pa.executeUpdate();
			//pa.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return updated;
	}
}


