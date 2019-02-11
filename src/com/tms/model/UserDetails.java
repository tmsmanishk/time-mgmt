package com.tms.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

public class UserDetails implements Serializable{

	/**
	 * @author Manish Kumar	 * 
	 */
	private static final long serialVersionUID = -8072023768822773717L;
	
	private Long id;
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String designation;
	private Date dateOfBirth;
	private String gender;
	private String email;
	private String phone;
	private String mobile;
	private String company;
	private String country;
	private String city;
	private String pinCode;
	private String isActive;
	private String accessCodes;
	private Date lastAccessDate;
	private String username;
	private String password;
	private Byte profilePic;
	private String aboutMe;
	private Date createdDate;
	private Date updatedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getAccessCodes() {
		return accessCodes;
	}
	public void setAccessCodes(String accessCodes) {
		this.accessCodes = accessCodes;
	}
	public Date getLastAccessDate() {
		return lastAccessDate;
	}
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Byte getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(Byte profilePic) {
		this.profilePic = profilePic;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
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
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", designation=" + designation + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", mobile=" + mobile
				+ ", company=" + company + ", country=" + country + ", city=" + city + ", pinCode=" + pinCode
				+ ", isActive=" + isActive + ", accessCodes=" + accessCodes + ", lastAccessDate=" + lastAccessDate
				+ ", username=" + username + ", password=" + password + ", profilePic=" + profilePic + ", aboutMe="
				+ aboutMe + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
