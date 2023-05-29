public class Circle implements Movable {
    private Point point;
    private int radius;

    public Circle(Point center, int radius){
        this.point = center;
        this.radius = radius;
    }

    @Override
    public void moveUp(int distance) {
        point.setY(point.getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        point.setY(point.getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        point.setX(point.getX() - distance);
    }

    @Override
    public void moveRight(int distance) {
        point.setX(point.getX() + distance);
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Center: " + point + " radius: " + radius;
    }

}
