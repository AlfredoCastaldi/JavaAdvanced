public class Fruit {

    private String name;

    public Fruit(String nome){

        this.name = nome;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
