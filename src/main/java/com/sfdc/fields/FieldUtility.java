package com.sfdc.fields;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.sfdc.fields.PropertyValue.PROPERTY_VALUES;
import com.sfdc.fields.wrappers.*;
import com.sfdc.util.Constants;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class FieldUtility {

	private String objectAPI,authToken,baseUrl;
	HashMap<String,Field> mapFieldAPIAndField;
	public FieldUtility(String objectAPI, String authToken,String baseUrl)
	{
		this.authToken = authToken;
		this.objectAPI = objectAPI;
		this.baseUrl = baseUrl;
		mapFieldAPIAndField = new HashMap<String,Field>();
		fetchFieldDetails();
	}
	
	private void fetchFieldDetails()
	{
		String url = baseUrl + Constants.SOBJECT_FIELD_API_URL + this.objectAPI + "/describe";
		Request request = new Request.Builder().url(url).header("Authorization", "Bearer " +this.authToken).build();
		OkHttpClient client = new OkHttpClient();
		Gson gson = new Gson();
		try {
			Response response = client.newCall(request).execute();
			String body = response.body().string();
			Fields fields = (Fields)gson.fromJson(body, Fields.class);
			parseFields(fields);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	private void parseFields(Fields fields)
	{
		for(Field field:fields.getFields())
			mapFieldAPIAndField.put(field.getName(), field);
	}
	public ArrayList<String> getFieldProperty(PropertyValue.PROPERTY_VALUES property)
	{
		ArrayList<String> propertyValues = new ArrayList<String>();
		if(property == PROPERTY_VALUES.CUSTOM_FIELD_API_NAME)
		{
			for(Field field:mapFieldAPIAndField.values())
			{
				propertyValues.add(field.getName());
			}
				
		}
		return propertyValues;
	}
	
}
