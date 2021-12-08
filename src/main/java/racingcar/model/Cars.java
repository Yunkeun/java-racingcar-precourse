package racingcar.model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {

	private final List<Car> cars;
	private static final String WINNER_NAME_DELIMITER = ", ";

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	// 수정한 부분: 네이밍 get-> calculate, 또한 변수 할당을 하지 않으면서 발생할 수 있는 side effect를 방지하고 코드 길이도 줄일 수 있다.
	private int calculateFirstPosition() {
		return cars.stream().mapToInt(Car::getCurrentPosition)
			.max()
			.getAsInt();
	}

	// 수정한 부분: firstPosition을 인자로 받는 대신 객체 내에서 계산하여 가져온다.
	public String getWinner() {
		int firstPosition = calculateFirstPosition();
		return cars.stream().map(car -> car.getWinnerName(firstPosition))
			.filter(Objects::nonNull)
			.collect(Collectors.joining(WINNER_NAME_DELIMITER));
	}
}
