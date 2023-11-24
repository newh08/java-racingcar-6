package racingcar;

import racingcar.controller.CarController;
import racingcar.model.service.CarService;
import racingcar.repository.CarsRepository;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class AppConfig {

    public CarController controller() {
        return new CarController(carService(), inputView(), outputView());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    private CarsRepository carsRepository() {
        return CarsRepository.getInstance();
    }

    private CarService carService() {
        return new CarService(carsRepository());
    }
}
