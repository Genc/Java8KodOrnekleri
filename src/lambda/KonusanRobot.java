package lambda;

public class KonusanRobot {
    public static void main(String[] args) {

        // Robot robot = (String isim) -> {System.out.println("Merhaba, " + isim );};
        Robot robot = (String name) -> System.out.println("Merhaba, " + name);
        robot.ismimiSoyle("Faruk");

    }
}
