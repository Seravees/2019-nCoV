package com.qqq.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.qqq.dao.IPersonInfoDao;
import com.qqq.domain.PersonInfo;
import com.qqq.util.Dao;

public class PersonInfoDaoImpl implements IPersonInfoDao{

	@Override
	public int addPersonInfo(PersonInfo personInfo) {
		// TODO Auto-generated method stub
		Connection conn = Dao.conn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"insert into dbo.person_info "
					+ "(name,ID,address,tel,city,mask,temp,hb_go,hb,hb_touch,remarks,wz_go,wz_touch,tz_go,tz_touch,hz_go,hz_touch,time)"
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, personInfo.getName());
			pstmt.setString(2, personInfo.getID());
			pstmt.setString(3, personInfo.getAddress());
			pstmt.setString(4, personInfo.getTel());
			pstmt.setString(5, personInfo.getCity());
			pstmt.setString(6, personInfo.getMask());
			pstmt.setString(7, personInfo.getTemp());
			pstmt.setString(8, personInfo.getHb_go());
			pstmt.setString(9, personInfo.getHb());
			pstmt.setString(10, personInfo.getHb_touch());
			pstmt.setString(11, personInfo.getRemarks());
			pstmt.setString(12, personInfo.getWz_go());
			pstmt.setString(13, personInfo.getWz_touch());
			pstmt.setString(14, personInfo.getTz_go());
			pstmt.setString(15, personInfo.getTz_touch());
			pstmt.setString(16, personInfo.getHz_go());
			pstmt.setString(17, personInfo.getHz_touch());
			pstmt.setString(18, new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
			int rs = pstmt.executeUpdate();
			
			conn.close();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
