import java.util.Scanner;

public class ShapeFactory {
    Scanner userInputs = new Scanner(System.in);

    public Shape createShape(Types forma){
        Shape newShape = null;

        switch (forma){
            case CIRCLE -> newShape = new Circle(getIntInput("diameter: "));
            case TRIANGLE -> newShape = new Triangle(getIntInput("heigth"), getIntInput("base"));
        }
        return newShape;
    }

    public int getIntInput(String description){
        System.out.println(description);
        return this.userInputs.nextInt();
    }
}
