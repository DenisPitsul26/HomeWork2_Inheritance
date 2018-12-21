public class Tetragon extends Shape{
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Tetragon(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Tetragon() {
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public String toString() {
        return "Tetragon{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                '}';
    }

    @Override
    double getPerimeter() {
        Point vectorPoint12 = new Point(getPoint2().getX() - getPoint1().getX(), getPoint2().getY() - getPoint1().getY());
        Point vectorPoint23 = new Point(getPoint3().getX() - getPoint2().getX(), getPoint3().getY() - getPoint2().getY());
        Point vectorPoint34 = new Point(getPoint4().getX() - getPoint3().getX(), getPoint4().getY() - getPoint3().getY());
        Point vectorPoint14 = new Point(getPoint4().getX() - getPoint1().getX(), getPoint4().getY() - getPoint1().getY());

        double lengthVectorPoint12 = Math.sqrt(Math.pow(vectorPoint12.getX(), 2) + Math.pow(vectorPoint12.getY(), 2));
        double lengthVectorPoint23 = Math.sqrt(Math.pow(vectorPoint23.getX(), 2) + Math.pow(vectorPoint23.getY(), 2));
        double lengthVectorPoint34 = Math.sqrt(Math.pow(vectorPoint34.getX(), 2) + Math.pow(vectorPoint34.getY(), 2));
        double lengthVectorPoint14 = Math.sqrt(Math.pow(vectorPoint14.getX(), 2) + Math.pow(vectorPoint14.getY(), 2));

        return lengthVectorPoint12 + lengthVectorPoint23 + lengthVectorPoint34 + lengthVectorPoint14;
    }

    @Override
    double getArea() {
        Point vectorPoint12 = new Point(getPoint2().getX() - getPoint1().getX(), getPoint2().getY() - getPoint1().getY());
        Point vectorPoint23 = new Point(getPoint3().getX() - getPoint2().getX(), getPoint3().getY() - getPoint2().getY());
        Point vectorPoint34 = new Point(getPoint4().getX() - getPoint3().getX(), getPoint4().getY() - getPoint3().getY());
        Point vectorPoint14 = new Point(getPoint4().getX() - getPoint1().getX(), getPoint4().getY() - getPoint1().getY());

        double lengthVectorPoint12 = Math.sqrt(Math.pow(vectorPoint12.getX(), 2) + Math.pow(vectorPoint12.getY(), 2));
        double lengthVectorPoint23 = Math.sqrt(Math.pow(vectorPoint23.getX(), 2) + Math.pow(vectorPoint23.getY(), 2));
        double lengthVectorPoint34 = Math.sqrt(Math.pow(vectorPoint34.getX(), 2) + Math.pow(vectorPoint34.getY(), 2));
        double lengthVectorPoint14 = Math.sqrt(Math.pow(vectorPoint14.getX(), 2) + Math.pow(vectorPoint14.getY(), 2));

        return Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - lengthVectorPoint12) *
                (getPerimeter()/2 - lengthVectorPoint23) * (getPerimeter()/2 - lengthVectorPoint34) *
                (getPerimeter()/2 - lengthVectorPoint14));
    }
}
