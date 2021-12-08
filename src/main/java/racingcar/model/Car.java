package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private final String name;
	private int position = 0;
	private static final int MINIMUM_RANDOM_RANGE = 0;
	private static final int MAXIMUM_RANDOM_RANGE = 9;
	private static final int MOVE_CONDITION_NUMBER = 4;

	public Car(String name) {
		// 수정이 필요한 부분: 여기서 name이 null이 들어가면 어떻게 처리할 것인가? => Name 자체를 객체로 만들어 내부에서 처리하게끔 하기
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	// 추가 기능 구현
	private int makeRandomNumber() {
		return Randoms.pickNumberInRange(MINIMUM_RANDOM_RANGE, MAXIMUM_RANDOM_RANGE);
	}

	private boolean checkMoveForward() {
		int randomNumber = makeRandomNumber();
		return randomNumber >= MOVE_CONDITION_NUMBER;
	}

	// 수정한 부분: getMovedPosition이라는 메소드를 통해 접근하지 않고 컨트롤러를 통해 접근하여 position을 증가시킬 뿐 아니라 view도 컨트롤러에서 작동하기 만든다.
	public void movePosition() {
		if (checkMoveForward()) {
			position++;
		}
	}

	public int getCurrentPosition() {
		return position;
	}

	public String getWinnerName(int firstPosition) {
		// 수정이 필요한 부분: 마찬가지로 firstPosition에 음수가 들어가면 어떻게 처리할 것인가?? => Position 객체를 만들어 내부에서 처리하게끔 하기
		if (position == firstPosition) {
			return name;
		}
		return null;
	}
}
