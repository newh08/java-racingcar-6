package racingcar.repository;

import java.util.HashMap;
import java.util.Map;
import racingcar.model.cars.Cars;

public class CarsRepository {
    private static CarsRepository instance;

    private final Map<Long, Cars> carsRepository;
    private Long key;

    private CarsRepository() {
        this.carsRepository = new HashMap<>();
        key = 0L;
    }

    public static CarsRepository getInstance() {
        if (instance == null) {
            instance = new CarsRepository();
        }
        return instance;
    }

    public Long save(Cars cars) {
        carsRepository.put(key, cars);
        return key++;
    }

    public void updateCars(Long id, Cars cars) {
        carsRepository.put(id, cars);
    }

    public Cars getCars(Long id) {
        return carsRepository.get(id);
    }
}
