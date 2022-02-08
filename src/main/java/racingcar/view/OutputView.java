package racingcar.view;

public class OutputView {

	public OutputView() {
	}

	public void printErrorMessage(IllegalArgumentException IAE) {
		System.out.println(IAE.getMessage());
	}
}
