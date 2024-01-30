import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        /*
    Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
    Verificare che la prima data è precedente alla seconda
    Verificare che la seconda data è successiva alla prima
    Verificare che le due date sono uguali ad ora
    Stampa il risultato
*/
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime myDate2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

       if (myDate.isAfter(myDate2)){
       System.out.println( myDate + " è la data dopo di: " + myDate2);
       } else if (myDate.isBefore(myDate2)){
       System.out.println( myDate + " è la data prima di : " + myDate2);
       } else {
       System.out.println( myDate + " è la stessa data di: " + myDate2);}
       }
}
