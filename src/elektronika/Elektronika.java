
package elektronika;

/**
 * Reprezentuje elektronike pojazdu
 * @author kodek7
 */

public class Elektronika {
    //pola
    private Radio radio;
    private SystemNawigacji systemnawigacji;
    private Autoalarm autoalarm;
    
    //konstruktor
    /**
     * Tworzy obiekt klasy Elektronika
     */
    
    public Elektronika()
    {
        radio=new Radio();
        systemnawigacji=new SystemNawigacji();
        autoalarm=new Autoalarm();
        System.out.println("[elektronika.Elektronika] Utworzono obiekt klasy Elektronika");
        
    }//public Elektronika
    
}//public class Elektronika
