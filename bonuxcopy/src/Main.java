public class Main
{
    public static void main(String[] args){
        //Create a square using the Point, Line, and Square classes
        //Print the area and circumreference of the square
        //Print using the "System.out.println()" command
        Point point1= new Point(1,1);
        Point point2= new Point(1,3);


        //System.out.println(point1.xDistanceTo(point2));
        //System.out.println(point2.yDistanceTo(point1));

        Line line1= new Line(point1,point2);
        Line line2= new Line(point2, new Point(5,3));

        //System.out.println(line1.length());
        //System.out.println(line2.length());

        Rectangle rectangle= new Rectangle(
                line1,
                line2,
                new Line(new Point(5,3), new Point(5,1)),
                new Line(new Point(5,1), point1)
        );

        //Area
        System.out.println("area " + rectangle.area());

        //circumreference
        System.out.println("circumreference " + rectangle.circumreference());

    }

    Triangle triangle= new Triangle(
            new Line(new Point(6,1), new Point(8,1)),
            new Line(new Point(8,1), new Point(7,3)),
            new Line(new Point(7,3), new Point(6,1))
    );



}
