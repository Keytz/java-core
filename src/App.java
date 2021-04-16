import com.keytz.*;

public class App {

    public static void main(String[] args) {

        RunnableJumpable[] mens = {
                new Men(),
                new Cat(),
                new Robot()
        };

        Bariers[] bariers = {
                new Treadmill(1000),
                new Walls(3)
        };
        for (RunnableJumpable men : mens) {
            for (Bariers barier : bariers) {
                if (barier.toJump(men.getHeight())) {
                    men.jump();
                }
                if (barier.toRun(men.getProbeg())) {
                    men.run();
                }
            }
        }

    }

}
