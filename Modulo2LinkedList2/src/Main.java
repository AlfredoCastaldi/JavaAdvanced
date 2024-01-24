import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Fruit> cassetta = new LinkedList<Fruit>(Arrays.asList(
                new Fruit("pera"), new Fruit("bananan"), new Fruit("mango"), new Fruit("cocco")
        ));
        System.out.println(cassetta);
        cassetta.addFirst(new Fruit("mela"));
        cassetta.addLast(new Fruit("nikita"));
        System.out.println(cassetta);
    }
}
