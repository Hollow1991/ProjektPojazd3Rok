
package silnik;

/**
 * Reprezentuje silnik pojazdu
 * @author Mitrut Maciej
 */
public class Silnik {

    private BlokSilnika bloksilnika;
    private GlowicaCylindrow glowicacylindra;
    private KolektorSsacy kolektorssacy;
    private Rozrzad rozrzad;
    
    public Silnik() {
        
        bloksilnika= new BlokSilnika();
        glowicacylindra= new GlowicaCylindrow();
        kolektorssacy= new KolektorSsacy();
        rozrzad= new Rozrzad();
        
        System.out.println("[silnik.Silnik] Utworzono obiekt klasy Silnik");
    }// public Silnik
    
}// public class Silnik
