package f_Enums_And_Annotations.Item_34_Emulate_extensible_enums_with_interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link PowerOf}
 */
public class PowerOfTest {

	PowerOf power;

	@Before
	public void setup() {
		power = new PowerOf();
	}

	@Test
	public void when_2_power_of_3() {
		//WHEN
		float result = power.apply(2, 3);
		//THEN
		assertThat(result).isEqualTo(8);
	}

	@Test
	public void when_5_power_of_3() {
		//WHEN
		float result = power.apply(5, 3);
		//THEN
		assertThat(result).isEqualTo(125);
	}

}