package com.java.dom;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class fetchquizdata {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File xmlFile = new File("D:\\JavaWorkspace\\XmlandDomParsers\\src\\quizfile.xml");
		
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
		
		Document document=documentBuilder.parse(xmlFile);
		//Document document=documentBuilder.parse(is);
		document.getDocumentElement().normalize();
		String rootElement=document.getDocumentElement().getNodeName();
		System.out.println("Root Element:"+rootElement);
		
		NodeList nodeList=document.getElementsByTagName("quiz");
		for(int i=0;i<nodeList.getLength();i++) {
			Node node=nodeList.item(i);
			System.out.println("Node Name:"+node.getNodeName());
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element=(Element)node;
				//System.out.println("Emp Id:"+element.getAttribute("empId"));
				
			    System.out.println("Subject:"+element.getElementsByTagName("subject").item(0).getTextContent());
				System.out.println("question: "+element.getElementsByTagName("question").item(0).getTextContent());
				System.out.println("option1:"+element.getElementsByTagName("option1").item(0).getTextContent());
				System.out.println("option2:"+element.getElementsByTagName("option2").item(0).getTextContent());
				System.out.println("option3:"+element.getElementsByTagName("option3").item(0).getTextContent());
			}
			
		}
		
		
	}
	
	

}
