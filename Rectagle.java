public class Rectagle {
    private  double length;
    private  double width;
    public Rectagle(double width, double length){
        this.length=length;
        this.width=width;
    }

    public double area() {
        return (length*width);
    }
    public double getPerimeter(){
        return  (width+length*2);
    }
}
