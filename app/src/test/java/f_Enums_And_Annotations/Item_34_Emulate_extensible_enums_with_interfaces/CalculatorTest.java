package f_Enums_And_Annotations.Item_34_Emulate_extensible_enums_with_interfaces;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Calculator}
 */
public class CalculatorTest {

	@Test
	public void add() {
		//WHEN
		double result = Calculator.ADD.apply(2, 7);
		//THEN
		assertThat(result).isEqualTo(9);
	}

	@Test
	public void divide() {
		//WHEN
		double result = Calculator.DIVIDE.apply(7, 2);
		//THEN
		assertThat(result).isEqualTo(3.5f);
	}

}