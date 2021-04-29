package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VehicleupdateDtoTest {
	@Test
	public void testVehicleupdateDto() {
		VehicleupdateDto vehicleupdateDto =new VehicleupdateDto();
		
		vehicleupdateDto.setVEHICLE_ID("123veh");
		
		
		
		
		
	
		

		assertNotNull(vehicleupdateDto.getVEHICLE_ID());
	
}
}
