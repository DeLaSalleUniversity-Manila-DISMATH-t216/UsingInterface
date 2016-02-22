# UsingInterface

![jcinsanity](Screenshot 001.PNG)
![jcinsanity](Screenshot 002.PNG)

~~~
#Main
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

#OlivePress
package ph.edu.dlsu.OlivePress;

import ph.edu.dlsu.Olive.Olive;

import java.util.Collection;

public class OlivePress {

    public int getTotalOil() {
        return totalOil;
    }

    private void setTotalOil(int totalOil) {
        this.totalOil += totalOil;
    }

    private int totalOil = 0;

    public OlivePress(){
    }

    public void getOil(Collection<Olive> olives){

        int oil = 0;

        for (Olive olive : olives){
            oil += olive.crush();
        }

        setTotalOil(oil);

    }
}

#Olive
package ph.edu.dlsu.Olive;

public class Olive {

    public static final long BLACK = 0x000000;
    public static final long GREEN = 0x00FF00;

    public String name = "KALAMATA";
    public String flavor = "Grassy";
    public long color = Olive.BLACK;
    private int oil = 3;


    public Olive() {
        System.out.print("Constructor of " + this.name);
    }

    public Olive(int oil){
        this.oil = oil;
    }

    public int crush(){
        System.out.println("crush from superclass");
        return oil;
    }


}


#Kalamata
package ph.edu.dlsu.Olive;


public class Kalamata extends Olive {

    public Kalamata() {
        super(2);
        this.name = "Ligurian";
        this.flavor = "Yummy";
        this.color = Olive.GREEN;
    }

    @Override
    public int crush() {

        System.out.println("crush from subclass");
        return super.crush();
    }

    public String getOrigin() {
        return  "Greece";
    }
}

#Ligurian
package ph.edu.dlsu.Olive;

public class Ligurian extends Olive {

    public Ligurian() {
        super(1);
        this.name = "Kalamata";
        this.flavor = "Grassy";
        this.color = Olive.BLACK;


    }

    @Override
    public String toString() {
        return "Ligurian{" +
                "NAME" + this.name +
                "flavor = " + this.flavor +
                "}";
    }
}

#OlivePress2
package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Olive;

import java.util.Collection;

public class OlivePress2 implements Press{

    @Override
    public void getOil(Collection<Olive> olives) {

    }

    @Override
    public int getTotalOil() {
        return 0;
    }

    @Override
    public void setTotalOil(int totalOil) {

    }
}

#Press
package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Olive;

import java.util.Collection;

public interface Press {
    public void getOil(Collection<Olive> olives);
    public int getTotalOil();
    public void setTotalOil(int totalOil);
}

~~~
