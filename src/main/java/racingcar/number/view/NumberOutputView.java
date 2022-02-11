package racingcar.number.view;

public class NumberOutputView {

	private static final String NOTICE_TRY_NUMBER = "시도할 회수는 몇회인가요?";

	public NumberOutputView() {
	}

	public void askTryNumber() {
		System.out.println(NOTICE_TRY_NUMBER);
	}
}
