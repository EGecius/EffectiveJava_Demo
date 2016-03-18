package i_Exceptions.Item_59_avoid_unnecessary_use_of_checked_exceptions;

/**
 * Shows how Checked exceptions can be turned to more flexible code
 */
final class CheckedExceptionAlternative {

	void checkedExceptionThrownForNegativeValues(int x) throws Exception {
		if (x < 0) {
			throw new Exception();
		}
	}

	void uncheckedExceptionThrownForNegativeValues(int x) throws IllegalArgumentException {
		if (x < 0) {
			throw new IllegalArgumentException();
		}
	}

	boolean noExceptionWillBeThrown(int x) {
		return x >= 0;
	}

	public void alternativeToCheckedException(int x) {
		if (x < 0) {
			throw new IllegalArgumentException();
		}
	}

}
