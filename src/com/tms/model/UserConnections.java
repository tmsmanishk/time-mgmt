package com.tms.model;

import java.io.Serializable;
import java.util.Arrays;

public class UserConnections implements Serializable{

	/**
	 * @author Manish Kumar
	 */
	private static final long serialVersionUID = 6760071961210400668L;
	
	private Long id;
	private String userId;
	private String[] followers;
	private Long followersCount;
	private String[] connections;
	private Long connectionsCount;
	private String[] visitors;
	private Long visitorsCount;
	private String[] following;
	private Long following_count;
	private String isFollow;
	private String isConnect;
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
	public String[] getFollowers() {
		return followers;
	}
	public void setFollowers(String[] followers) {
		this.followers = followers;
	}
	public Long getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(Long followersCount) {
		this.followersCount = followersCount;
	}
	public String[] getConnections() {
		return connections;
	}
	public void setConnections(String[] connections) {
		this.connections = connections;
	}
	public Long getConnectionsCount() {
		return connectionsCount;
	}
	public void setConnectionsCount(Long connectionsCount) {
		this.connectionsCount = connectionsCount;
	}
	public String[] getVisitors() {
		return visitors;
	}
	public void setVisitors(String[] visitors) {
		this.visitors = visitors;
	}
	public Long getVisitorsCount() {
		return visitorsCount;
	}
	public void setVisitorsCount(Long visitorsCount) {
		this.visitorsCount = visitorsCount;
	}
	public String[] getFollowing() {
		return following;
	}
	public void setFollowing(String[] following) {
		this.following = following;
	}
	public Long getFollowing_count() {
		return following_count;
	}
	public void setFollowing_count(Long following_count) {
		this.following_count = following_count;
	}
	public String getIsFollow() {
		return isFollow;
	}
	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}
	public String getIsConnect() {
		return isConnect;
	}
	public void setIsConnect(String isConnect) {
		this.isConnect = isConnect;
	}
	@Override
	public String toString() {
		return "UserConnections [id=" + id + ", userId=" + userId + ", followers=" + Arrays.toString(followers)
				+ ", followersCount=" + followersCount + ", connections=" + Arrays.toString(connections)
				+ ", connectionsCount=" + connectionsCount + ", visitors=" + Arrays.toString(visitors)
				+ ", visitorsCount=" + visitorsCount + ", following=" + Arrays.toString(following)
				+ ", following_count=" + following_count + ", isFollow=" + isFollow + ", isConnect=" + isConnect + "]";
	}
}
