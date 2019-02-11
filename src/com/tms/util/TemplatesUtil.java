package com.tms.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tms.model.TaskDetails;
import com.tms.model.UserDetails;

public class TemplatesUtil {

	public static int createNewUser(UserDetails userDetails) {
		int result = 0;
		String sql = null;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try{
			conn = JDBCUtil.getJDBCConnection();
			sql = "INSERT INTO user_details (user_id, user_first_name, user_middle_name, user_last_name, user_designation, date_of_birth, gender, email, phone, "
					+ "mobile, company_name, country, city, pin_code, isActive, user_access_codes, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?)";
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, getCurrentID("user_details", IDCodeEnum.U.toString()));
			preparedStatement.setString(2, userDetails.getFirstName());
			preparedStatement.setString(3, userDetails.getMiddleName());
			preparedStatement.setString(4, userDetails.getLastName());
			preparedStatement.setString(5, userDetails.getDesignation());
			preparedStatement.setDate(6, userDetails.getDateOfBirth());
			preparedStatement.setString(7, userDetails.getGender());
			preparedStatement.setString(8, userDetails.getEmail());
			preparedStatement.setString(9, userDetails.getPhone());
			preparedStatement.setString(10, userDetails.getMobile());
			preparedStatement.setString(11, userDetails.getCompany());
			preparedStatement.setString(12, userDetails.getCountry());
			preparedStatement.setString(13, userDetails.getCity());
			preparedStatement.setString(14, userDetails.getPinCode());
			preparedStatement.setString(15, IsActiveEnum.YES.toString());
			preparedStatement.setString(16, userDetails.getAccessCodes());
			preparedStatement.setString(17, userDetails.getUsername());
			preparedStatement.setString(18, userDetails.getPassword());
			
			preparedStatement.executeUpdate(sql);
			result = 1;
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(preparedStatement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return result;
	}
	
	public static List<UserDetails> getAllUsers(){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		List<UserDetails> listOfUserDetails = new ArrayList<UserDetails>();
		UserDetails userDetails = null;
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT * FROM user_details";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
				userDetails = new UserDetails();
				userDetails.setUserId(rs.getString("user_id"));
				userDetails.setFirstName(rs.getString("user_first_name"));
				userDetails.setMiddleName(rs.getString("user_middle_name"));
				userDetails.setLastName(rs.getString("user_last_name"));
				userDetails.setDesignation(rs.getString("user_designation"));
				userDetails.setDateOfBirth(rs.getDate("date_of_birth"));
				userDetails.setGender(rs.getString("gender"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setPhone(rs.getString("phone"));
				userDetails.setMobile(rs.getString("mobile"));
				userDetails.setCompany(rs.getString("company_name"));
				userDetails.setCountry(rs.getString("country"));
				userDetails.setCity(rs.getString("city"));
				userDetails.setPinCode(rs.getString("pin_code"));
				userDetails.setIsActive(rs.getString("isActive"));
				userDetails.setAccessCodes(rs.getString("user_access_codes"));
				userDetails.setProfilePic(rs.getByte("profile_pic"));
				userDetails.setAboutMe(rs.getString("about_me"));
				userDetails.setUsername(rs.getString("username"));
				userDetails.setPassword(rs.getString("password"));
				userDetails.setLastAccessDate(rs.getDate("last_access_date"));
				userDetails.setCreatedDate(rs.getDate("created_date"));
				userDetails.setUpdatedDate(rs.getDate("updated_date"));
				listOfUserDetails.add(userDetails);
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return listOfUserDetails;
	}
	
	public static UserDetails findUserDetailsByUserName(String userName){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		UserDetails userDetails = new UserDetails(); 
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT * FROM user_details u where u.username='"+userName+"'";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
				userDetails.setUserId(rs.getString("user_id"));
				userDetails.setFirstName(rs.getString("user_first_name"));
				userDetails.setMiddleName(rs.getString("user_middle_name"));
				userDetails.setLastName(rs.getString("user_last_name"));
				userDetails.setDesignation(rs.getString("user_designation"));
				userDetails.setDateOfBirth(rs.getDate("date_of_birth"));
				userDetails.setGender(rs.getString("gender"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setPhone(rs.getString("phone"));
				userDetails.setMobile(rs.getString("mobile"));
				userDetails.setCompany(rs.getString("company_name"));
				userDetails.setCountry(rs.getString("country"));
				userDetails.setCity(rs.getString("city"));
				userDetails.setPinCode(rs.getString("pin_code"));
				userDetails.setIsActive(rs.getString("isActive"));
				userDetails.setAccessCodes(rs.getString("user_access_codes"));
				userDetails.setProfilePic(rs.getByte("profile_pic"));
				userDetails.setAboutMe(rs.getString("about_me"));
				userDetails.setUsername(rs.getString("username"));
				userDetails.setPassword(rs.getString("password"));
				userDetails.setLastAccessDate(rs.getDate("last_access_date"));
				userDetails.setCreatedDate(rs.getDate("created_date"));
				userDetails.setUpdatedDate(rs.getDate("updated_date"));
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return userDetails;
	}
	
	public static UserDetails findUserDetailsByUserId(String userId){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		UserDetails userDetails = new UserDetails(); 
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT * FROM user_details u where u.user_id='"+userId+"'";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
				userDetails.setUserId(rs.getString("user_id"));
				userDetails.setFirstName(rs.getString("user_first_name"));
				userDetails.setMiddleName(rs.getString("user_middle_name"));
				userDetails.setLastName(rs.getString("user_last_name"));
				userDetails.setDesignation(rs.getString("user_designation"));
				userDetails.setDateOfBirth(rs.getDate("date_of_birth"));
				userDetails.setGender(rs.getString("gender"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setPhone(rs.getString("phone"));
				userDetails.setMobile(rs.getString("mobile"));
				userDetails.setCompany(rs.getString("company_name"));
				userDetails.setCountry(rs.getString("country"));
				userDetails.setCity(rs.getString("city"));
				userDetails.setPinCode(rs.getString("pin_code"));
				userDetails.setIsActive(rs.getString("isActive"));
				userDetails.setAccessCodes(rs.getString("user_access_codes"));
				userDetails.setProfilePic(rs.getByte("profile_pic"));
				userDetails.setAboutMe(rs.getString("about_me"));
				userDetails.setUsername(rs.getString("username"));
				userDetails.setPassword(rs.getString("password"));
				userDetails.setLastAccessDate(rs.getDate("last_access_date"));
				userDetails.setCreatedDate(rs.getDate("created_date"));
				userDetails.setUpdatedDate(rs.getDate("updated_date"));
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return userDetails;
	}
	
	public static UserDetails getUsernamePasswordByUserName(String userName){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		UserDetails userDetails = new UserDetails(); 
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT u.username, u.password, u.last_access_date FROM user_details u where u.username='"+userName+"'";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
				userDetails.setUsername(rs.getString("username"));
				userDetails.setPassword(rs.getString("password"));
				userDetails.setLastAccessDate(rs.getDate("last_access_date"));
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return userDetails;
	}
	
	public static int createNewTask(TaskDetails taskDetails) {
		int result = 0;
		String sql = null;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try{
			conn = JDBCUtil.getJDBCConnection();
			sql = "INSERT INTO task_details (task_id, task_name, task_type, task_priority, expected_start_date, expected_start_time, expected_start_meridies, "
					+ "expected_end_date, expected_end_time, expected_end_meridies, description, task_status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, getCurrentID("task_details", IDCodeEnum.Ticket.toString()));
			preparedStatement.setString(2, taskDetails.getTaskName());
			preparedStatement.setString(3, taskDetails.getTaskType());
			preparedStatement.setString(4, taskDetails.getTaskPriority());
			preparedStatement.setDate(5, taskDetails.getExpectedStartDate());
			preparedStatement.setString(6, taskDetails.getExpectedStartTime());
			preparedStatement.setString(7, taskDetails.getExpectedStartMeridies());
			preparedStatement.setDate(8, taskDetails.getExpectedEndDate());
			preparedStatement.setString(9, taskDetails.getExpectedEndTime());
			preparedStatement.setString(10, taskDetails.getExpectedEndMeridies());
			preparedStatement.setString(11, taskDetails.getDescription());
			preparedStatement.setString(12, TaskStatusEnum.OPEN.toString());
			
			preparedStatement.executeUpdate(sql);
			result = 1;
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(preparedStatement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return result;
	}
	
	public static List<TaskDetails> getAllTasks(){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		List<TaskDetails> lisOfTaskDetails = new ArrayList<TaskDetails>(); 
		TaskDetails taskDetails = null;
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT * FROM task_details";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
				taskDetails = new TaskDetails();
				taskDetails.setTaskId(rs.getString("task_id"));
				taskDetails.setTaskName(rs.getString("task_name"));
				taskDetails.setTaskType(rs.getString("task_type"));
				taskDetails.setTaskPriority(rs.getString("task_priority"));
				taskDetails.setExpectedStartDate(rs.getDate("expected_start_date"));
				taskDetails.setExpectedStartTime(rs.getString("expected_start_time"));
				taskDetails.setExpectedStartMeridies(rs.getString("expected_start_meridies"));
				taskDetails.setExpectedEndDate(rs.getDate("expected_end_date"));
				taskDetails.setExpectedEndTime(rs.getString("expected_end_time"));
				taskDetails.setExpectedEndMeridies(rs.getString("expected_end_meridies"));
				taskDetails.setDescription(rs.getString("description"));
				taskDetails.setTaskStatus(rs.getString("task_status"));
				taskDetails.setAssignToUserId(rs.getString("assign_to_user_id"));
				taskDetails.setAssignedDate(rs.getDate("assigned_date"));
				taskDetails.setTicketActivityDate(rs.getDate("ticket_activity_date"));
				taskDetails.setCreatedDate(rs.getDate("created_date"));
				taskDetails.setUpdatedDate(rs.getDate("updated_date"));
				lisOfTaskDetails.add(taskDetails);
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return lisOfTaskDetails;
	}
	
	public static TaskDetails getTaskByTaskId(String taskId){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		TaskDetails taskDetails = new TaskDetails(); 
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT * FROM task_details t where t.task_id='"+taskId+"'";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
				taskDetails.setTaskId(rs.getString("task_id"));
				taskDetails.setTaskName(rs.getString("task_name"));
				taskDetails.setTaskType(rs.getString("task_type"));
				taskDetails.setTaskPriority(rs.getString("task_priority"));
				taskDetails.setExpectedStartDate(rs.getDate("expected_start_date"));
				taskDetails.setExpectedStartTime(rs.getString("expected_start_time"));
				taskDetails.setExpectedStartMeridies(rs.getString("expected_start_meridies"));
				taskDetails.setExpectedEndDate(rs.getDate("expected_end_date"));
				taskDetails.setExpectedEndTime(rs.getString("expected_end_time"));
				taskDetails.setExpectedEndMeridies(rs.getString("expected_end_meridies"));
				taskDetails.setDescription(rs.getString("description"));
				taskDetails.setTaskStatus(rs.getString("task_status"));
				taskDetails.setAssignToUserId(rs.getString("assign_to_user_id"));
				taskDetails.setAssignedDate(rs.getDate("assigned_date"));
				taskDetails.setTicketActivityDate(rs.getDate("ticket_activity_date"));
				taskDetails.setCreatedDate(rs.getDate("created_date"));
				taskDetails.setUpdatedDate(rs.getDate("updated_date"));
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return taskDetails;
	}
	
	public static TaskDetails updateStatus(String taskId, String newStatus){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		TaskDetails taskDetails = new TaskDetails(); 
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "UPDATE task_details SET task_status = '"+newStatus+"' WHERE task_id ='"+taskId+"'";
			rs = statement.executeQuery(sql);
			while(rs.next()){
				taskDetails.setTaskStatus(rs.getString("task_status"));
		      }
		   rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return taskDetails;
	}
	
	public static TaskDetails assignTicket(String taskId, String assignToUserId, String status){
		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		TaskDetails taskDetails = new TaskDetails(); 
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "UPDATE task_details SET assign_to_user_id='"+assignToUserId+"' task_status = '"+status+"' WHERE task_id ='"+taskId+"'";
			rs = statement.executeQuery(sql);
			while(rs.next()){
				taskDetails.setTaskId(rs.getString("task_id"));
				taskDetails.setTaskName(rs.getString("task_name"));
				taskDetails.setTaskType(rs.getString("task_type"));
				taskDetails.setTaskPriority(rs.getString("task_priority"));
				taskDetails.setExpectedStartDate(rs.getDate("expected_start_date"));
				taskDetails.setExpectedStartTime(rs.getString("expected_start_time"));
				taskDetails.setExpectedStartMeridies(rs.getString("expected_start_meridies"));
				taskDetails.setExpectedEndDate(rs.getDate("expected_end_date"));
				taskDetails.setExpectedEndTime(rs.getString("expected_end_time"));
				taskDetails.setExpectedEndMeridies(rs.getString("expected_end_meridies"));
				taskDetails.setDescription(rs.getString("description"));
				taskDetails.setTaskStatus(rs.getString("task_status"));
				taskDetails.setAssignToUserId(rs.getString("assign_to_user_id"));
				taskDetails.setAssignedDate(rs.getDate("assigned_date"));
				taskDetails.setTicketActivityDate(rs.getDate("ticket_activity_date"));
				taskDetails.setCreatedDate(rs.getDate("created_date"));
				taskDetails.setUpdatedDate(rs.getDate("updated_date"));
		      }
		   rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return taskDetails;
	}
	
	private static String getCurrentID(String tableName, String code){
		String codeId = code;

		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT u.id FROM "+tableName+" u ORDER BY u.id DESC LIMIT 1";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
		         Long id  = rs.getLong("id");
		         codeId = codeId+id;
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return codeId;
	}
	
	

}
