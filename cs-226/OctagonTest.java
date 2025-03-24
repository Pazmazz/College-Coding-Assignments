abstract class GeometricObject{
    protected GeometricObject(){
    }
    
    abstract double getArea();
    abstract double getPerimeter();
}

class Octagon extends GeometricObject 
    implements Comparable<Octagon> {
    private double side;
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /** Construct a Octagon with the default side */
    public Octagon () {
        
    }
    
    /** Construct a Octagon with the specified side */
    public Octagon (double side) {
        this.side = side;
    }

    @Override /** Implement the abstract method getArea in
        GeometricObject */
    public double getArea() {
        double area = ((4/(Math.sqrt(2))) + 2) * side * side;
        
        return area;
    }

    @Override /** Implement the abstract method getPerimeter in
        GeometricObject */
    public double getPerimeter() {
        double perimeter = 8 * side;
        
        return perimeter;
    }

    @Override
    public int compareTo(Octagon obj) {
        if (getArea() > obj.getArea()){
            return 1;
        } else if (getArea() < obj.getArea()){
            return -1;
        } else {
            return 0;
        }
    }

}

public class OctagonTest {
    public static void main(String[] args) {
        Octagon a1 = new Octagon(5);
        System.out.println("Area is " + a1.getArea());
        System.out.println("Perimeter is " + a1.getPerimeter());
    
        Octagon a2 = new Octagon(2);
        System.out.println("Area is " + a2.getArea());
        System.out.println("Perimeter is " + a2.getPerimeter());
    
        System.out.println("Compare the octagons " + a1.compareTo(a2));
    }
}
