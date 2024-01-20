public class Dirigenti extends Dipendenti{

    public Dirigenti(double costoAziendale, int autorizzationLevel){

        super.costoAziendale = costoAziendale;
        super.autorizzationLevel = autorizzationLevel;
    }
    public double getRedditoNetto() {
        return (super.costoAziendale/100) * 50;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
