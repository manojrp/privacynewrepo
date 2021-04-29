package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NotificationPreferenceDTOTest {
	@Test
	public void testNotificationPreferenceDTO() {
		NotificationPreferenceDTO notificationPreferenceDTO =new NotificationPreferenceDTO();
		
		notificationPreferenceDTO.setCUSTOMER_ID("custid");
		notificationPreferenceDTO.setEMAIL(true);
		notificationPreferenceDTO.setID(12L);
		notificationPreferenceDTO.setPUSHNOTIFICATION(true);
		notificationPreferenceDTO.setSMS(true);
	
		

		assertNotNull(notificationPreferenceDTO.getCUSTOMER_ID());
		assertNotNull(notificationPreferenceDTO.getEMAIL());
		assertNotNull(notificationPreferenceDTO.getID());
		assertNotNull(notificationPreferenceDTO.getPUSHNOTIFICATION());
		assertNotNull(notificationPreferenceDTO.getSMS());
		
		
		
		
		
	}
}
