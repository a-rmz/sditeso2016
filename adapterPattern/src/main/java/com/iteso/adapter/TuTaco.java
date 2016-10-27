package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaAdapter;
import com.iteso.adapter.impl.TortaBistec;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TuTaco {
    public static void main (String[] args){
        /*Taco tacolLengua = new TacoLengua();
        Torta tortaBistec = new TortaBistec();
        TacoPlate myPlate = new TacoPlate();

        Taco convertedToTaco = new TortaAdapter(tortaBistec);
        myPlate.addTaco(tacolLengua);
        myPlate.addTaco(convertedToTaco);

        myPlate.servePlate();*/

        Taco taco = new TacoLengua();
        Torta torta = new TortaBistec();
        Torta convertedTorta = new TacoAdapter(taco);
        TortaPlate myTortaPlate = new TortaPlate();

        myTortaPlate.addTorta(convertedTorta);
        myTortaPlate.addTorta(torta);

       myTortaPlate.servePlate();

    }
}
