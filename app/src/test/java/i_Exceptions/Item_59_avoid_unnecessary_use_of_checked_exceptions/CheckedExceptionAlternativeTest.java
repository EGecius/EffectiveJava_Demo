package i_Exceptions.Item_59_avoid_unnecessary_use_of_checked_exceptions;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link CheckedExceptionAlternative}
 */
public class CheckedExceptionAlternativeTest {

	CheckedExceptionAlternative alternative;

	@Before
	public void setup() {
		alternative = new CheckedExceptionAlternative();
	}

	@Test
	public void when_checkedExceptionMethodUsed_thenTryCatchBlockRequired_and() {
		//WHEN
		try {
			alternative.checkedExceptionThrownForNegativeValues(0);
		} catch (Exception e) {
			throw new AssertionError();
		}
		//THEN
			// does not fail
	}

	@Test (expected = AssertionError.class)
	public void when_checkedExceptionMethodUsed_then_tryCatchBlockRequired_and_errorIsRethrown() {
		//WHEN
		try {
			alternative.checkedExceptionThrownForNegativeValues(-1);
		} catch (Exception e) {
			throw new AssertionError();
		}
		//THEN
		//exception thrown
	}

	@Test (expected = IllegalArgumentException.class)
	public void when_checkedUnExceptionMethodUsed_then_noTryCatchBlockRequired() {
		//WHEN
		alternative.uncheckedExceptionThrownForNegativeValues(-1);
		//THEN
		//exception thrown
	}

	@Test
	public void when_checkedPriorToCallingWhetherExceptionWillBeThrown_then_canBeCalledSafely() {
		//WHEN
		if (alternative.noExceptionWillBeThrown(-1)) {
			alternative.alternativeToCheckedException(-1);
		} else {
			//handle exception condition
		}
		//THEN
	}

	@Test
	public void when_checkedPriorToCallingWhetherExceptionWillBeThrown_then_canBeCalledSafely_2() {
		//WHEN
		if (alternative.noExceptionWillBeThrown(0)) {
			alternative.alternativeToCheckedException(0);
		} else {
			//handle exception condition
		}
		//THEN
	}

}