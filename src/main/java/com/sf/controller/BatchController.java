package com.sf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.service.BatchService;

import net.sf.json.JSONObject;

@RestController
public class BatchController {

	@Autowired
	BatchService service;
	
	@RequestMapping(method = RequestMethod.PUT, value = "/batch/create")
	@ResponseBody
	public JSONObject createBatch(@RequestBody JSONObject staff) {
		JSONObject output = service.createBatch(staff);
		return output;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/batch/add")
	@ResponseBody
	public JSONObject addTransaction(@RequestBody JSONObject staff) {
		JSONObject output = service.addTransaction(staff);
		return output;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/batch/close")
	@ResponseBody
	public JSONObject close(@RequestBody JSONObject staff) {
		JSONObject output = service.closeBatch(staff);
		return output;
	}
}
