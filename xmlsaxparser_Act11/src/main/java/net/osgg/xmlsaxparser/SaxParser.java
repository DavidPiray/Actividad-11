package net.osgg.xmlsaxparser;
 
import java.net.URL;
import java.net.HttpURLConnection;
 
 
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 

public class SaxParser {
	private String url;
	
	public SaxParser(String url) {
		this.url = url;
	}
	   public void parse() {
		
	        try {
	        	
	        	   String urlString = url;
	               URL url1 = new URL(urlString);
	               HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
	               connection.setRequestMethod("GET");
	               connection.setRequestProperty("Accept","application/xml");
	           
	                SAXParserFactory factory = SAXParserFactory.newInstance();
	                SAXParser saxParser = factory.newSAXParser();
	                
	                CustomHandler handler = new CustomHandler();
	                
	                  
	                saxParser.parse(connection.getInputStream(), handler);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}