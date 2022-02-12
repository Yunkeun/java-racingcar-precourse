package racingcar.util;

import racingcar.car.view.CarOutputView;

public class ErrorMessage {

	public static final String ERROR_HEADER = "[ERROR]";
	public static final String LENGTH_ERROR_MESSAGE = "잘못된 차량의 길이가 입력되었습니다.";
	public static final String NEGATIVE_NUMBER_ERROR_MESSAGE = "양의 정수만 입력 가능합니다.";

	private ErrorMessage() {
	}

	public static void printErrorMessage(IllegalArgumentException IAE) {
		final CarOutputView carOutputView = new CarOutputView();
		carOutputView.printErrorMessage(IAE);
	}
}
