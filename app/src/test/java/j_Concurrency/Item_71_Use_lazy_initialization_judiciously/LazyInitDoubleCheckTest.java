package j_Concurrency.Item_71_Use_lazy_initialization_judiciously;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link LazyInitDoubleCheck}
 */
public class LazyInitDoubleCheckTest {

	LazyInitDoubleCheck lazy;

	@Before
	public void setup() {
		lazy = new LazyInitDoubleCheck();
	}

	@SuppressWarnings ({"ConstantConditions", "StringEquality"})
	@Test
	public void when_synchronizedMethodCalled_then_alwaysSameValueReturned() {
		//WHEN
		String field1 = lazy.getFieldWithSynchronized();

		for (int i = 0; i < 10000000; i++) {
			String field2 = lazy.getFieldWithSynchronized();
			assertThat(field1 == field2).isTrue();
		}
	}

}