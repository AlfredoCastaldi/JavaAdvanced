import java.util.UUID;

public abstract class Dipendenti {
    protected String matricola;
    protected double costoAziendale;

    protected int autorizzationLevel;
    public Dipendenti(){
        this.matricola = UUID.randomUUID().toString();
    }



    public abstract double getRedditoNetto();

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setCostoAziendale(double costoAziendale) {
        this.costoAziendale = costoAziendale;
    }

    @Override
    public String toString() {
        return "Dipendenti{" +
                "matricola='" + matricola + '\'' +
                ", costoAziendale=" + costoAziendale +
                ", redditoNetto " + this.getRedditoNetto() +
                '}';
    }
}
