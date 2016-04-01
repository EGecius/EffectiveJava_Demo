package f_Enums_And_Annotations.Item_30_use_enums_instead_of_int_constants;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyEnumTest {

	MyEnum myEnum;

	@Before
	public void setup() {
	}

	@Test
	public void when_values() {
		//WHEN
		MyEnum[] values = MyEnum.values();

		assertThat(values[0].toString()).isEqualTo("VIENAS");
		assertThat(values[1].toString()).isEqualTo("DU");
	}


	@Test
	public void when_ordinal() {
		//WHEN
		MyEnum[] values = MyEnum.values();

		assertThat(values[0].ordinal()).isEqualTo(0);
		assertThat(values[1].ordinal()).isEqualTo(1);

		assertThat(MyEnum.VIENAS.ordinal()).isEqualTo(0);
		assertThat(MyEnum.DU.ordinal()).isEqualTo(1);
	}

	@Test
	public void when_valueOf() {
		//WHEN
		MyEnum vienas = MyEnum.valueOf("VIENAS");
		assertThat(vienas == MyEnum.VIENAS).isTrue();
	}


}