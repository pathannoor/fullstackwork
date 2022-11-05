package com.guitar.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Guitarproduct")
public class GuitarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guitarSrno;

	@Column(nullable = false)
	private String guitarMaterial;

	@Column(nullable = false)
	private String guitarColor;

	@Column(nullable = false)
	private String guitarType;

	@Column(nullable = false)
	private String guitarModalNo;

	public int getGuitarSrno() {
		return guitarSrno;
	}

	public void setGuitarSrno(int guitarSrno) {
		this.guitarSrno = guitarSrno;
	}

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

	public String getGuitarModalNo() {
		return guitarModalNo;
	}

	public void setGuitarModalNo(String guitarModalNo) {
		this.guitarModalNo = guitarModalNo;
	}

	public GuitarEntity(String guitarModalNo, String guitarMaterial, String guitarColor,
			String guitarType) {
		super();
		this.guitarModalNo = guitarModalNo;
		this.guitarMaterial = guitarMaterial;
		this.guitarColor = guitarColor;
		this.guitarType = guitarType;

	}


	@Override
	public String toString() {
		return "GuitarEntity [guitarSrno=" + guitarSrno + ", guitarMaterial=" + guitarMaterial + ", guitarColor="
				+ guitarColor + ", guitarType=" + guitarType + ", guitarModalNo=" + guitarModalNo + "]";
	}

	public GuitarEntity() {
		super();
	}

}
