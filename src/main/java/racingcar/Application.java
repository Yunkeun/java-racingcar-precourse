package racingcar;

import racingcar.controller.GameController;

public class Application {

	public static void main(String[] args) {
		// TODO 구현 진행
		// 수정한 부분: MVC 패턴에 의거 input, output은 Controller에서 하는게 알맞다.
		GameController controller = new GameController();
		controller.playRacing();
	}
}
