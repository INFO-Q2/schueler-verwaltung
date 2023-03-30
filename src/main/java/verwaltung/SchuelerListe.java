package verwaltung;


import data.Pair;
import schueler.Schueler;

import java.math.BigInteger;
import java.util.ArrayList;

public class SchuelerListe<T extends Schueler> {

    ArrayList<Pair<T, Boolean>> list = new ArrayList<>();

    public Pair<T, Boolean> getRandom(){
        int index = randomWithRange(0, list.size() - 1);
        return list.get(index);
    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


}
