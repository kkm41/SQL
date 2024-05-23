package com.himedia.shop.dto;

public class AddressVO {
	private String zip_num;
	private String sido;
	public AddressVO() {};
	public AddressVO(String zip_num, String sido, String gugun, String dong, String zip_code, String bunji) {
		super();
		this.zip_num = zip_num;
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.zip_code = zip_code;
		this.bunji = bunji;
	}
	private String gugun;
	private String dong;
	private String zip_code;
	private String bunji;
	
	public String getZip_num() {
		return zip_num;
	}
	public void setZip_num(String zip_num) {
		this.zip_num = zip_num;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getBunji() {
		return bunji;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	
	
	
}
