package c_Methods_Common_to_All_Objects.Item_9_Always_override_hashCode_when_you_override_equals;

/** Class which overrides equals() but not hashCode(). Failing to do it breaks contract of hashCode() */
final class WithEqualsWithoutHashCode {

	private final String title;
	private int id;

	public WithEqualsWithoutHashCode(final String title, final int id) {
		this.title = title;
		this.id = id;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (!(o instanceof WithEqualsWithoutHashCode))
			return false;

		final WithEqualsWithoutHashCode that = (WithEqualsWithoutHashCode) o;

		if (id != that.id)
			return false;
		return !(title != null ? !title.equals(that.title) : that.title != null);

	}

// // commented out on purpose

//	@Override
//	public int hashCode() {
//		int result = title != null ? title.hashCode() : 0;
//		result = 31 * result + id;
//		return result;
//	}
}
