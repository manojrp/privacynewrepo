package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VehResultTest {
	@Test
	public void testVehResult() {
		VehResult vehResultTest =new VehResult();
		
		vehResultTest.setVEHICLE_ID("veh12");
		vehResultTest.setVEHICLE_NAME("name");
		
		
		
		
		
	
		

		assertNotNull(vehResultTest.getVEHICLE_ID());
		assertNotNull(vehResultTest.getVEHICLE_NAME());
	
}
}
