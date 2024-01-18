import java.util.UUID;

public class Prodotto {
    String ID;

    Prodotto(){
        this.ID = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "ID='" + ID + '\'' +
                '}';
    }
}
