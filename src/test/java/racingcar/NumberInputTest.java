package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.number.model.Number;
import racingcar.number.view.NumberInputView;

public class NumberInputTest {

	@Test
	void 숫자_입력_테스트() {
		//given
		final NumberInputView inputView = new NumberInputView();
		final String numberString = "1";
		//when
		final Number number = new Number(inputView.castNumberToInt(numberString));
		//then
		assertThat(number.getNumber()).isEqualTo(1);
	}
}
