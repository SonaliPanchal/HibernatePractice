package nt.practice.HBOneToOne.domain;

public class PhoneNumber {
	
	private long phone;
	private String numberType;
	private String provider;
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getNumberType() {
		return numberType;
	}
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", numberType=" + numberType + ", provider=" + provider + "]";
	}
	
	
}
