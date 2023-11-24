package racingcar.model;

public class CarDtoMapper {

    public static CarDto mapToCarDto(Car car) {
        CarName carName = car.getCarName();
        CarPosition carPosition = car.getCarPosition();
        return new CarDto(carName.getCarName(), carPosition.getCarPosition());
    }
}
