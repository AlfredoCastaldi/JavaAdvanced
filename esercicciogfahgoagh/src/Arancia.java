public class Arancia {
    public String colore;
    public double prezzo;

    public Arancia(String pippo, double pippo2){
        this.colore = pippo;
        this.prezzo = pippo2;
    }

    public void raddoppiaPrezzo(){
        this.prezzo = this.prezzo * 2;

    }

    @Override
    public String toString() {
        return "Arancia{" +
                "colore='" + colore + '\'' +
                '}';
    }
}
