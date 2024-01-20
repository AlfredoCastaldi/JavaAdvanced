import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Dipendenti> dipendenti = new ArrayList<Dipendenti>();

        Operai mario = new Operai(100,3,"cantiere","carpentiere");
        Quadri federica = new Quadri(100,6,"cantiere");
        Dirigenti jack = new Dirigenti(100,6);

        dipendenti.add(mario);
        dipendenti.add(federica);
        dipendenti.add(jack);

        double costoAziendale =0;
        for (Dipendenti dipendente : dipendenti){
           costoAziendale += dipendente.getRedditoNetto();
        }
        System.out.println(costoAziendale);
        for (Dipendenti dipendente : dipendenti){
            System.out.println(dipendente);
        }
        for (Dipendenti dipendente : dipendenti){
            Autorizzazione.giveOperation(dipendente, "pulire i cessi");
            Autorizzazione.giveOperation(dipendente, "spengere i computer");
        }
    }
}
