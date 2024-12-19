public class Figure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Trapezium trapezium = new Trapezium();
        Rectangle rectangle = new Rectangle();

        triangle.perimetr();
        trapezium.area();
        triangle.perimetr();
        rectangle.perimetr();
    }
}
