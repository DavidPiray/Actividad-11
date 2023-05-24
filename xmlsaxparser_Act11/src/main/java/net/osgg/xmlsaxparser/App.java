package net.osgg.xmlsaxparser;


/**
 * Nombre: John Ichina - 7180
 * Semestre: Quinto 1 Software
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