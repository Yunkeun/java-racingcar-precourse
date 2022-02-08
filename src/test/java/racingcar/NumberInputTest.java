package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.view.InputView;

public class NumberInputTest {

	@Test
	void 숫자_입력_테스트() {
		//given
		InputView inputView = new InputView();
		String numberString = "1";
		//when
		int number = inputView.castNumberToInt(numberString);
		//then
		assertThat(number).isEqualTo(1);
	}
}
