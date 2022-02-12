package racingcar;

import racingcar.car.controller.CarController;
import racingcar.car.service.CarServiceImpl;
import racingcar.car.view.CarInputView;
import racingcar.car.view.CarOutputView;
import racingcar.number.controller.NumberController;
import racingcar.number.view.NumberInputView;
import racingcar.number.view.NumberOutputView;

public class Application {

	public static void main(String[] args) {
		// TODO 구현 진행
		final CarController carController = new CarController(new CarInputView(), new CarOutputView(), new CarServiceImpl());
		final NumberController numberController = new NumberController(new NumberInputView(), new NumberOutputView());
		carController.controlRace(numberController.makeNumberOfRaces());
	}
}
