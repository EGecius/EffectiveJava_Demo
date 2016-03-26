package c_Methods_Common_to_All_Objects.Item_8_Obey_the_general_contract_when_overriding_equals;

/**
 * Simple data structure class which does not override equals
 */
@SuppressWarnings ("FieldCanBeLocal")
final class ContactWithoutEquals {

	private final String name;
	private final String phoneNumber;

	public ContactWithoutEquals(final String name, final String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}
