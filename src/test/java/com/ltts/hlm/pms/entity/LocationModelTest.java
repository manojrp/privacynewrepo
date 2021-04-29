package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LocationModelTest {
	@Test
	public void locationModelTest() {
		LocationModel locationModel =new LocationModel();
		locationModel.setALTITUDE("20.999");
		locationModel.setDIRECTION("east");
		locationModel.setGNSS_POSITION("gnss");
		locationModel.setWATER_DEPTH("waterdepth");
		
		
		
		
		
		
		
		
		assertNotNull(locationModel.getALTITUDE());
		assertNotNull(locationModel.getDIRECTION());
		assertNotNull(locationModel.getGNSS_POSITION());
		assertNotNull(locationModel.getWATER_DEPTH());
		
		
		
	}
}
