package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.view.InputView;

public class InputTest {

	@Test
	void 자동차_이름_쉼표_구분() {
		//given
		final String answer1 = "car1";
		final String answer2 = "car2";
		final InputView inputView = new InputView();

		//when
		final String carsName1 = "car1";
		final String carsName2 = "car1,car2";
		final List<String> carsNameList1 = inputView.splitName(carsName1);
		final List<String> carsNameList2 = inputView.splitName(carsName2);

		//then
		assertThat(carsNameList1.contains(answer1)).isEqualTo(true);

		assertThat(carsNameList2.contains(answer1)).isEqualTo(true);
		assertThat(carsNameList2.contains(answer2)).isEqualTo(true);
	}
}
