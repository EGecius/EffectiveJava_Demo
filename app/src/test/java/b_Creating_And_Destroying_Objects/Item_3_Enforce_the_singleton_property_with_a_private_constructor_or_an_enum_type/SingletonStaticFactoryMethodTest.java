package b_Creating_And_Destroying_Objects.Item_3_Enforce_the_singleton_property_with_a_private_constructor_or_an_enum_type;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link SingletonStaticFactoryMethod}
 */
public class SingletonStaticFactoryMethodTest {

	SingletonStaticFactoryMethod singleton;

	@Test
	public void when_askingForInstanceMultipleTimes_then_sameInstanceReturend() {
		//WHEN
		SingletonStaticFactoryMethod reference1 = SingletonStaticFactoryMethod.getInstance();
		SingletonStaticFactoryMethod reference2 = SingletonStaticFactoryMethod.getInstance();
		SingletonStaticFactoryMethod reference3 = SingletonStaticFactoryMethod.getInstance();

		//THEN
		assertThat(reference1 == reference2).isTrue();
		assertThat(reference1 == reference3).isTrue();
	}

}