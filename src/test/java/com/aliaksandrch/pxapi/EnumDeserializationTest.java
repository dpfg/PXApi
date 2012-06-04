package com.aliaksandrch.pxapi;

import name.aliaksandrch.px.FeatureType;

import com.google.gson.Gson;

import junit.framework.TestCase;

public class EnumDeserializationTest extends TestCase {
	private String json = "editors";
	
	enum FlattedEnum{
		PUBLIC;
	}
	
	public void testDeser(){
		Gson gson = new Gson();
		gson.fromJson('"'+FlattedEnum.PUBLIC.toString()+'"', FeatureType.class);
	}

}
