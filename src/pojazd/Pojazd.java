/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojazd;

<<<<<<< HEAD
/**
 *
 * @author Krzysztof Poznakowski
 */
public class Pojazd {
    
=======
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
    eletronika = new Elektronika();
    
    System.out.println("[nadwozie.Lusterko] Utworzono obiekt klasy Lusterko");
    }
>>>>>>> 1f94aafd687eaa5fbe5399048b9dbdf7c8dce95e
}
