package g_Methods.item_37_check_parameters_for_validity;

/**
 * Shows use of 'assert' statements
 */
public class Assertions {

	/** Lint shows warnings when you use 'assert' statements - not good for Anroid */
	int addPositiveInts(int x, int y) {

		assert x >= 0;
		assert y >= 0;

		return x + y;
	}

	/** Lint shows warnings when you use 'assert' statements - not good for Anroid */
	int addPositiveIntsWithExceptions(int x, int y) {

		if (x < 0 || y < 0) {
			throw new AssertionError();
		}

		return x + y;
	}


}
