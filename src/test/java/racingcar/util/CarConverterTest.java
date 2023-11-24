package racingcar.util;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.cars.Cars;

class CarConverterTest {

    @DisplayName("자동차 이름 입력값을 Cars 객체로 변환시켜 준다.")
    @Test
    void carsConvertTest() {
        List<String> input = List.of("one", "two");
        Assertions.assertThat(CarConverter.convertCars(input)).isInstanceOf(Cars.class);
    }

}