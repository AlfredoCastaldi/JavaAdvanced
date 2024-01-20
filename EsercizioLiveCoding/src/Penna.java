public class Penna extends Consumabile implements Scrivibile{
    private String color;
    private String tipo;
    private Boolean isCancellabile;
    public Penna(String color, String tipo, Boolean isCancellabile, double consumoPerKilometro, double riserva){
        super.consumoPerKilometro = consumoPerKilometro;
        super.riserva = riserva;
        this.color = color;
        this.tipo = tipo;
        this.isCancellabile = isCancellabile;
    }
    @Override
    public double kilometriDiScrittura() {
        return super.kilometriDiScrittura();
    }
    public Boolean getCancellabile(){
        Boolean result;
        if (isCancellabile == null){
         result = null;
        } else {
            result = isCancellabile;
        }
        return result;
    }
    @Override
    public String toString() {
        return "Penna{" +
                "color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", isCancellabile=" + isCancellabile +
                ", consumoPerKilometro=" + consumoPerKilometro +
                '}';
    }
}
