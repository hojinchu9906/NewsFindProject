package com.sist.news;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MainClass {
	
	public static void main(String[] args){
		try{
			JAXBContext jc=JAXBContext.newInstance(Member.class);
			Unmarshaller um= jc.createUnmarshaller();
			Member member=(Member)um.unmarshal(new File("C:\\Users\\sist\\Documents\\GitStudyDownload\\spring-tool-suite-3.7.3.RELEASE-e4.5.2-win32-x86_64_\\workspace\\NewsFindProject\\src\\main\\java\\com\\sist\\news\\member.xml"));
			
			List<Mlist> list=member.getMlist();
			for(Mlist mlist:list){
				System.out.println(mlist.getName() +" "
								+mlist.getGender() +" "
								+mlist.getAddr() +" "
								+mlist.getTel());
			}
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}





































