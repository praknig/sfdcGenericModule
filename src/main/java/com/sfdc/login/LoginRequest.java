package com.sfdc.login;

public class LoginRequest {
	
	public enum METHOD{
		CONNECTED_APP
	}
	private String clientID;
	private String clientSecret;
	private String userName;
	private String password;
	private String token;
	private String url;
	private METHOD connectionMethod;
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public METHOD getConnectionMethod() {
		return connectionMethod;
	}
	public void setConnectionMethod(METHOD connectionMethod) {
		this.connectionMethod = connectionMethod;
	}
	
	public boolean validateRequest()
	{
		if(connectionMethod.equals(METHOD.CONNECTED_APP))
		{
			if(this.userName == null || this.password == null || this.url == null || this.clientID == null || this.clientSecret == null)
				return false;
			if(this.userName.length() == 0 || this.password.length() == 0 || this.url.length() == 0 || this.clientID.length() == 0 || this.clientSecret.length() == 0)
				return false;
		}
		return true;
	}
	
	
	

}
