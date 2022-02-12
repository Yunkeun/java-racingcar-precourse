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

	public void controlRace(Cars cars, NumberOfRaces numberOfRaces) {
		carOutputView.printResult();
		for (int i = 0; i < numberOfRaces.getNumber(); i++) {
			carService.race(cars);
			carOutputView.printPositions(cars);
		}
		carOutputView.printWinners(carService.decideWinner(cars));
	}

	// Cars 내부에서 만들어서 처리해도 되는데, 그렇게 되면 인자로 들어오는 numberOfRaces가 먼저 생성된다.
	// public으로 열어 application에서 생성 후 주입시켜주었다.
	// 더 좋은 방법?? - 1. CarFactory 클래스 생성하여 application에서 생성 후 주입, 2. NumberOfRaces를 controlRace 내부 함수에서 생성 (생성자 주입)
	public Cars makeCars() {
		carOutputView.askCarNames();
		return new Cars(carInputView.writeCars());
	}
}
