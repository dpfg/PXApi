package com.aliaksandrch.pxapi.tests;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

import name.aliaksandrch.px.FeatureType;
import name.aliaksandrch.px.PxApi;
import name.aliaksandrch.px.PxApiException;
import name.aliaksandrch.px.beans.Category;
import name.aliaksandrch.px.beans.Photo;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.resources.UserResource;
import name.aliaksandrch.px.resources.PhotoResource.SortingType;
import name.aliaksandrch.px.responses.PhotoResponse;
import name.aliaksandrch.px.responses.PhotosResponse;

public class AbstractApiTest {
	protected PxApi api;
	protected PhotoResource photoResource;
	protected UserResource userResource;
	private boolean viewResults = true;

	@Test
	public void getPhoto() throws PxApiException {
		IQuery q2 = photoResource.getPhoto(1195521);
		PhotoResponse res = api.fetch(q2);
		assertEquals(106813, res.getPhoto().getUser().getId());
	}
	
	/* Photos tests */

	@Test
	public void getPhotos() throws PxApiException {
		IQuery q = photoResource.getPhotos(FeatureType.EDITORS);
		checkPhotosResult(q);
	}
	
	@Test
	public void getPhotosFromPage(){
		IQuery q = photoResource.getPhotos(FeatureType.POPULAR).setPage(10);
		checkPhotosResult(q);
	}
	
	@Test
	public void getPhotosOnly(){
		IQuery q = photoResource.getPhotos(FeatureType.POPULAR).setOnly(Category.PEOPLE);
		checkPhotosResult(q);
	}
	
	@Test
	public void getPhotosExclude(){
		IQuery q = photoResource.getPhotos(FeatureType.POPULAR).setExclude(Category.ANIMALS);
		checkPhotosResult(q);
	}
	
	@Test
	public void getPhotosSorted(){
		IQuery q = photoResource.getPhotos(FeatureType.POPULAR).setSort(SortingType.RATING);
		checkPhotosResult(q);
	}
	
	public void getPhotosPerPage(){
		IQuery q = photoResource.getPhotos(FeatureType.POPULAR).setResultsPerPage(1);
		checkPhotosResult(q);
	}

	private void checkPhotosResult(IQuery q) {
		PhotosResponse r = null;
		try {
			r = api.fetch(q);
			List<Photo> l = r.getPhotos();
			if(viewResults)
				System.out.println(l);
			assertTrue(l.size() > 0);
		} catch (PxApiException e) {
			assertTrue(false);
		}
	}

}
