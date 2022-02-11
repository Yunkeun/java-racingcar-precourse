package racingcar.car.controller;

import java.util.List;
import racingcar.car.model.Car;
import racingcar.car.view.CarInputView;
import racingcar.car.view.CarOutputView;

public class CarController {

	private final CarInputView carInputView;
	private final CarOutputView carOutputView;

	public CarController(CarInputView carInputView, CarOutputView carOutputView) {
		this.carInputView = carInputView;
		this.carOutputView = carOutputView;
	}

	public List<Car> makeCars() {
		carOutputView.askCarNames();
		return carInputView.writeCars();
	}
}
