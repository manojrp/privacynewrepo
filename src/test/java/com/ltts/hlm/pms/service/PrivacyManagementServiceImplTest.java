package com.ltts.hlm.pms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ltts.hlm.pms.dao.PrivacyManagementDao;
import com.ltts.hlm.pms.entity.NotificationJSONObject;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
public class PrivacyManagementServiceImplTest {
	
	@Autowired
	PrivacyManagementServiceImpl privacymanagementserviceimpl;
	@Autowired
	PrivacyManagementService privacymanagement;
	
	@Test
	public void getNotificationPreferenceTest() {
		String customer_id = "123c";
		NotificationJSONObject notificationpreference = privacymanagementserviceimpl.getNotificationPreference(customer_id);
		assertEquals(notificationpreference.getDEFAULTDATA().get(0).getEmail(),true);
	}
	
	
	@Test
	public void getPreferencedata() {
		String cust_id = "123c";
		org.json.JSONObject jsonObject = privacymanagementserviceimpl.getPreferencedata(cust_id);
		//assertEquals(jsonObject.toString()).contains("123D");
		assertNotNull(jsonObject);
		//System.out.println(jsonObject.getJSONObject(cust_id).getJSONArray(cust_id).getJSONObject(0).getJSONArray(cust_id).getJSONArray(0));
	}
	 
	 
	@Test
	public void getTermsandConditionTest() {
		
		String preferencedata = privacymanagementserviceimpl.getTermsAndConditions();
		assertNotNull(preferencedata);
	}
	
	
	
	
	
}