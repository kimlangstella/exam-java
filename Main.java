public class Main {
    public static void main(String[] args) {
       Rectagle r1=new Rectagle(12,45);
        System.out.println("Rectangle area:"+r1.area());
        System.out.println(r1.getPerimeter());

        Square s = new Square(23);
        System.out.println("Square Area: " + s.area());
        System.out.println("Square Perimeter: " + s.getPerimeter());

    }
}