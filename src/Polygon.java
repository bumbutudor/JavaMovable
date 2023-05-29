abstract class Polygon implements Movable {
    protected Point[] vertices;


    public Polygon(Point[] vertices){
        this.vertices = vertices;
    }
    @Override
    public void moveUp(int distance) {
        for (Point point: vertices) {
            point.setY(point.getY() + distance);
        }
    }

    @Override
    public void moveDown(int distance) {
        for (Point point: vertices) {
            point.setY(point.getY() - distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
        for (Point point: vertices) {
            point.setX(point.getX()  - distance);
        }
    }

    @Override
    public void moveRight(int distance) {
        for (Point point: vertices) {
            point.setX(point.getX() + distance);
        }
    }
}
