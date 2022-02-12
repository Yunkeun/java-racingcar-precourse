package racingcar.car.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	// 기존 자동차 객체들 중 우승자 자동차들을 리턴하려고 한다.
	// 새로운 Cars 객체를 리턴 vs List<Car> 리턴
	public Cars calculateWinners() {
		final List<Car> winners = new ArrayList<>();
		final int firstPosition = calculateFirstPosition();
		for (Car car : cars) {
			if (car.getPosition() == firstPosition) {
				winners.add(car);
			}
		}
		return new Cars(winners);
	}

	private int calculateFirstPosition() {
		int firstPosition = 0;
		for (Car car : cars) {
			firstPosition = car.compareFirstPosition(firstPosition);
		}
		return firstPosition;
	}
}
