public class Point
{
    private double x;
    private double y;

    public Point(double x,  double y){
        this.x = x;
        this.y = y;
    }

    public double xDistanceTo(Point p){
        return Math.abs(this.x - p.x);

    }

    public double yDistanceTo(Point p){
        return Math.abs(this.y - p.y);

    }

}
