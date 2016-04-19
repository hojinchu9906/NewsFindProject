package com.sist.news;

import javax.xml.bind.annotation.XmlElement;

public class Mlist {
	private int no;
	private String name;
	private String gender;
	private String addr;
	private String tel;
	public int getNo() {
		return no;
	}
	
	@XmlElement
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	
	@XmlElement
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	
	@XmlElement
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	
	@XmlElement
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}






























