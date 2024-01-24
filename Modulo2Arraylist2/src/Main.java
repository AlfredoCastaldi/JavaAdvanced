import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
    ArrayList<Studente> studenti = new ArrayList<>(Arrays.asList(
            new Studente("alfredo",99),
            new Studente("Jack",245),
            new Studente("pippo",999)
    ));

    studenti.add(new Studente("Nikita",2));
    studenti.add(new Studente("Manuel",666));
    studenti.add(new Studente("queen",26));
    studenti.add(new Studente("gandalf",99999999));
    studenti.add(new Studente("Carlo",1));
    studenti.add(new Studente("Carolina",525252));
    studenti.add(new Studente("cazzenberg",63));
    studenti.add(new Studente("Collodi",43));
    studenti.add(new Studente("Saruman",5));
    studenti.sort(new Comparator<Studente>() {
        @Override
        public int compare(Studente o1, Studente o2) {
            return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
        }
    });

        for(Studente element : studenti){
            System.out.println(element);
        }
    }
}
