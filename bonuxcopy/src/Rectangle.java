public class Rectangle{

    //Add the fields necessary to create a rectangle here.
    //Make use of the Line class

    private Line rLnegth;
    private Line lLength;
    private Line rWidth;
    private Line lWidth;


    public Rectangle(Line rLnegth, Line rWidth, Line lLength , Line lWidth) {
        this.rLnegth = rLnegth;
        this.lLength = lLength;
        this.rWidth = rWidth;
        this.lWidth = lWidth;
    }

    //Implement a method which returns the circumreference of the rectangle
    public double circumreference(){
        // p= 2l + 2w
        return 2*(rLnegth.length()+rWidth.length());
    }

    //Implement a method which returns the area of the rectangle
    public double area(){
        // a= l * w
        return rLnegth.length() * rWidth.length();
    }

}