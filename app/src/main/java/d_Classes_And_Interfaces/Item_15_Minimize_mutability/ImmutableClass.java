package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

/**
 * 3 Requirements:
 * 1) class is final
 * 2) all immutable fields are final
 * 3) no access to mutable fields
 */
final class ImmutableClass {

	private final String title;
	private final int id;
	/** Must not be exposed externally since every array is mutable */
	private final String[] mutableArray = new String[5];

	public ImmutableClass(String title, int id) {
		this.title = title;
		this.id = id;

		mutableArray[0] = title;
	}

	public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}
}
