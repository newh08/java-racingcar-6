package racingcar.model.car;

public class Car {
    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.carPosition = CarPosition.initializeCarPosition();
    }

    public CarName getCarName() {
        return carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }

    public void moveCar(int randomNumber) {
        carPosition.movingCarPosition(randomNumber);
    }

    public boolean samePosition(CarPosition carPosition) {
        return this.carPosition.equals(carPosition);
    }
}
