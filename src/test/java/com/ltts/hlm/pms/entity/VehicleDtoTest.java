package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VehicleDtoTest {
	@Test
	public void testVehicleDto() {
		VehicleDto vehicleDto =new VehicleDto();
		
		vehicleDto.setVEHICLE_ID("vehID");
		vehicleDto.setVEHICLE_NAME("vehname");
		
		
		
	
		

		assertNotNull(vehicleDto.getVEHICLE_ID());
		assertNotNull(vehicleDto.getVEHICLE_NAME());
}
}