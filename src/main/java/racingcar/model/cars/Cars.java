package racingcar.model.cars;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import racingcar.model.car.Car;
import racingcar.model.car.CarName;
import racingcar.model.car.CarPosition;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCars(Supplier<Integer> randomNumberSupplier) {
        for (Car car : cars) {
            car.moveCar(randomNumberSupplier.get());
        }
    }

    public WinCars findWinner() {
        CarPosition highestPosition = findHighestPosition();
        List<Car> winCars = cars.stream()
                .filter(car -> car.samePosition(highestPosition))
                .toList();

        return new WinCars(winCars);
    }

    private CarPosition findHighestPosition() {
        return cars.stream()
                .map(Car::getCarPosition)
                .max(Comparator.comparing(CarPosition::getCarPosition))
                .orElseThrow();
    }

    public List<String> getCarNames() {
        return cars.stream()
                .map(Car::getCarName)
                .map(CarName::getCarName)
                .toList();
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
