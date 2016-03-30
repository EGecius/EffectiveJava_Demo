package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

import java.util.List;

/**
 * Shows that even seemingly immutable List wrapper class is actually mutable if copies are not made
 */
final class MutableListWrapper {

	private final List<String> list;

	public MutableListWrapper(final List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}
}
