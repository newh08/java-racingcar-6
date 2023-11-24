package racingcar.model.service;

import static racingcar.util.RandomNumberSupplier.supplyRandomNumber;

import java.util.List;
import racingcar.model.car.dto.CarDto;
import racingcar.model.CarDtoMapper;
import racingcar.model.cars.Cars;
import racingcar.repository.CarsRepository;
import racingcar.model.cars.dto.WinCarDto;
import racingcar.model.cars.WinCars;
import racingcar.util.CarConverter;

public class CarService {
    private final CarsRepository carsRepository;
    private Long saveId;

    public CarService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public void makeCars(List<String> inputCarNames) {
        Cars cars = CarConverter.convertCars(inputCarNames);
        saveId = carsRepository.save(cars);
    }

    public List<CarDto> moveCars() {
        checkSaveId();
        Cars cars = carsRepository.getCars(saveId);
        cars.moveCars(supplyRandomNumber());
        carsRepository.updateCars(saveId, cars);
        return CarDtoMapper.mapToCarDto(cars);
    }

    private void checkSaveId() {
        if (saveId == null) {
            throw new IllegalArgumentException();
        }
    }

    public WinCarDto findWinner() {
        checkSaveId();
        Cars cars = carsRepository.getCars(saveId);
        WinCars winner = cars.findWinner();
        return CarDtoMapper.mpaToWinCarDto(winner);
    }
}
