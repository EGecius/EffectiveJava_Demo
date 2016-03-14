package g_Methods.item_38_check_parameters_for_validity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Single Responsibility:
 *
 * Tests for {@link Assertions}
 */
public class AssertionsTest {

	Assertions assertions;

	@Before
	public void setup() {
		assertions = new Assertions();
	}

	@Test
	public void when_adding_then_resultCorrect() {
		//WHEN
		int result = assertions.addPositiveInts(2, 3);

		//THEN
		assertEquals(result, 5);
	}

	@Test (expected = AssertionError.class)
	public void when_passingFirstArgumentAsNegative_then_failsWithException() {
		//WHEN
		int result = assertions.addPositiveInts(-1, 3);
		//THEN - fails
	}


	@Test (expected = AssertionError.class)
	public void when_passingSecondArgumentAsNegative_then_failsWithException() {
		//WHEN
		int result = assertions.addPositiveInts(1, -3);
		//THEN - fails
	}

	@Test (expected = AssertionError.class)
	public void when_passingSecondArgumentAsNegative_then_failsWithException_2() {
		//WHEN
		int result = assertions.addPositiveIntsWithExceptions(1, -3);
		//THEN
	}

}