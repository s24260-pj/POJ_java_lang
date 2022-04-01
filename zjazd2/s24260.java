package gamers;

import main.Pair;
import main.Unit;
import java.util.Random;

public class s24260 extends Unit {
    public s24260(String id, Pair<Double, Double> position, double rotate, CollisionModel model) {
        super(id, position, rotate, model);
    }

    @Override
    public void run() {
        this.enableStopOnWall();
        this.forward();
        this.enableMovement();

        while (true) {
            Random rand = new Random();
            int int_random = rand.nextInt(100);

            switch (whatIsInRange()) {
                case 0:
                    if (int_random >= 80 && int_random < 99) rotateLeft();
                    if (int_random >= 60 && int_random < 80) rotateRight();

                    if (int_random == 36 || int_random == 14) rotateLeft();
                    if (int_random == 4 || int_random == 10) rotateRight();
                    break;
                case 1:
                case 2:
                    if (this.nearestCollision() <= 2) rotateBy(30);
                    break;
                case 3:
                    this.attackInNextMove();
                    break;
            }
        }
    }
}
