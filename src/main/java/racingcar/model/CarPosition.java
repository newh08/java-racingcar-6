package racingcar.model;

public class CarPosition {
    private int carPosition;

    private CarPosition(int carPosition) {
        this.carPosition = carPosition;
    }

    public static CarPosition initializeCarPosition() {
        return new CarPosition(0);
    }
}
