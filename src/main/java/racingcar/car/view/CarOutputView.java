package racingcar.car.view;

public class CarOutputView {

	private static final String NOTICE_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public CarOutputView() {
	}

	public void printErrorMessage(IllegalArgumentException IAE) {
		System.out.println(IAE.getMessage());
	}

	public void askCarNames() {
		System.out.println(NOTICE_CAR_NAMES);
	}
}
