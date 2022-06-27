package com.zensar.springbootdemo.totalinfo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
@Component
public class TotalInfoContributor implements InfoContributor{

	@Override
	public void contribute(Builder builder) {
		Map<String, Object> studentDetails = new HashMap<String,Object>();
		studentDetails.put("CreatedBy", "Vishnuvardhan pokala");
		studentDetails.put("ModifiedOn","July22nd2022");
		//builder.withDetails(studentDetails);
		builder.withDetail("Student", studentDetails);
		
		
		
	}

}

