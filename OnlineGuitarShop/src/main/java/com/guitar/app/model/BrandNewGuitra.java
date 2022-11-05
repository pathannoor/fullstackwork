package com.guitar.app.model;

public class BrandNewGuitra {

	private String guitarMaterial;
	private String guitarColor;
	private String guitarType;

	public String getGuitarMaterial() {
		return guitarMaterial;
	}

	public void setGuitarMaterial(String guitarMaterial) {
		this.guitarMaterial = guitarMaterial;
	}

	public String getGuitarColor() {
		return guitarColor;
	}

	public void setGuitarColor(String guitarColor) {
		this.guitarColor = guitarColor;
	}

	public String getGuitarType() {
		return guitarType;
	}

	public void setGuitarType(String guitarType) {
		this.guitarType = guitarType;
	}

	@Override
	public String toString() {
		return "BrandNewGuitra [guitarMaterial=" + guitarMaterial + ", guitarColor=" + guitarColor + ", guitarType="
				+ guitarType + "]";
	}

}