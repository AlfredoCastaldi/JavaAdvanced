import java.util.Arrays;

public class Matita extends Consumabile implements Scrivibile{

    private TipoMatita tipo;
    public Matita(TipoMatita tipo, double consumoPerKilometro, double riserva){
        super.consumoPerKilometro = consumoPerKilometro;
        super.riserva = riserva;

        this.tipo = tipo;
    }
    @Override
    public double kilometriDiScrittura() {
        return super.kilometriDiScrittura();
    }

    public TipoMatita getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Matita{" +
                ", tipo='" + tipo + '\'' +
                ", consumoPerKilometro=" + consumoPerKilometro +
                '}';
    }
}
