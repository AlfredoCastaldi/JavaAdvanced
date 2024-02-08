import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(factory.createShape(Types.CIRCLE));
        myShapes.add(factory.createShape(Types.TRIANGLE));

        for (Shape element : myShapes){
            System.out.println(element.draw());
        }
    }
}
