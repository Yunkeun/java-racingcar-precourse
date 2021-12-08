package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.utils.ExceptionUtils;

public class InputView {

	private static final String CAR_NAME_DELIMITER = ",";

	private InputView() {
	}

	// 수정한 부분: 변수를 선언 -> 정의가 아닌 동시에 한다.
	// 또한, 다른 예외 발생 시 모두 e로 하면 오해의 소지가 발생할 수 있으니 IllegalArgumentException에 대해서 축약어인 IAE를 사용한다.
	public static List<String> writeCarNames() {
		OutputView.askCarNames();
		String inputCarNames = Console.readLine();
		List<String> carNames = Arrays.asList(inputCarNames.split(CAR_NAME_DELIMITER));
		try {
			ExceptionUtils.validateCarNames(inputCarNames, carNames);
		} catch (IllegalArgumentException IAE) {
			OutputView.printError(IAE);
			carNames = writeCarNames();
		}
		return carNames;
	}

	// 수정한 부분: 필요없는 인스턴스 변수 할당 => try문과 catch문 내에서 리턴을 각각 해주며 필요없는 인스턴스 변수 삭제
	public static int writeNumberOfAttempts() {
		String inputNumber;

		OutputView.askNumberOfAttempts();
		inputNumber = Console.readLine();
		try {
			ExceptionUtils.validateNumberOfAttempts(inputNumber);
			return Integer.parseInt(inputNumber);
		} catch (IllegalArgumentException IAE) {
			OutputView.printError(IAE);
			return writeNumberOfAttempts();
		}
	}
}
