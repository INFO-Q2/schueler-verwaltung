package verwaltung;


import data.Pair;
import schueler.Schueler;

import java.math.BigInteger;
import java.util.ArrayList;

public class SchuelerListe<T extends Schueler> {

    ArrayList<Pair<T, Boolean>> list = new ArrayList<>();

    public T getRandom(){
        int index = randomWithRange(0, list.size() - 1);
        if(list.get(index).value) { return list.get(index).key; } else { return getRandom(); }
    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


}
