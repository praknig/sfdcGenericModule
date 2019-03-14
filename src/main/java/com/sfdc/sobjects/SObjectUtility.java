package com.sfdc.sobjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.Gson;
import com.sfdc.sobjects.wrapper.*;
import com.sfdc.util.Constants;
public class SObjectUtility {

	private String token;
	private String baseURL;
	private HashMap<String, Sobject> mapAPIAndSobject;
	public SObjectUtility(String token, String baseURL)
	{
		this.token = token;
		this.baseURL = baseURL;
		mapAPIAndSobject = new HashMap<String,Sobject>();
		
	}
	
	private void fetchSobject(String authToken)
	{
		String url = baseURL + Constants.SOBJECT_API_URL;
		Request request = new Request.Builder().url(url).header("Authorization", "Bearer " +this.token).build();
		OkHttpClient client = new OkHttpClient();
		
		SobjectWrapper sobject = null;
		Gson gson = new Gson();
		try {
			Response response = client.newCall(request).execute();
			sobject = (SobjectWrapper)gson.fromJson(response.body().string(), SobjectWrapper.class);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		parseSobjectWrapper((ArrayList<Sobject>)sobject.getSobjects());
		
	}
	private void parseSobjectWrapper(ArrayList<Sobject> sobjects)
	{
		for(Sobject sobject:sobjects)
			mapAPIAndSobject.put(sobject.getName(), sobject);
	}
	public ArrayList<String> getSobjectsPropertyValue(PropertyValues.PROPERTY_VALUES property)
	{
		ArrayList<String> aLstPropertyValuesToReturn = new ArrayList<String>();
		if(property == PropertyValues.PROPERTY_VALUES.ALL_SOBJECT_API_NAME)
		{
			for(Sobject sobject:mapAPIAndSobject.values())
			{
				aLstPropertyValuesToReturn.add(sobject.getName());
			}
		}
		else if(property == PropertyValues.PROPERTY_VALUES.CUSTOM_SOBJECT_API_NAME)
		{
			for(Sobject sobject:mapAPIAndSobject.values())
			{
				if(sobject.getCustom())
					aLstPropertyValuesToReturn.add(sobject.getName());
			}
		}
		else if(property == PropertyValues.PROPERTY_VALUES.ALL_SOBJECT_LABEL)
		{
			for(Sobject sobject:mapAPIAndSobject.values())
			{
				
				aLstPropertyValuesToReturn.add(sobject.getLabel());
			}
		}
		else if(property == PropertyValues.PROPERTY_VALUES.CUSTOM_SOBJECT_LABEL)
		{
			for(Sobject sobject:mapAPIAndSobject.values())
			{
				if(sobject.getCustom())
					aLstPropertyValuesToReturn.add(sobject.getLabel());
			}
		}
		return aLstPropertyValuesToReturn;
	}
}
