import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Autorizzazione {


    private static Operazione[] operazioni = Operazione.values();

    public static boolean giveOperation(Dipendenti dipendente, String choseOperation){

        boolean canHeDoIt = false;
        Operazione operazioneScelta =null;
        for (Operazione opration : operazioni){
             if (opration.getMansioneDaSvolgere().equalsIgnoreCase(choseOperation)){
                 operazioneScelta = opration;
             }
        }
        try{
        if (operazioneScelta == null){
            canHeDoIt = false;
            throw new RuntimeException("operazione non esiste");
        }
        if (operazioneScelta.getLivelloResponsabilità() <= dipendente.autorizzationLevel){
            canHeDoIt = true;
            System.out.println(dipendente.getMatricola() + " può fare " + choseOperation);
        }
        } catch (RuntimeException e){
            System.out.println(e);
        }
        return canHeDoIt;
    }
}
