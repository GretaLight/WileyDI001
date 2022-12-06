package com.greta.shares.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greta.shares.entity.Shares;
import com.greta.shares.service.SharesService;

@RestController
public class SharesResource {

	@Autowired
	private SharesService sharesService;
	
	@GetMapping(path="/shares/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Shares searchShareById(@PathVariable("id") int id) {
		return sharesService.searchSharesById(id);
	}
}
