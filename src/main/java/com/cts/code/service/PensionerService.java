package com.cts.code.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.code.Controller.PensionerDetailController;
import com.cts.code.entity.PensionerDetailEntity;

@Service
public class PensionerService {
	
	@Autowired
	Environment env;
	Logger logger = LoggerFactory.getLogger(PensionerDetailController.class);
	
	static  PensionerDetailEntity pe = new PensionerDetailEntity();
	
	public HashMap<Long,PensionerDetailEntity> getValues() throws Exception{
		InputStream inputStream = getClass().getResourceAsStream("/Detail.csv"); //resource folder se uthara hai
		BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));
		String arr = null;
		HashMap<Long,PensionerDetailEntity> pensionerDetailHashMap = new HashMap<Long,PensionerDetailEntity>();
		
		while((arr=buffer.readLine())!=null) {
			String[] detail = arr.split(",");
			PensionerDetailEntity entity = createEntity(detail);
			pensionerDetailHashMap.put(Long.parseLong(detail[0]), entity);
		}
		buffer.close();
		return pensionerDetailHashMap;
			
			
		}
		
	
	
	public static PensionerDetailEntity createEntity(String[] data) {
		pe.setAdhaarNumber(Long.parseLong(data[0]));
		pe.setName(data[1]);
		pe.setDob(data[2]);
		pe.setPanCard(data[3]);
		pe.setSalaryEarned(Long.parseLong(data[4]));
		pe.setAllowances(Long.parseLong(data[5]));
		pe.setPensionIndicator(data[6]);
		pe.setBankName(data[7]);
		pe.setAccountNumber(Long.parseLong(data[8]));
		pe.setBankIndicator(data[9]);
		
		return new PensionerDetailEntity(pe.getAdhaarNumber(),pe.getName(),pe.getDob(),pe.getPanCard(),
				pe.getSalaryEarned(),pe.getAllowances(),pe.getPensionIndicator(),pe.getBankName(),
				pe.getAccountNumber(),pe.getBankIndicator());
	}
	
			
	
}
