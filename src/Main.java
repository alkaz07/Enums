import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Direction whereToGo =Direction.NORTH;
        if(whereToGo == Direction.SOUTH)
            System.out.println("впереди пингвины");
        if(whereToGo == Direction.NORTH)
            System.out.println("берегись полярных медведей");

        whereToGo = Direction.EAST;
        System.out.println(whereToGo);
        whereToGo= Direction.SOUTH;
        System.out.println(whereToGo);

        Robot rob = new Robot(2, 7, Direction.EAST);
        System.out.println(rob);
        Robot rob2 = new Robot(3, 8, Direction.SOUTH);
        System.out.println(rob2);

        ArrayList<Robot> robots = new ArrayList<>();
        robots.add(rob2);
        robots.add(rob);
        System.out.println(robots);
        robots.add(new Robot(-9, 7, Direction.NORTH));
        System.out.println(robots);

        System.out.println("массив возможных значений: "+Arrays.toString(Direction.values()));
    }
}


