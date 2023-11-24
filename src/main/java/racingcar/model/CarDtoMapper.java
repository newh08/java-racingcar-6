package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.car.Car;
import racingcar.model.car.dto.CarDto;
import racingcar.model.car.CarName;
import racingcar.model.car.CarPosition;
import racingcar.model.cars.Cars;
import racingcar.model.cars.WinCars;
import racingcar.model.cars.dto.WinCarDto;

public class CarDtoMapper {

    public static List<CarDto> mapToCarDto(Cars cars) {
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars.getCars()) {
            CarName carName = car.getCarName();
            CarPosition carPosition = car.getCarPosition();
            carDtos.add(new CarDto(carName.getCarName(), carPosition.getCarPosition()));
        }
        return carDtos;
    }

    public static WinCarDto mpaToWinCarDto(WinCars winCars) {
        List<String> carNames = winCars.getCarNames();
        return new WinCarDto(carNames);
    }
}
