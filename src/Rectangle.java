public class Rectangle extends Polygon {
    private final Point topRightCorner;
    private final int width;
    private final int height;

    public Rectangle (Point topRightCorner, int width, int height){
        super(new Point[]{
                topRightCorner,
                new Point(topRightCorner.getX() - width, topRightCorner.getY()),
                new Point(topRightCorner.getX() - width, topRightCorner.getY() - height),
                new Point(topRightCorner.getX(), topRightCorner.getY() - height)
        });

        this.topRightCorner = topRightCorner;
        this.width = width;
        this.height = height;
    }

    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Rectangle with top right corner: " + topRightCorner.toString() +
                 " top left corner: " + new Point(topRightCorner.getX() - width, topRightCorner.getY()).toString() +
                 " bottom left corner " + new Point(topRightCorner.getX() - width, topRightCorner.getY() - height).toString() +
                 " bottom right corner " + new Point(topRightCorner.getX(), topRightCorner.getY() - height).toString();
    }
}

