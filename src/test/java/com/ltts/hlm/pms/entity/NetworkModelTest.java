package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NetworkModelTest {
	@Test
	public void networkModelTest() {
		NetworkModel NetworkModel =new NetworkModel();
		
		NetworkModel.setPRODUCT_INFO("info");
	
		

		assertNotNull(NetworkModel.getPRODUCT_INFO());
		
		
		
		
		
	}
}
