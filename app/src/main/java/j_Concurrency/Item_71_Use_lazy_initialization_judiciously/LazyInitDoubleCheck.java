package j_Concurrency.Item_71_Use_lazy_initialization_judiciously;

/**
 * This idiom allows avoiding expensive 'synchronized' keyword for every method access
 */
final class LazyInitDoubleCheck {

	private volatile String field;

	@SuppressWarnings ("ConstantConditions")
	String getFieldWithSynchronized() {
		String result = field; // first check - no lock

		if (result == null) {
			synchronized (this) {
				if (result == null) {
					field = result = computeFieldValue();
				}
			}
		}

		return result;
	}

	private String computeFieldValue() {
		return "string";
	}

}
