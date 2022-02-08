package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.model.Number;
import racingcar.view.InputView;

public class NumberInputTest {

	@Test
	void 숫자_입력_테스트() {
		//given
		final InputView inputView = new InputView();
		final String numberString = "1";
		//when
		final Number number = new Number(inputView.castNumberToInt(numberString));
		//then
		assertThat(number.getNumber()).isEqualTo(1);
	}
}
