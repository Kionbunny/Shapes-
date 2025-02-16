//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      // creating two sep objects for Circle and Rectangle class
        Circle c = new Circle(3);
        System.out.println("Radius of the circle = " + c.getRadius());
        System.out.println("Area of Circle " + c.calculateArea());
        System.out.println("Circumference of circle = " + c.calculateCircumference());

        ///  creating an object for Rectangle
         System.out.println();
        Rectangle rec = new Rectangle(4 , 10);
        System.out.println("Height of the Rectangle = " + rec.getHeight());
        System.out.println("Width of Rectangle " + rec.getWidth());
        System.out.println("Area of Rectangle = " + rec.calculateArea());
        System.out.println("Circumference of circle = " + rec.calculateCircumference());

    }
}