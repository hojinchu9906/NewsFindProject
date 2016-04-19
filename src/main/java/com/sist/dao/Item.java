package com.sist.dao;

import javax.xml.bind.annotation.XmlElement;

public class Item {
	private String title;
	private String description;
	private String pubDate;
	
	public String getTitle() {
		return title;
	}
	
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubDate() {
		return pubDate;
	}
	
	@XmlElement
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	
}





















