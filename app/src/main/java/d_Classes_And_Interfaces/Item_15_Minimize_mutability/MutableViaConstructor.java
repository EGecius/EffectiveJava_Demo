package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

/**
 * This class looks like immutable but is not. It has a mutable array injectable through interface
 */
public final class MutableViaConstructor {

	private final String title;
	private final int id;
	private String[] mutableArray;

	public MutableViaConstructor(String title, int id, String[] mutableArray) {
		this.title = title;
		this.id = id;
		this.mutableArray = mutableArray;
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
