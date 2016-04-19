package com.sist.news;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member {
	private List<Mlist> mlist=new ArrayList<>();

	public List<Mlist> getMlist() {
		return mlist;
	}

	@XmlElement
	public void setMlist(List<Mlist> mlist) {
		this.mlist = mlist;
	}
	
	
}























