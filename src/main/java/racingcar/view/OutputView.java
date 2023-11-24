package racingcar.view;

import java.util.List;
import racingcar.model.car.dto.CarDto;
import racingcar.model.cars.dto.WinCarDto;

public class OutputView {

    public void printResultStartMessage() {
        System.out.println("실행 결과");
    }

    public void printRaceResult(List<CarDto> carDto) {
        for (CarDto dto : carDto) {
            String movePath = "-".repeat(dto.getCarPosition());
            System.out.printf("%s : %s\n", dto.getCarName(), movePath);
        }
        System.out.println(" ");
    }

    public void printWinner(WinCarDto winCarDto) {
        String winnerMessage = String.join(", ", winCarDto.getCarNames());
        System.out.printf("최종 우승자 : %s", winnerMessage);
    }
}
