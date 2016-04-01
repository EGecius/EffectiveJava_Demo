package f_Enums_And_Annotations.Item_34_Emulate_extensible_enums_with_interfaces;

/**
 * Calculates power of a number, e.g. 2 to the power of 3 is 2*2*2 = 8
 */
final class PowerOf implements Operation {

	@Override
	public double apply(final int base, final int power) {

		int result = 1;
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		return result;
	}

}
