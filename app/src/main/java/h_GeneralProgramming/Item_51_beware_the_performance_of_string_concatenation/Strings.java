package h_GeneralProgramming.Item_51_beware_the_performance_of_string_concatenation;

/**
 * Shows how using {@link StringBuilder} is much superior to concatenation
 */
final class Strings {

	String concatenate(int times) {

		String result = "";

		for (int i = 0; i < times; i++) {
			result += "a";
		}

		return result;
	}

	String addViaStringBuilder(int times) {

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < times; i++) {
			stringBuilder.append("a");
		}

		return stringBuilder.toString();
	}

}
