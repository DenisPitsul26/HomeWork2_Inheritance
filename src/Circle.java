public class Circle extends Shape{
    private Point pointCenter;
    private Point pointOnTheCircle;

    public Circle(Point pointCenter, Point pointOnTheCircle) {
        this.pointCenter = pointCenter;
        this.pointOnTheCircle = pointOnTheCircle;
    }

    public Circle() {
    }

    public Point getPointCenter() {
        return pointCenter;
    }

    public void setPointCenter(Point pointCenter) {
        this.pointCenter = pointCenter;
    }

    public Point getPointOnTheCircle() {
        return pointOnTheCircle;
    }

    public void setPointOnTheCircle(Point pointOnTheCircle) {
        this.pointOnTheCircle = pointOnTheCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pointCenter=" + pointCenter +
                ", pointOnTheCircle=" + pointOnTheCircle +
                '}';
    }

    @Override
    public double getPerimeter() {
        Point vectorRadius = new Point(getPointOnTheCircle().getX() - getPointCenter().getX(),
                getPointOnTheCircle().getY() - getPointCenter().getY());

        double radius = Math.sqrt(Math.pow(vectorRadius.getX(), 2) + Math.pow(vectorRadius.getY(), 2));

        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        Point vectorRadius = new Point(getPointOnTheCircle().getX() - getPointCenter().getX(),
                getPointOnTheCircle().getY() - getPointCenter().getY());

        double radius = Math.sqrt(Math.pow(vectorRadius.getX(), 2) + Math.pow(vectorRadius.getY(), 2));

        return Math.pow(radius, 2) * Math.PI;
    }
}
