package racingcar.controller;

import java.util.List;
import racingcar.model.car.dto.CarDto;
import racingcar.model.service.CarService;
import racingcar.model.TryCount;
import racingcar.model.cars.dto.WinCarDto;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarController {
    private final CarService carService;
    private final InputView inputView;
    private final OutputView outputView;

    public CarController(CarService carService, InputView inputView, OutputView outputView) {
        this.carService = carService;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> inputCarName = inputView.readCarNames();
        carService.makeCars(inputCarName);
        int inputTryCount = inputView.readTryCount();
        TryCount tryCount = new TryCount(inputTryCount);
        outputView.printResultStartMessage();
        for (int i = 0; i < tryCount.getTryCount(); i++) {
            List<CarDto> carDtos = carService.moveCars();
            outputView.printRaceResult(carDtos);
        }
        WinCarDto winner = carService.findWinner();
        outputView.printWinner(winner);
    }
}
