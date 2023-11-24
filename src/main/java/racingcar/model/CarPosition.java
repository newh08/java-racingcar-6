package racingcar.model;

public class CarPosition {
    private static final int MINIMUM_MOVE_RANDOM_NUMBER = 4;
    private static final int MOVE_SLOT = 1;

    private int carPosition;

    private CarPosition(int carPosition) {
        this.carPosition = carPosition;
    }

    public static CarPosition initializeCarPosition() {
        return new CarPosition(0);
    }

    public int getCarPosition() {
        return carPosition;
    }

    public void movingCarPosition(int randomNumber) {
        if (decidingWhetherMove(randomNumber)) {
            carPosition += MOVE_SLOT;
        }
    }

    private boolean decidingWhetherMove(int randomNumber) {
        return randomNumber >= MINIMUM_MOVE_RANDOM_NUMBER;
    }
}
