package racingcar;

import racingcar.controller.CarController;

public class Application {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        CarController controller = appConfig.controller();
        controller.run();
    }
}
