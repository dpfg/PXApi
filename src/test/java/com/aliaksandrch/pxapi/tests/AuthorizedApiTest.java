package com.aliaksandrch.pxapi.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import name.aliaksandrch.px.AuthorizedPxAPI;
import name.aliaksandrch.px.PxApiException;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.UserResource;
import name.aliaksandrch.px.responses.FriendsListResponse;
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
	
	/* User profile test */
	@Test 
	public void getUserProfile() throws PxApiException{
		IQuery q = userResource.getUserProfile();
		UserProfileResponse resp = api.fetch(q);
	}
	@Test 
	public void getUserProfileById() throws PxApiException{
		IQuery q = userResource.getUserProfile("3798");
		UserProfileResponse resp = api.fetch(q);		
	}
	
	@Test 
	public void getUserFriends() throws PxApiException{
		IQuery q = userResource.getUserFriendsList("3798");
		FriendsListResponse resp = api.fetch(q);		
	}
}
