package c_Methods_Common_to_All_Objects.Item_10_Always_override_toString;

/**
 * Shows example of overriding to string
 */
final class ToStringSample {

	private final String firstName;
	private final String lastName;

	public ToStringSample(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/** Generated by Android Studio */
	@Override
	public String toString() {
		return "ToStringSample{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}