package d_Classes_And_Interfaces.Item_16_favour_composition_over_inheritance;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Set;

/**
 * Unlike {@link BrokenInheritance}, this is not broken because extended class does not have methods relying on each
 * other.
 */
final class WorkingInheritance<E> extends ForwardingSet<E> {

	/** Number of attempted element insertions */
	private int addCount;

	public WorkingInheritance(Set<E> set) {
		super(set);
	}

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
