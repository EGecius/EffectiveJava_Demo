package c_Methods_Common_to_All_Objects.Item_8_Obey_the_general_contract_when_overriding_equals;

final class ContactWithEquals {

	private final String name;
	private final String phoneNumber;

	public ContactWithEquals(final String name, final String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final ContactWithEquals that = (ContactWithEquals) o;

		if (!name.equals(that.name))
			return false;
		return phoneNumber.equals(that.phoneNumber);

	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + phoneNumber.hashCode();
		return result;
	}
}
