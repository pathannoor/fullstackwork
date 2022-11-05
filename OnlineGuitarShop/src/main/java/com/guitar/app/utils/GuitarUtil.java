package com.guitar.app.utils;

import java.util.UUID;

import com.guitar.app.model.BrandNewGuitra;
import com.guitar.app.model.GuitarEntity;

public class GuitarUtil {

	// guitarMaterial, guitarColor, guitarType

	public GuitarEntity createNewGuitar(BrandNewGuitra brandNewGuitra) {
		return new GuitarEntity(getModelNumber(), brandNewGuitra.getGuitarMaterial(), brandNewGuitra.getGuitarColor(),
				brandNewGuitra.getGuitarType());
	}

	private String getModelNumber() {
		UUID uuid = UUID.randomUUID();
		System.out.println("New Model No - " + uuid);
		return uuid.toString();
	}

}
