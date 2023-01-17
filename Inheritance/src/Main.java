public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Shape
       Shape shape=new Shape("red",true);
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        System.out.println(shape.toString());

        //Circle

        Circle circle=new Circle("red",false,5.0);
        System.out.println(circle.getRadius());
        System.out.println("Area of Circle:"+circle.getArea());
        System.out.println("Perimeter of Circle:"+circle.getPerimeter());
        System.out.println(circle.toString());

        //Rectangle

        Rectangle rectangle=new Rectangle("Blue",true,3.0,6.0);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println("Area of rectangle: "+rectangle.getArea());
        System.out.println("perimeter of rectangle: "+rectangle.getPerimeter());
        System.out.println(rectangle.toString());


        //Square
        Square square=new Square(5.0);
        System.out.println(square.getSide());
        Square square1=new Square(6.0,"White",true);
        System.out.println(square1.getSide());
        square1.setSide(7);
        System.out.println(square1.getSide());
        System.out.println(square1.toString());


    }
}