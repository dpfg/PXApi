package com.aliaksandrch.pxapi.tests;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import name.aliaksandrch.px.FeatureType;
import name.aliaksandrch.px.PxApi;
import name.aliaksandrch.px.PxApiException;
import name.aliaksandrch.px.beans.Photo;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.responses.PhotoResponse;
import name.aliaksandrch.px.responses.PhotosResponse;

public class AbstractApiTest {
	protected PxApi api;
	protected PhotoResource photoResource;

	@Test
	public void getPhoto() throws PxApiException {
		IQuery q2 = photoResource.getPhoto(1195521);
		PhotoResponse res = api.fetch(q2);
		assertEquals(106813, res.getPhoto().getUser().getId());
	}

	@Test
	public void getPhotos() throws PxApiException {
		IQuery q = photoResource.getPhotos(FeatureType.EDITORS).setPage(2);
		PhotosResponse r = api.fetch(q);
		List<Photo> l = r.getPhotos();
		assertTrue(l.size() > 0);
	}

}
