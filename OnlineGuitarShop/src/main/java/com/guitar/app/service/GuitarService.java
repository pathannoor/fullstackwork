package com.guitar.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guitar.app.model.GuitarEntity;
import com.guitar.app.repository.GuitarRepository;

@Service
public class GuitarService {

	@Autowired
	GuitarRepository guitarRepository;


	public List<GuitarEntity> getReadyGuitarList() {
		return guitarRepository.findAll();
	}

	public String addGuitarToDB(GuitarEntity entity) {
		try {
			if (!containsdata(getReadyGuitarList(), entity)) {
				guitarRepository.save(entity);
				return "This product added to DB.....";
			}
		} catch (Exception e) {
			return "Exception in adding guitar";
		}
		return "This Profuct is already avillable...";
	}

	public boolean containsdata(List<GuitarEntity> list, GuitarEntity entity) {
		return list.stream()
				.anyMatch(e -> e.getGuitarMaterial().equals(entity.getGuitarMaterial())
						&& e.getGuitarColor().equals(entity.getGuitarColor())
						&& e.getGuitarType().equals(entity.getGuitarType()));
	}
}
