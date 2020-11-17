package Uebung;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadDuplicates {

    public static void main(String[] args) {

        /*String[] onetohundretsixty = {"Saveas", "Mirael", "Tasi", "Brutus", "Lucius", "Elijah", "Lailah", "Nemora", "Solise"
        };

        String[] onesixtyonetotwofourty = {"Shemira", "Athalia", "Elijah & Lailah", "Brutus", "Lucius", "Nemora", "Ezizh", "Lyca"
        };

        String[] twofourtyonwards = {"Talene", "Rowan", "Elijah & Lailah", "Lucius", "Tasi", "Nemora", "Rosaline", "Ezizh", "Mehira", "Khazard", "Lyca", "Arthur", "Athalia", "Albedo"};
*/
        //System.out.println("Duplikat gefunden");
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("Saveas", "Mirael", "Tasi", "Brutus", "Lucius", "Elijah & Lailah", "Nemora", "Solise"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("Shemira", "Athalia", "Elijah & Lailah", "Brutus", "Lucius", "Nemora", "Ezizh", "Lyca"));

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("Talene", "Rowan", "Elijah & Lailah", "Lucius", "Tasi", "Nemora", "Rosaline", "Ezizh", "Mehira", "Khazard", "Lyca", "Arthur", "Athalia", "Albedo"));

        
        listOne.retainAll(listTwo);
        listOne.retainAll(listThree);
        
        listTwo.retainAll(listThree);
    
        System.out.println(listOne);
        System.out.println(listTwo);
        //System.out.println(listThree);
    

    }
}
