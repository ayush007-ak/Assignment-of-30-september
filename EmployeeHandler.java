package com.java.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeHandler extends DefaultHandler {
	boolean iempId = false;
	boolean iempName = false;
	boolean iempSalary = false;
	
	
	@Override
	public void startElement(String uri , String localName, String qName, Attributes attributes) throws SAXException{
		if(qName.equalsIgnoreCase("employee")) {
			String empId = attributes.getValue("empId");
			//System.out.println("empId: "+ empId);	
		}else if(qName.equalsIgnoreCase("empId")) {
			iempId=true;
		}
		else if(qName.equalsIgnoreCase("empName")) {
			iempName=true;
		}else if(qName.equalsIgnoreCase("empSalary")) {
			iempSalary = true;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(iempId) {
			System.out.println("iempId:"+new String(ch,start,length));
			iempId=false;
		}else if(iempName) {
			System.out.println("iempName:"+new String(ch,start,length));
			iempName=false;
		}
		else if(iempSalary) {
			System.out.println("iempSalary:"+new String(ch,start,length));
			iempSalary=false;
		}
	}
		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
	     if(qName.equalsIgnoreCase("employee")) {
	    	 System.out.println("End element:"+qName);
	     }
		
	}
	
	

}
