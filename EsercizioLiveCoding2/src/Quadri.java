public class Quadri extends Dipendenti{
    String responsabileDiArea;
    public Quadri(double costoAziendale, int autorizzationLevel, String responsabileDiArea){
        super.costoAziendale = costoAziendale;
        super.autorizzationLevel = autorizzationLevel;
        this.responsabileDiArea = responsabileDiArea;

    }
    public double getRedditoNetto() {
        return (super.costoAziendale/100) * 75;
    }

    @Override
    public String toString() {
        return "Quadri{" +
                "responsabileDiArea='" + responsabileDiArea + '\'' +
                ", matricola='" + matricola + '\'' +
                ", costoAziendale=" + costoAziendale +
                ", redditoNetto= " + getRedditoNetto() +
                '}';
    }
}
