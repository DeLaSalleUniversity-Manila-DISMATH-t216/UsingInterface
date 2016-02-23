package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Kalamata;
import ph.edu.dlsu.Olive.Ligurian;
import ph.edu.dlsu.Olive.Olive;
import ph.edu.dlsu.OlivePress.OlivePress;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Olive> olives = new ArrayList<Olive>();

        Olive olive;

        olive = new Kalamata();
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Ligurian();
        System.out.println(olive.name);
        System.out.println(olive);
        olives.add(olive);

        olive = new Kalamata();
        System.out.println(olive.name);
        olives.add(olive);


        OlivePress press = new OlivePress();
        press.getOil(olives);

        System.out.println("You got " + press.getTotalOil() + " units of oil");

        press.getOil(olives);

        System.out.println("You got " + press.getTotalOil() + " units of oil");

        Kalamata olive1 = (Kalamata)olives.get(0);
        System.out.println("Olive 1 is from " + olive1.getOrigin());
    }
}
