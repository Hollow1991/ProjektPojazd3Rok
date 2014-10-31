/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podwozie;

import podwozie.ukladHamulcowy.KlocekHamulcowy;
import podwozie.ukladHamulcowy.PedalHamulca;

/**
 *
 * @author Skamenialo
 */
public class Podwozie {
    private KlocekHamulcowy[] klocekHamulcowy;
    private TarczaHamulca[] tarczaHamulca;
    private PedalHamulca pedalHamulca;
    private Kierownica kierownica;
    private KoncowkaDrazkaKierowniczego[] koncowkaDrazkaKierowniczego;
    private Zwrotnica zwrotnica;
    private Amortyzator[] amortyzator;
    private Wahacz[] wahacz;
    private Sprezyna[] sprezyna;
    
    public Podwozie(){
        klocekHamulcowy=new KlocekHamulcowy[8];
        for(int i=0;i<8;i++){
            klocekHamulcowy[i]=new KlocekHamulcowy();
        }
        tarczaHamulca=new TarczaHamulca[4];
        amortyzator=new Amortyzator[4];
        wahacz=new Wahacz[4];
        sprezyna=new Sprezyna[4];
        for(int i=0;i<4;i++){
            tarczaHamulca[i]=new TarczaHamulca();
            amortyzator[i]=new Amortyzator();
            wahacz[i]=new Wahacz();
            sprezyna[i]=new Sprezyna();
        }
        koncowkaDrazkaKierowniczego=new KoncowkaDrazkaKierowniczego[2];
        for(int i=0;i<2;i++){
            koncowkaDrazkaKierowniczego=new KoncowkaDrazkaKierowniczego();
        }
        pedalHamulca=new PedalHamulca();
        kierownica=new Kierownica();
        zwrotnica=new Zwrotnica();
        System.out.println("["+this.getClass().getName()+"] Utworzono obiekt klasy Podwozie");
    }
    
    
}
