package com.sfdc.login;
import java.io.IOException;

import com.google.gson.Gson;
import com.sfdc.login.LoginRequest.METHOD;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public class GetAutheticationToken {

	private LoginRequest request;
	public GetAutheticationToken(LoginRequest request)
	{
		if(request == null || !request.validateRequest())
			return;
		
		this.request = request;
		
	}
	private String getTokenViaUserNameAndPassword() throws IOException
	{
		RequestBody requestbody = new MultipartBody.Builder()
				.setType(MultipartBody.FORM)
				.addFormDataPart("username", this.request.getUserName())
				.addFormDataPart("password", this.request.getPassword())
				.addFormDataPart("client_id", this.request.getClientID())
				.addFormDataPart("client_secret", this.request.getClientSecret())
				.addFormDataPart("grant_type", "password")
				.build();
		Request request = new Request.Builder().url(this.request.getUrl()).post(requestbody).build();
		OkHttpClient client = new OkHttpClient();
		Response response = client.newCall(request).execute();
		String body = response.body().string();
		return body;
	}
	
	public LoginResponseWrapper getToken() throws IOException
	{
		Gson gson = new Gson();
		LoginResponseWrapper  loginWrapper = null;
		if(this.request.getConnectionMethod() == METHOD.CONNECTED_APP)
		{
			String response = getTokenViaUserNameAndPassword();
			loginWrapper = (LoginResponseWrapper)gson.fromJson(response, LoginResponseWrapper.class);
			
		}
		return loginWrapper;
		
	}
}
