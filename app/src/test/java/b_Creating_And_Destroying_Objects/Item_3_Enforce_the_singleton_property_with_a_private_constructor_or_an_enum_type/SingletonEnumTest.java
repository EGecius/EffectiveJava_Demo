package b_Creating_And_Destroying_Objects.Item_3_Enforce_the_singleton_property_with_a_private_constructor_or_an_enum_type;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link SingletonEnum}
 */
public class SingletonEnumTest {

	@Test
	public void when_askingForInstanceMultipleTimes_then_sameInstanceReturend() {
		//WHEN
		SingletonEnum ref1 = SingletonEnum.INSTANCE;
		SingletonEnum ref2 = SingletonEnum.INSTANCE;
		SingletonEnum ref3 = SingletonEnum.INSTANCE;

		//THEN
		assertThat(ref1 == ref2).isTrue();
		assertThat(ref1 == ref3).isTrue();
	}

	@Test
	public void when_then() {
		//WHEN
		String title = SingletonEnum.INSTANCE.getTitle();
		//THEN
		assertThat(title).isEqualTo(SingletonEnum.Constants.MY_TITLE);
	}

}