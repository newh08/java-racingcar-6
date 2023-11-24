package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.car.Car;

public class CarTest {
    private Car car;

    @BeforeEach
    void initCar() {
        car = new Car("test");
    }

    @DisplayName("자동차 이동 값이 4인 경우 자동차는 전진한다.")
    @Test
    void carMoveTest_1() {
        car.moveCar(4);
        assertThat(car.getCarPosition().getCarPosition()).isEqualTo(1);
    }

    @DisplayName("자동차 이동 값이 3인 경우 자동차는 전진하지 않는다.")
    @Test
    void carMoveTest_2() {
        car.moveCar(3);
        assertThat(car.getCarPosition().getCarPosition()).isEqualTo(0);
    }
}
