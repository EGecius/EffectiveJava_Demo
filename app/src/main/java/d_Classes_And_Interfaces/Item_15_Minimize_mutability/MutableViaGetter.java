package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

/**
 * This class looks like immutable but actually has a mutable array exposed
 */
public final class MutableViaGetter {

	private final String title;
	private final int id;
	/** Must not be exposed externally since every array is mutable */
	private final String[] mutableArray = new String[5];

	public MutableViaGetter(String title, int id) {
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

	public String[] getMutableArray() {
		return mutableArray;
	}
}
