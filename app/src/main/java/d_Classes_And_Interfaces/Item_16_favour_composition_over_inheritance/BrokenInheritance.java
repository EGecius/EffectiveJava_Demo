package d_Classes_And_Interfaces.Item_16_favour_composition_over_inheritance;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.HashSet;

/**
 * This is broken because addAll() method relies on add() method
 */
final class BrokenInheritance<E> extends HashSet<E> {

	/** Number of attempted element insertions */
	private int addCount;

	@Override
	public boolean add(E object) {
		addCount++;
		return super.add(object);
	}

	@Override
	public boolean addAll(@NonNull Collection<? extends E> collection) {
		addCount += collection.size();
		return super.addAll(collection);
	}

	public int getAddCount() {
		return addCount;
	}

}
