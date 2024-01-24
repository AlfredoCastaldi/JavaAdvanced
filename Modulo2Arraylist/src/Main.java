import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    ArrayList<Studente> studenti = new ArrayList<>(Arrays.asList(
            new Studente("simona",99),
            new Studente("jack",245),
            new Studente("pippo",999)
    ));
    for(Studente elemento : studenti){
        System.out.println(elemento);
    }
    studenti.add(new Studente("nikita",2));
    studenti.add(new Studente("manuel",666));
    studenti.add(new Studente("queen",26));
    studenti.add(new Studente("gandalf",99999999));

    for(Studente element : studenti){
        System.out.println(element);
    }


    }
}
