import java.util.ArrayList;

public class Cancelleria {
   public static ArrayList<Consumabile> cancelleria = new ArrayList<Consumabile>();

   public static void insertPenna(String color,String tipo, boolean isCancellabile, double consumoPerKilometro, double riserva ){
       Penna newPen = new Penna( color,  tipo,isCancellabile, consumoPerKilometro, riserva);
       cancelleria.add(newPen);
   }
   public static void insertMatita(TipoMatita tipo,double consumoPerKilometro, double riserva){
       Matita newPencil = new Matita(tipo,consumoPerKilometro,riserva);
       cancelleria.add(newPencil);
   }
   public static void checkCancelleria(){
       for (Consumabile elemento : cancelleria){
           System.out.println(elemento);
       }
   }
   public static void findCancellabile(){
       for (Consumabile elemento : cancelleria){
           if (elemento instanceof Penna && ((Penna) elemento).getCancellabile()){
               System.out.println(elemento);
           }
       }
   }
   public static void scrivi(int index){
       index--;
       System.out.println(cancelleria.get(index).kilometriDiScrittura());

   }
   public static void checkMatite(){
       for (Consumabile elemento : cancelleria){
           if (elemento instanceof Matita &&
               ((Matita) elemento).getTipo() == TipoMatita.HB && TipoMatita.HB.getDurezza() >= 5){
               System.out.println(elemento);

           }
       }
   }
}
