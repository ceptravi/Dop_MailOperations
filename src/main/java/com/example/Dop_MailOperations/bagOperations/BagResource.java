package com.example.Dop_MailOperations.bagOperations;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;




@RestController
public class BagResource {

	
	@Autowired
	private BagDaoService service;
	
	@Autowired
	private BagRepository bagRepository;
	
	@GetMapping("/1.0/bags")
	
	public List<BagDetails> retrieveAllUsers(){
		return bagRepository.findAll();
	}	
	
	@PostMapping("/1.0/bag/create")
	public ResponseEntity<Object> createBag(@Valid @RequestBody BagDetails bag){
		BagDetails bagDetails=bagRepository.save(bag);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{bag_barcode}").buildAndExpand(bagDetails.getBag_barcode()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
}
