package com.aliaksandrch.pxapi;

import java.util.List;

import name.aliaksandrch.px.AuthorizedPxAPI;
import name.aliaksandrch.px.FeatureType;
import name.aliaksandrch.px.PxApi;
import name.aliaksandrch.px.PxApiException;
import name.aliaksandrch.px.beans.Photo;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.responses.PhotoResponse;
import name.aliaksandrch.px.responses.PhotosResponse;
import junit.framework.TestCase;

public class AuzorizedPxApiTest extends TestCase {
	private PxApi api;
	private PhotoResource photoResource;

	@Override
	protected void setUp() throws Exception {
		// consumer key, consumer secret, access token, token secret
		api = new AuthorizedPxAPI("consumerKey", "consumerSecret", "accessToken","tokenSecret");
		photoResource = api.getPhotoResource();
	}

	public void testPhoto() throws PxApiException {
		IQuery q2 = photoResource.getPhoto(1195521);
		PhotoResponse res = api.fetch(q2);
		assertEquals(106813, res.getPhoto().getUser().getId());
	}

	public void testPhotos() throws PxApiException {
		try {
			IQuery q = photoResource.getPhotos(FeatureType.EDITORS).setPage(1);
			PhotosResponse r = api.fetch(q);
			List<Photo> l = r.getPhotos();
			System.out.println(l);
			System.out.println(l.get(0).getImageURL());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
