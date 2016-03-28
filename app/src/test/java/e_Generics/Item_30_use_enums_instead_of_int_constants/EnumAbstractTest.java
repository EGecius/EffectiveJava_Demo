package e_Generics.Item_30_use_enums_instead_of_int_constants;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Single Responsibility:
 *
 * Tests for {@link EnumAbstract}
 */

public class EnumAbstractTest {

	EnumAbstract enumAbstract;

	@Before
	public void setup() {
	}

	@Test
	public void when__then() {
		//WHEN
		double result = EnumAbstract.ADD.apply(6, 3);
		assertThat(result).isEqualTo(9);


		double result1 = EnumAbstract.SUBTRACT.apply(6, 3);
		assertThat(result1).isEqualTo(3);

		double result2 = EnumAbstract.MULTIPLY.apply(6, 3);
		assertThat(result2).isEqualTo(18);

		double result3 = EnumAbstract.DIVIDE.apply(6, 3);
		assertThat(result3).isEqualTo(2);

	}

}