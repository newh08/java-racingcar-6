package racingcar.util;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.car.Car;
import racingcar.model.cars.Cars;

public class CarConverter {

    public static Cars convertCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(convertCar(carName));
        }
        return new Cars(cars);
    }

    private static Car convertCar(String carName) {
        return new Car(carName);
    }

}
