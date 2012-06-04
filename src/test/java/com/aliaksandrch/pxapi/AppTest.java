package com.aliaksandrch.pxapi;

import java.io.IOException;
import java.util.List;

import name.aliaksandrch.px.ApiFactory;
import name.aliaksandrch.px.PxApi;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import name.aliaksandrch.px.FeatureType;
import name.aliaksandrch.px.beans.Photo;
import name.aliaksandrch.px.responses.PhotoResponse;
import name.aliaksandrch.px.responses.PhotosResponse;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;


public class AppTest extends TestCase {
	private PxApi api;
	PhotoResource photoResource;
	
    @Override
	protected void setUp() throws Exception {
    	this.api = ApiFactory.getInstance().buildApi("cTfa4d6rdhNavAudtN9iU7rfgazsbyOgOOzLIY1G");
    	this.photoResource= api.getPhotoResource();
	}

	public static Test suite() {
        return new TestSuite(AppTest.class);
    }
    
    public void testPhoto() throws IOException{
    	IQuery q2 = photoResource.getPhoto(1195521);
        PhotoResponse res = api.fetch(q2);
        assertEquals(106813, res.getPhoto().getUser().getId());
    }

    public void testPhotos() throws IOException{ 
        IQuery q = photoResource.getPhotos(FeatureType.EDITORS).setPage(1);
        PhotosResponse r = api.fetch(q);
        List<Photo> l = r.getPhotos();
        System.out.println(l);
        System.out.println(l.get(0).getImageURL());
    }
}
