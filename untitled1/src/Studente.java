import java.util.ArrayList;

public class Studente extends Universitario{

    private int creditiGuadagnati;
    private CorsoUniversitario[] corsiPartecipa = new CorsoUniversitario[100];

    public Studente(String name, String surname, String facolta){
        super(name,surname,facolta);

    }

    public  void sostieniEsame(String corso, int credits){
        CorsoUniversitario corsoSvolto = new CorsoUniversitario(corso, credits);
        for (int i = 0; i < this.corsiPartecipa.length; i++){
            this.corsiPartecipa[i] = corsoSvolto;
        }
    }
    public void svolgiEsame(int Index){
        Index--;
        this.creditiGuadagnati = corsiPartecipa[Index].crediti;
        corsiPartecipa[Index].hasPassed();
    }
    public int neededCredits(){
        int creditDifference =   super.getNeededCredits() - this.creditiGuadagnati;
        System.out.println("he need: " + creditDifference + " to finish laurea");
        return creditDifference;
    }
    public void getAllExams(){
        for (int i = 0; i < this.corsiPartecipa.length; i++){
           System.out.println(this.corsiPartecipa[i]);
        }
    }

}
