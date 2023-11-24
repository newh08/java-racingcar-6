package racingcar.model.cars.dto;

import java.util.List;

public class WinCarDto {
    private final List<String> carNames;

    public WinCarDto(List<String> carNames) {
        this.carNames = carNames;
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
