package com.aliaksandrch.pxapi.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import name.aliaksandrch.px.AuthorizedPxAPI;
import name.aliaksandrch.px.PxApiException;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.UserResource;
import name.aliaksandrch.px.responses.PhotoResponse;
import name.aliaksandrch.px.responses.UserProfileResponse;

public class AuthorizedApiTest extends AbstractApiTest{
	
	@Before
	public void setUp() throws Exception {
		api = new AuthorizedPxAPI("consumerKey", "consumerSecret", "accessToken","tokenSecret");
		photoResource = api.getPhotoResource();
		userResource = api.getUserResource();
	}
	
	@Test
	public void vote() throws PxApiException{
		IQuery query = photoResource.vote(8085532, 1);
		PhotoResponse resp = api.fetch(query);
		assertEquals(8085532, resp.getPhoto().getUser().getId());
	}
	
	@Test 
	public void getUserProfile() throws PxApiException{
		IQuery q = userResource.getUserProfile();
		UserProfileResponse resp = api.fetch(q);
		System.out.println(resp.getUser());
	}
}
