package h_GeneralProgramming.Item_49_Prefer_primitive_types_to_boxed_primitives;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link BoxedPrimitives}
 */
public class BoxedPrimitivesTest {

	BoxedPrimitives mSut;

	@Before
	public void setup() {
		mSut = new BoxedPrimitives();
	}

	/** I think, this may fail depending on JVM. The ones with don't reuse Integer objects would fail this */
	@Test
	public void when_comparingBoxedIntsByReference_then_comparisonFailsOnSomeJVMs() {
		//WHEN
		Integer integer1 = mSut.getInteger(42);
		Integer integer2 = mSut.getInteger(42);
		//THEN
		assertThat(integer1 == integer2).isTrue();
	}

	@Test
	public void when_comparingBoxedAndLiteral_then_boxedGetsAutoUnboxed() {
		//WHEN
		Integer integer1 = mSut.getInteger(42);
		//THEN
		assertThat(integer1 == 42).isTrue();
	}

	@Test
	public void when_comparingBoxedIntAndLongByReference_then_comparilationFails() {
		//WHEN
		Integer integer1 = mSut.getInteger(42);
		Long long1 = mSut.getLong(42);
		//THEN - the following does not compile
//		assertThat(integer1 == long1).isTrue();
	}

}