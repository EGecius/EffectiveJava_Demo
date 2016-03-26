package c_Methods_Common_to_All_Objects.Item_8_Obey_the_general_contract_when_overriding_equals;

final class ContactWithEqualsExtended extends ContactWithEquals {

	private String address;

	public ContactWithEqualsExtended(final String name, final String phoneNumber, String address) {
		super(name, phoneNumber);
		this.address = address;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ContactWithEqualsExtended))
			return false;
		if (!super.equals(o))
			return false;

		final ContactWithEqualsExtended that = (ContactWithEqualsExtended) o;

		return !(address != null ? !address.equals(that.address) : that.address != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (address != null ? address.hashCode() : 0);
		return result;
	}
}
