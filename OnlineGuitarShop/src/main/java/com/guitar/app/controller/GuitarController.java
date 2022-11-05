package com.guitar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guitar.app.model.BrandNewGuitra;
import com.guitar.app.model.GuitarEntity;
import com.guitar.app.service.GuitarService;
import com.guitar.app.utils.GuitarUtil;

@RestController
public class GuitarController {

	@Autowired
	GuitarService guitarService;

	@GetMapping("/guitarList")
	public List<GuitarEntity> getAllReadyGuitar() {
		return guitarService.getReadyGuitarList();
	}

	@PostMapping("/requestedGuitar")
	public String newGuitarRequest(@RequestBody BrandNewGuitra brandNewGuitra) {
		GuitarUtil ready = new GuitarUtil();
		return guitarService.addGuitarToDB(ready.createNewGuitar(brandNewGuitra));
	}

}
