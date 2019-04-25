package com.sf.jsonimp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.sf.service.BatchService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@ComponentScan
@Component
public class JsonBatch implements BatchService{
	private JSONObject batchCreate = new JSONObject();
	private JSONArray transactionArray = new JSONArray();
	
	@Override
	public JSONObject createBatch(JSONObject staff) {
		JSONObject json = create(staff);
		return json;
	}

	private JSONObject create(JSONObject staff) {
		
		String jobID = ""+Math.random();
		Date createdDate = new Date(); 
		batchCreate.put("JobID", jobID);
		batchCreate.put("createdDate", createdDate.toString());
		return batchCreate;
	}

	@Override
	public JSONObject addTransaction(JSONObject staff) {
		// TODO Auto-generated method stub
		
		transactionArray.add(staff);
		batchCreate.put("transactionCount", transactionArray.size());
		return batchCreate;
	}

	@Override
	public JSONObject closeBatch(JSONObject staff) {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		json.put("transactionArray", transactionArray);
		createFile(json);
		batchCreate.put("status", "Closed");
		return batchCreate;
	}
	private void createFile(JSONObject json) {
		 try (FileWriter file = new FileWriter(batchCreate.getString("JobID")+".json")) {

	            file.write(json.toString());
	            file.flush();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
