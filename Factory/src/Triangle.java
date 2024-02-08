public class Triangle implements Shape{
    private double heigth;
    private double base;
    private double area;

    public Triangle(double heigth, double base){
        this.heigth = heigth;
        this.base = base;
        this.area = heigth * base / 2;
    }
    @Override
    public Shape draw() {
      return this;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", area=" + area +
                '}';
    }
}
