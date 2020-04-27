package com.qqq.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qqq.dao.IPersonInfoDao;
import com.qqq.dao.impl.PersonInfoDaoImpl;
import com.qqq.domain.PersonInfo;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet(name = "/PostServlet", urlPatterns = { "/post" })
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("get");
		
		PersonInfo personInfo = new PersonInfo();
		personInfo.setName(new String(request.getParameter("name").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setID(new String(request.getParameter("ID").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setAddress(new String(request.getParameter("address").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTel(new String(request.getParameter("tel").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setCity(new String(request.getParameter("city").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setMask(new String(request.getParameter("mask").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTemp(new String(request.getParameter("temp").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHb_go(new String(request.getParameter("hb_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHb(new String(request.getParameter("hb").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHb_touch(new String(request.getParameter("hb_touch").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setRemarks(new String(request.getParameter("remarks").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setWz_go(new String(request.getParameter("wz_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setWz_touch(new String(request.getParameter("wz_touch").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTz_go(new String(request.getParameter("tz_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTz_touch(new String(request.getParameter("tz_touch").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHz_go(new String(request.getParameter("hz_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHz_touch(new String(request.getParameter("hz_touch").getBytes("ISO8859_1"), "UTF-8"));

		System.out.println(personInfo.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		
		PersonInfo personInfo = new PersonInfo();
		personInfo.setName(new String(request.getParameter("name").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setID(new String(request.getParameter("ID").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setAddress(new String(request.getParameter("address").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTel(new String(request.getParameter("tel").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setCity(new String(request.getParameter("city").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setMask(new String(request.getParameter("mask").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTemp(new String(request.getParameter("temp").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHb_go(new String(request.getParameter("hb_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHb(new String(request.getParameter("hb").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHb_touch(new String(request.getParameter("hb_touch").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setRemarks(new String(request.getParameter("remarks").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setWz_go(new String(request.getParameter("wz_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setWz_touch(new String(request.getParameter("wz_touch").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTz_go(new String(request.getParameter("tz_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setTz_touch(new String(request.getParameter("tz_touch").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHz_go(new String(request.getParameter("hz_go").getBytes("ISO8859_1"), "UTF-8"));
		personInfo.setHz_touch(new String(request.getParameter("hz_touch").getBytes("ISO8859_1"), "UTF-8"));

		System.out.println(personInfo.toString());
		
		//IPersonInfoDao dao=new PersonInfoDaoImpl();
		//dao.addPersonInfo(personInfo);
		
		request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(
				request, response);
	}

}
