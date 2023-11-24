package racingcar.model.cars;

import java.util.List;
import racingcar.model.car.Car;

public class WinCars extends Cars {

    public WinCars(List<Car> cars) {
        super(cars);
    }

    public List<String> getCarNames() {
        return super.getCarNames();
    }
}
