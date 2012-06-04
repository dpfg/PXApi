package com.aliaksandrch.pxapi.tests;

import org.junit.Before;

import name.aliaksandrch.px.ApiFactory;

public class UnauthorizedApiTest extends AbstractApiTest {
	
	@Before
	public void setUp() throws Exception {
		this.api = ApiFactory.getInstance().buildApi("consumerKey");
		this.photoResource = api.getPhotoResource();
	}
	
}
