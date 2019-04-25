package com.sf.service;

import net.sf.json.JSONObject;

public interface BatchService {
	public JSONObject createBatch(JSONObject staff); 
	public JSONObject addTransaction(JSONObject staff);
	public JSONObject closeBatch(JSONObject staff);
}
