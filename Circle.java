public class Circle extends Shapes {
    ///  Instance variables to store the radius
    /// these are public , static and final  by default
    private double radius ;
    final double pi = Math.PI;
    // this constructor initializes the object
    public Circle(double radius) {
        setRadius(radius);
         ///  assign the radius value in the setter method instead of assigning it twice here and there
        ///  initialising in the setter method ensures the validation logic also
    }
    public double getRadius () {
        return radius;  // we can  view the radius by using getter method and returning it
    }
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;// this instance variable holds the value which is passed as argument when
        // an object is created
    }
    @Override
    public double calculateArea() {
        return pi * Math.pow(radius,2);
    }// as the child class implements the method it has to override the method in super class
    @Override
    public double calculateCircumference() {
        return 2 * pi * radius;
    }
}
