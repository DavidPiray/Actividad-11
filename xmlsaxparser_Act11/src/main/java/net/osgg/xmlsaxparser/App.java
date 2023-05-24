package net.osgg.xmlsaxparser;


/**
 * Nombre: David Piray - 7205
*/
public class App 
{
    public static void main( String[] args )
    {
    	 
        SaxParser sp = new SaxParser("https://xmlserver.fly.dev/employees");
        try {
			sp.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}