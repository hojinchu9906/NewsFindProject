package com.sist.dao;

import java.io.FileWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MainClass {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("°Ë»ö: ");
		
		String data=scanner.next();
		
		try{
			JAXBContext jc=JAXBContext.newInstance(Rss.class);
			Unmarshaller um=jc.createUnmarshaller();
			
			Rss rss=(Rss)um.unmarshal(new URL("http://newssearch.naver.com/search.naver?where=rss&query="
							+URLEncoder.encode(data, "UTF-8")));
			
			List<Item> list=rss.getChannel().getItem();
			FileWriter fw=new FileWriter("C:\\Users\\sist\\Documents\\GitStudyDownload\\rssnews.txt");
			
			StringBuffer sb=new StringBuffer();
			for(Item item:list){
				System.out.println(item.getTitle() +":::"+ 
									item.getDescription());
				
				String desc=item.getDescription();
				
				sb.append(desc +"\n");
			}
			
			String ss=sb.toString();
			ss=ss.replaceAll("[A-Za-z0-9]", "");
			ss=ss.replace("#", "");
			ss=ss.replace("'", "");
			ss=ss.replace("/", "");
			ss=ss.replace("&", "");
			ss=ss.replace("@", "");
			ss=ss.replace(";", "");
			
			fw.write(ss);
			fw.close();
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
				
	}
}












































