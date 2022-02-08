package racingcar.car.view;

public class CarOutputView {

	private CarOutputView() {
	}

	public static void printErrorMessage(IllegalArgumentException IAE) {
		System.out.println(IAE.getMessage());
	}
}
