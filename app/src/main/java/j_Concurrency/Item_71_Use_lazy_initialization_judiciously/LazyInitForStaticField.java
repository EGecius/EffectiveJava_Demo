package j_Concurrency.Item_71_Use_lazy_initialization_judiciously;

/**
 * In contrary to what item 71, this idiom for lazy initialization for static fields does not work.
 * See tests.
 */
final class LazyInitForStaticField {

	public static boolean hasFieldBeenInitialized = false;

	private static final String field = computeFieldValue();

	private static String computeFieldValue() {
		hasFieldBeenInitialized = true;
		return "initialized";
	}

	public static String getField() {
		return field;
	}

	public static boolean isHasFieldBeenInitialized() {
		return hasFieldBeenInitialized;
	}


	public static class FieldHolder {
		public static boolean hasFieldBeenInitialized = false;

		private static final String field = computeFieldValue();

		private static String computeFieldValue() {
			hasFieldBeenInitialized = true;
			return "initialized";
		}

		public static String getField() {
			return field;
		}

		public static boolean isHasFieldBeenInitialized() {
			return hasFieldBeenInitialized;
		}

	}
}
