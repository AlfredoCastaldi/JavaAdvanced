public class Main {
    public static void main(String[] args){
      Cancelleria.insertMatita(TipoMatita.HB,2,20);
        Cancelleria.insertMatita(TipoMatita.HB,2,10);
        Cancelleria.insertMatita(TipoMatita.HB,3,0);
      Cancelleria.insertPenna("blu","biro",true,3,51);
      Cancelleria.insertPenna("rosso","jack",false,3,0);
        Cancelleria.insertPenna("rosso","jack",false,3,0);
        Cancelleria.insertPenna("blu","dadada",true,3,0);
        Cancelleria.insertPenna("blgagagau","biro",true,3,0);
      Cancelleria.findCancellabile();
      Cancelleria.checkMatite();
      try{
        Cancelleria.scrivi(1);
        Cancelleria.scrivi(2);
        Cancelleria.scrivi(3);
        Cancelleria.scrivi(4);
      }
      catch (RuntimeException e){
          System.out.println(e);
      }
      System.out.println("sono arrivato fino a qua");

    }
}
