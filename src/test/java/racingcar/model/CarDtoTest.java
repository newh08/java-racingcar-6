package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarDtoTest {

    @DisplayName("test 라는 이름으로 Car 를 만든 후 DTO 로 변환하면 DTO 에 carName 이 test 로  저장된다.")
    @Test
    void carDtoTest() {
        Car car = new Car("test");
        CarDto carDto = CarDtoMapper.mapToCarDto(car);
        assertThat(carDto.getCarName()).isEqualTo("test");
    }

}