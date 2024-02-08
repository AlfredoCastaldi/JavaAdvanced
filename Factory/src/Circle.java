public class Circle implements Shape{
    private double diameter;
    private final double pi = 3.14;

    private double circonferenza;

    public Circle(double diameter) {

        this.diameter = diameter;
        this.circonferenza = this.diameter * this.pi;

    }

    @Override
    public Shape draw() {
        return this;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", pi=" + pi +
                ", circonferenza=" + circonferenza +
                '}';
    }
}
