package e_Generics.Item_30_use_enums_instead_of_int_constants;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyEnumTest {

	StrategyEnum classUnderTest;

	@Before
	public void setup() {
	}

	@Test
	public void when__then() {
		//WHEN
		double overtimePay = StrategyEnum.MONDAY.calculateOvertimePay(8);
		assertThat(overtimePay).isEqualTo(0);


		double overtimePay2 = StrategyEnum.MONDAY.calculateOvertimePay(9);
		assertThat(overtimePay).isEqualTo(1.5);

		//THEN

	}

}