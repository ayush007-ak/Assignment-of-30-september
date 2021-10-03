package com.java.sax;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;



public class reademployee  {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		 InputStream is=ClassLoader.getSystemResourceAsStream("Employee.xml");
	     File xmlFile=new File("D:\\JavaWorkspace\\XmlandDomParsers\\src\\Employee.xml");
	     SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
	     SAXParser saxParser=saxParserFactory.newSAXParser();
	     //saxParser.parse(is, new StudentHandler());
	     saxParser.parse(xmlFile, new EmployeeHandler());
		

	}

}
