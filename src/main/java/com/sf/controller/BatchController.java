package com.sf.controller;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.example.staffschema.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	@RequestMapping(method = RequestMethod.PUT, value = "/batch/xmltojson")
	@ResponseBody
	public String xmlToJson(@RequestBody String xmlString) throws JsonProcessingException {
		JSONObject output = new JSONObject();
		JAXBContext jaxbContext;
		String jsonInString="";
		ObjectMapper mapper = new ObjectMapper();
		try
		{
		    jaxbContext = JAXBContext.newInstance(Root.class);             
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    Root employee = (Root) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
		     
		    jsonInString = mapper.writeValueAsString(employee);
		    output.put("json", jsonInString);
		}
		catch (JAXBException e)
		{
		    e.printStackTrace();
		}
		return jsonInString;
	}
}
