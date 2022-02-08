package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

public class InputTest {

	private static final String COMMA = ",";

	@Test
	void 자동차_이름_쉼표_구분() {
		//given
		String answer1 = "car1";
		String answer2 = "car2";
		final InputView inputView = new InputView();

		//when
		String carsName1 = "car1";
		String carsName2 = "car1,car2";
		final List<String> carsNameList1 = InputView.divideNameBy(carsName1, COMMA);
		final List<String> carsNameList2 = InputView.divideNameBy(carsName2, COMMA);

		//then
		assertThat(carsNameList1.contains(answer1)).isEqualTo(true);

		assertThat(carsNameList2.contains(answer1)).isEqualTo(true);
		assertThat(carsNameList2.contains(answer2)).isEqualTo(true);
	}
}
