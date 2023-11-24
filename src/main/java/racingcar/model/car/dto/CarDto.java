package racingcar.model.car.dto;

public class CarDto {
    private final String carName;
    private final int carPosition;

    public CarDto(String carName, int carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPosition() {
        return carPosition;
    }
}
