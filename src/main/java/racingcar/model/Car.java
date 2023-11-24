package racingcar.model;

public class Car {
    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.carPosition = CarPosition.initializeCarPosition();
    }
}
