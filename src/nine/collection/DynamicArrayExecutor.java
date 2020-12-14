package nine.collection;

import java.util.*;

public class DynamicArrayExecutor {
    public static void main(String[] args) {
        String[] names = new String[2];
        //0, 1
        names[0] = "Albin";
        names[1] = "Adna";
        System.out.println(names[1]);
        //names[2] = "Damir";//ERROR -> Exception -> Runtime
        //1. fiksna dužina
        //names1 -> tipa ArrayList
        System.out.println("Ide lista");
        List<String> listaImena = new ArrayList<>();
        listaImena.add("Damir");
        listaImena.add("Albin");
        listaImena.add("Adna");
        listaImena.add("Damir");
        printCollection(listaImena);
        System.out.println();
        System.out.println("Ide SET");
        //System.out.println(listaImena.get(1));
        LinkedHashSet<String> setOfNames = new LinkedHashSet<>();
        setOfNames.add("Damir");
        setOfNames.add("Albin");
        setOfNames.add("Adna");
        setOfNames.add("Damir");
        printCollection(setOfNames);


    }
    static void printCollection(Collection<String> listOfNames){
        for(String name: listOfNames){
            System.out.println(name);
        }
    }
  /*  static void printList(List<String> listOfNames){
        for(String name: listOfNames){
            System.out.println(name);
        }
    }
    static void printSet(Set<String> listOfNames){
        for(String name: listOfNames){
            System.out.println(name);
        }
    }*/
}
