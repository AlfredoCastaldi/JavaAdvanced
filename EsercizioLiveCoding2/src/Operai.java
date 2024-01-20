public class Operai extends Dipendenti{
    private String area;
    private String mansione;

    public Operai(double costoAziendale, int autorizzationLevel, String area, String mansione){
        super.costoAziendale = costoAziendale;
        super.autorizzationLevel = autorizzationLevel;
        this.area = area;
        this.mansione = mansione;
    }

    public String getArea() {
        return area;


    }

    @Override
    public double getRedditoNetto() {
        return (super.costoAziendale/100) * 90;
    }

    @Override
    public String toString() {
        return "Operai{" +
                "area='" + area + '\'' +
                ", mansione='" + mansione + '\'' +
                ", matricola='" + matricola + '\'' +
                ", costoAziendale=" + costoAziendale +
                ", redditoNetto= " + getRedditoNetto() +
                '}';
    }
}
