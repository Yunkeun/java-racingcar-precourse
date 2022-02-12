package racingcar.car.controller;

import racingcar.car.model.Cars;
import racingcar.car.service.CarService;
import racingcar.car.view.CarInputView;
import racingcar.car.view.CarOutputView;
import racingcar.number.model.NumberOfRaces;

public class CarController {

	private final CarInputView carInputView;
	private final CarOutputView carOutputView;
	private final CarService carService;

	public CarController(CarInputView carInputView, CarOutputView carOutputView, CarService carService) {
		this.carInputView = carInputView;
		this.carOutputView = carOutputView;
		this.carService = carService;
	}

	public void controlRace(NumberOfRaces numberOfRaces) {
		final Cars cars = makeCars();
		carOutputView.printResult();
		for (int i = 0; i < numberOfRaces.getNumber(); i++) {
			carService.race(cars);
			carOutputView.printPositions(cars);
		}
	}

	private Cars makeCars() {
		carOutputView.askCarNames();
		return new Cars(carInputView.writeCars());
	}
}
