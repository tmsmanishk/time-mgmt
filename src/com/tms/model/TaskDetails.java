package com.tms.model;

import java.io.Serializable;
import java.sql.Date;

public class TaskDetails implements Serializable{

	/**
	 * @author Manish Kumar
	 */
	private static final long serialVersionUID = -6020027558014069519L;

	private Long id;
	private String taskId;
	private String taskName;
	private String taskType;
	private String taskPriority;
	private Date expectedStartDate;
	private String expectedStartTime;
	private String expectedStartMeridies;
	private Date expectedEndDate;
	private String expectedEndTime;
	private String expectedEndMeridies;
	private String description;
	private String taskStatus;
	private String assignToUserId;
	private Date assignedDate;
	private Date ticketActivityDate;
	private Date createdDate;
	private Date updatedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskPriority() {
		return taskPriority;
	}
	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}
	
	public Date getExpectedStartDate() {
		return expectedStartDate;
	}
	public void setExpectedStartDate(Date expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}
	public Date getExpectedEndDate() {
		return expectedEndDate;
	}
	public void setExpectedEndDate(Date expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}
	public String getExpectedStartTime() {
		return expectedStartTime;
	}
	public void setExpectedStartTime(String expectedStartTime) {
		this.expectedStartTime = expectedStartTime;
	}
	public String getExpectedStartMeridies() {
		return expectedStartMeridies;
	}
	public void setExpectedStartMeridies(String expectedStartMeridies) {
		this.expectedStartMeridies = expectedStartMeridies;
	}
	public String getExpectedEndTime() {
		return expectedEndTime;
	}
	public void setExpectedEndTime(String expectedEndTime) {
		this.expectedEndTime = expectedEndTime;
	}
	public String getExpectedEndMeridies() {
		return expectedEndMeridies;
	}
	public void setExpectedEndMeridies(String expectedEndMeridies) {
		this.expectedEndMeridies = expectedEndMeridies;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getAssignToUserId() {
		return assignToUserId;
	}
	public void setAssignToUserId(String assignToUserId) {
		this.assignToUserId = assignToUserId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}
	public Date getTicketActivityDate() {
		return ticketActivityDate;
	}
	public void setTicketActivityDate(Date ticketActivityDate) {
		this.ticketActivityDate = ticketActivityDate;
	}
	@Override
	public String toString() {
		return "TaskDetails [id=" + id + ", taskId=" + taskId + ", taskName=" + taskName + ", taskType=" + taskType
				+ ", taskPriority=" + taskPriority + ", expectedStartDate=" + expectedStartDate + ", expectedStartTime="
				+ expectedStartTime + ", expectedStartMeridies=" + expectedStartMeridies + ", expectedEndDate="
				+ expectedEndDate + ", expectedEndTime=" + expectedEndTime + ", expectedEndMeridies="
				+ expectedEndMeridies + ", description=" + description + ", taskStatus=" + taskStatus
				+ ", assignToUserId=" + assignToUserId + ", assignedDate=" + assignedDate + ", ticketActivityDate="
				+ ticketActivityDate + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
}
