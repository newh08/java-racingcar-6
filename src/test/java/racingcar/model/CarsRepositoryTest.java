package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.repository.CarsRepository;
import racingcar.util.CarConverter;

class CarsRepositoryTest {

    @Test
    void test() {
        CarsRepository carsRepository = CarsRepository.getInstance();
        Long fistSaveId = carsRepository.save(CarConverter.convertCars(List.of("test")));
        assertThat(fistSaveId).isEqualTo(0);
        Long secondSaveId = carsRepository.save(CarConverter.convertCars(List.of("test")));
        assertThat(secondSaveId).isEqualTo(1);
    }
}