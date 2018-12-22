import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private Shape[] shapeList;

    public Board() {
        shapeList = new Shape[4];
    }

    public void addShapeToBoard(Shape shape, int index){
        if (index >= 1 && index <= 4) {
            if (shapeList[index-1] == null){
                shapeList[index-1] = shape;
                System.out.println(shape +" is added to the "+ index +" place in the board.");
            }
            else
                System.out.println("This place is already occupied by another figure.");
        }
        else
            System.out.println("No such place on the board.");
    }

    public void deleteShapeFromBoard(int index){
        if (index >= 1 && index <= 4) {
            if (shapeList[index-1] != null){
                Shape shape = shapeList[index-1];
                shapeList[index-1] = null;
                System.out.println(shape +" is delete from the "+ index +" place on the board.");
            }
            else
                System.out.println("This place is empty.");
        }
        else
            System.out.println("No such place on the board.");
    }

    public void showInfoAboutAllShapesInTheBoard(){
        for (int i = 0; i < 4; i++) {
            if (shapeList[i] != null){
                System.out.println((i+1) +") "+ shapeList[i] +".");
            }
            else
                System.out.println((i+1) +") Is empty.");
        }
    }

    public double getTotalArea() {
        double totalArea = 0;

        for (int i = 0; i < 4; i++) {
            if (shapeList[i] != null){
                totalArea += shapeList[i].getArea();
            }
        }

        return totalArea;
    }

    @Override
    public String toString() {
        return "Board{" +
                "shapeList=" + Arrays.toString(shapeList) +
                '}';
    }
}
