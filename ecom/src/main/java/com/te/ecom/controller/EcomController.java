package com.te.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.ecom.beans.EcomResponse;
import com.te.ecom.beans.Item;
import com.te.ecom.service.EcomService;

@RestController
public class EcomController {
	@Autowired
	private EcomService service;
	
	@GetMapping(path = "/get", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EcomResponse getItemData(int id) {

		EcomResponse response = new EcomResponse();
		Item infoBean = service.getItemData(id);

		if (infoBean != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setBean(infoBean);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure , Data Not found");
		}

		return response;
	}// end of getEmpData
	
	
	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EcomResponse getAllItemDetails() {
		EcomResponse response = new EcomResponse();
		List<Item> infoBeans = service.getAllItems();

		if (infoBeans != null) {
			response.setStatusCode(200);
			response.setMsg("success");
			
		} else {
			response.setStatusCode(400);
			response.setMsg("Datas not found");
		}

		return response;
	}
	
	
	@PostMapping(path = "/add", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EcomResponse  addEmpData(@RequestBody Item infoBean) {
		EcomResponse  response = new EcomResponse ();

		if (service.addItem(infoBean)) {
			response.setStatusCode(200);
			response.setMsg("success , Added the record");
		} else {
			response.setStatusCode(400);
			response.setMsg("Failure , Could not add the data");
		}

		return response;
	}
	
	@DeleteMapping(path = "/delete/{aId}" , produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EcomResponse  deleteEmpData(@PathVariable(name = "aId")int id ) {
		EcomResponse  response = new EcomResponse ();

		if (service.deleteItem(id)) {
			response.setStatusCode(200);
			response.setMsg("success , record deleted");
		} else {
			response.setStatusCode(400);
			response.setMsg("Failure , Could not delete the record");
		}
		return response;
	}

}
