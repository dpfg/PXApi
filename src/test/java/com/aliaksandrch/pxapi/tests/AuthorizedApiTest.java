package com.aliaksandrch.pxapi.tests;

import org.junit.Before;

import name.aliaksandrch.px.AuthorizedPxAPI;

public class AuthorizedApiTest extends AbstractApiTest{
	
	@Before
	public void setUp() throws Exception {
		api = new AuthorizedPxAPI("consumerKey", "consumerSecret", "accessToken","tokenSecret");
		photoResource = api.getPhotoResource();
	}
}
