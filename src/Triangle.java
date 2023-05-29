public class Triangle extends Polygon{

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree){
        super(new Point[]{
                cornerOne,
                cornerTwo,
                cornerThree
        });
    }

    public void display(){
        System.out.println(this);
    }

        @Override
    public String toString(){
        return "Triangle corner one: " + vertices[0].toString()  +
                ", corner two: " + vertices[1].toString()  +
                ", corner three: " + vertices[2].toString();
    }
}
