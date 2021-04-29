package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VesselModelTest {
	@Test
	public void testVesselModel() {
		VesselModel vesselModel =new VesselModel();
		
		vesselModel.setFLUID_LEVEL("high");
		vesselModel.setWIND_DATA("high");
		
		
		
		
		
	
		

		assertNotNull(vesselModel.getFLUID_LEVEL());
		assertNotNull(vesselModel.getWIND_DATA());
	
}
}
