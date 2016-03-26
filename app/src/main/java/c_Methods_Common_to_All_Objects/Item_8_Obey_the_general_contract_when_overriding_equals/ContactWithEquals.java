package c_Methods_Common_to_All_Objects.Item_8_Obey_the_general_contract_when_overriding_equals;

class ContactWithEquals {

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
		if (!(o instanceof ContactWithEquals))
			return false;

		final ContactWithEquals that = (ContactWithEquals) o;

		if (!name.equals(that.name))
			return false;
		return !(phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null);

	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
		return result;
	}
}
