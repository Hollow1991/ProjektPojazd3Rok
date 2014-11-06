package pojazd;

import nadwozie.*;

/**
 * @author Krzysztof Poznakowski
 */

public class Pojazd {
    
    private Nadwozie nadwozie;
    private Podwozie podwozie;
    private Silnik silnik;
    private Osprzet osprzet;
    private Elektronika elektronika;
    
    public Pojazd() {
        nadwozie = new Nadwozie();
        podwozie = new Podwozie();
        silnik = new Silnik();
        osprzet = new Osprzet();
        elektronika = new Elektronika();    
        System.out.println("[nadwozie.Lusterko] Utworzono obiekt klasy Lusterko");
    }

}
