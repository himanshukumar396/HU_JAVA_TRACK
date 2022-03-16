public class FindingArea {

    public static void main(String[] args) {
        FindingArea ob = new FindingArea();
        ob.area(5);
        ob.area(11, 12);
        ob.area(2.5);
        ob.area(2.0,5.0);
    }

    void area(float x) {
        System.out.println("the area of the square is " + Math.pow(x, 2) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("the area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z + " sq units");
    }

    void area(double base, double height) {
        double triangle_area = (base * height) / 2;
        System.out.println("the area of the triangle is " + triangle_area + " sq units");
    }
}
