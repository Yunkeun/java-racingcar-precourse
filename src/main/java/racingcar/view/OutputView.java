package racingcar.view;

public class OutputView {

	private OutputView() {
	}

	public static void printErrorMessage(IllegalArgumentException IAE) {
		System.out.println(IAE.getMessage());
	}
}
