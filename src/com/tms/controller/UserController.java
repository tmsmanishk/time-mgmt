package com.tms.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.tms.util.TemplatesUtil;

@WebServlet("/user")
public class UserController extends HttpServlet{

	/**
	 * @author Manish Kumar
	 */
	private static final long serialVersionUID = -5510482067662451895L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		String str = null;	
		StringBuffer sb = null;
		JSONObject jObj = null;
		BufferedReader br = null;
		System.out.println("" + req.getParameter("user.firstName"));
		/*try {
			//TemplatesUtil.createNewUser(req);
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}*/
	}
	
	

}
