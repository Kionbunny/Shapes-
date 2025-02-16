public class Rectangle extends Shapes{
    final private double height, width;
    final double pi = Math.PI;
    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
        setHeight(height);
        setWidth(width);
    }
    public double getHeight () {
        return height ;
    }
    public double getWidth () {
        return width;
    }
    public void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("height must be positive");
        }
    }
    public void setWidth(double width) {
        if(width <= 0) {
            throw new IllegalArgumentException("Width cannot be negative ");
        }
    }
    @Override
     public double calculateArea() {
        return height * width;
    }
    public double calculateCircumference () {
         return 2 * (height + width);
    }
}
