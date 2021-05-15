package ClassPointAndMeveablePoint;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint  = new MovablePoint(1,2);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
