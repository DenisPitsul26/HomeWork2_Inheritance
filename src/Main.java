public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(new Point(2, 4), new Point(6,3), new Point(-3, -7));
        Triangle triangle2 = new Triangle(new Point(-5, 3), new Point(3,-1), new Point(5, -2));
        Triangle triangle3 = new Triangle(new Point(8, 5), new Point(-6,8), new Point(1, 1));

        Tetragon tetragon1 = new Tetragon(new Point(4, -2), new Point(-2, 9), new Point(0, 2),
                                        new Point(-3, 0));
        Tetragon tetragon2 = new Tetragon(new Point(2, 0), new Point(1, 3), new Point(-3, -5),
                                        new Point(-7, 3));
        Tetragon tetragon3 = new Tetragon(new Point(2, -2), new Point(6, 3), new Point(-4, -7),
                                        new Point(-3, -9));

        Circle circle1 = new Circle(new Point(3, 5), new Point(5, -2));
        Circle circle2 = new Circle(new Point(4, 1), new Point(9, 2));
        Circle circle3 = new Circle(new Point(1, 3), new Point(3, -5));

        Board board = new Board();
        board.addShapeToBoard(triangle1, 3);
        board.addShapeToBoard(tetragon2, 1);
        board.addShapeToBoard(circle3, 4);
        board.addShapeToBoard(triangle2, 2);
        board.showInfoAboutAllShapesInTheBoard();
        System.out.println("Total area shapes on the board: "+ board.getTotalArea() +".");

        board.deleteShapeFromBoard(3);
        board.deleteShapeFromBoard(2);
        board.showInfoAboutAllShapesInTheBoard();
        System.out.println("Total area shapes on the board: "+ board.getTotalArea() +".");

    }
}
