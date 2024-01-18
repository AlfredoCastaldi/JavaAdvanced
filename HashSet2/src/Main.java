import java.util.HashSet;
import java.util.UUID;

public class Main {
    public static void main(String[] args){

        HashSet<Prodotto> prova = getHashSet(6);

        for(Prodotto element : prova){
            System.out.println(element);
        }
    }

    public static HashSet<Prodotto> getHashSet(int input){

        HashSet<Prodotto> hashSet = new HashSet<Prodotto>();

        for (int i = 0; i < input; i++){
            Prodotto prodotto = new Prodotto();
            hashSet.add(prodotto);


        }
        return hashSet;
    }
}