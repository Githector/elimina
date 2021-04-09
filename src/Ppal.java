import java.util.*;
public class Ppal {
    public static void main(String[] args) {
        List<String> llistaAl = new ArrayList<String>();
        Set<String> llistaHS = new HashSet<String>();
        Queue<String> llistaQ = new ArrayDeque<String>();
        final int iteracions = 10000000;
        long inici = System.currentTimeMillis();
        for(int i=0; i<iteracions; i++){
            llistaAl.add("Paraula"+i);
        }
        long fi = System.currentTimeMillis();
        System.out.println("ArrayList: "+ (fi-inici));
        inici = System.currentTimeMillis();
        for(int i=0; i<iteracions; i++){
            llistaHS.add("Paraula"+i);
        }
        fi = System.currentTimeMillis();
        System.out.println("HashSet: "+ (fi-inici));
        inici = System.currentTimeMillis();
        for(int i=0; i<iteracions; i++){
            llistaQ.add("Paraula"+i);
        }
        fi = System.currentTimeMillis();
        System.out.println("ArrayQueue: "+ (fi-inici));

    }
}
