package net.osgg.xmlsaxparser;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomHandler extends DefaultHandler {
	boolean bid = false;
	boolean bfirstName = false;
    boolean blastName= false;
    boolean bnickName = false;
    boolean bsalary = false;
    //boolean bemailId = false;
    
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //System.out.println("(starts element:" + qName + ")");
        if (qName.equalsIgnoreCase("id")) {
            bid = true;
        }
        
        if (qName.equalsIgnoreCase("firstname")) {
            bfirstName = true;
        }
        if (qName.equalsIgnoreCase("lastname")) {
            blastName = true;
        }
        if (qName.equalsIgnoreCase("nickname")) {
            bnickName = true;
        }
        if (qName.equalsIgnoreCase("salary")) {
            bsalary = true;
        }
        /*   if (qName.equalsIgnoreCase("emailId")) {
        	bemailId = true;
        }
        */
    }
    
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //System.out.println("ends element:" + qName);
    }
    
    public void characters(char ch[], int start, int length) throws SAXException {
        if (bid) {
            System.out.println("Id: " + new String(ch, start, length));
            bid = false;
        }
    	if (bfirstName) {
            System.out.println("Firstname: " + new String(ch, start, length));
            bfirstName = false;
        }
        if (blastName) {
            System.out.println("Lastname: " + new String(ch, start, length));
            blastName = false;
            System.out.println(" ");
        }
        if (bnickName) {
            System.out.println("Nickname: " + new String(ch, start, length));
            bnickName = false;
        }
        if (bsalary) {
            System.out.println("Salary: " + new String(ch, start, length));
            System.out.println(" ");
            bsalary = false;
        }
       /* if (bemailId) {
            System.out.println("emailId: " + new String(ch, start, length));
            System.out.println(" ");
            bemailId = false;
        }
        *
        */
    }
    
}
