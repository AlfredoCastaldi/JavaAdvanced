public abstract class Consumabile implements Scrivibile{

    protected double consumoPerKilometro;
    protected double riserva = 0;

    public Consumabile(){}

    @Override
    public double kilometriDiScrittura() throws RuntimeException {

            if (riserva > 0){
        return riserva/consumoPerKilometro;
        } else {
            throw new RuntimeException("inchiostro non disponibile");
        }
    }
}
