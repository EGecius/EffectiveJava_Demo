package e_Generics.item_27_Favor_generic_methods;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link GenericSingletonFactory}
 */
public class GenericSingletonFactoryTest {

	GenericSingletonFactory<String> factory;

	@Before
	public void setup() {
		factory = new GenericSingletonFactory<>();
	}

	@Test
	public void when_parameterizedToString_then_acceptsOnlyStrings() {
		//WHEN
		GenericSingletonFactory.UnaryFunction<String> identityFunction = GenericSingletonFactory.getIdentityFunction();
		//THEN
		identityFunction.apply("string_1");

//		identityFunction.apply(4); // does not compile - not string
	}

	@Test
	public void when_parameterizedToInteger_then_acceptsOnlyIntegers() {
		//WHEN
		GenericSingletonFactory.UnaryFunction<Integer> identityFunction = GenericSingletonFactory.getIdentityFunction();
		//THEN
//		identityFunction.apply("string_1");  // does not compile - not integer

		identityFunction.apply(4);
	}

}