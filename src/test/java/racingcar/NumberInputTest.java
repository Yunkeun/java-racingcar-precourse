package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberInputTest {

	@Test
	void 숫자_입력_테스트() {
		//given
		String numberString = "1";
		//when
		Number number = new Number(numberString);
		//then
		assertThat(number.getNumber()).isEqualTo(1);
	}
}
