package d_Classes_And_Interfaces.Item_16_favour_composition_over_inheritance;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * This shows how to use forwarding in composition
 * The class wraps another implementation of {@link Set} and forwards call to it.
 */
class ForwardingSet<E> implements Set<E> {

	private final Set<E> set;

	public ForwardingSet(Set<E> set) {
		this.set = set;
	}

	@Override
	public boolean add(E object) {
		return set.add(object);
	}

	@Override
	public boolean addAll(@NonNull Collection<? extends E> collection) {
		return set.addAll(collection);
	}

	@Override
	public void clear() {
		set.clear();
	}

	@Override
	public boolean contains(Object object) {
		return set.contains(object);
	}

	@Override
	public boolean containsAll(@NonNull Collection<?> collection) {
		return set.containsAll(collection);
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@NonNull
	@Override
	public Iterator<E> iterator() {
		return set.iterator();
	}

	@Override
	public boolean remove(Object object) {
		return set.remove(object);
	}

	@Override
	public boolean removeAll(@NonNull Collection<?> collection) {
		return set.removeAll(collection);
	}

	@Override
	public boolean retainAll(@NonNull Collection<?> collection) {
		return set.retainAll(collection);
	}

	@Override
	public int size() {
		return set.size();
	}

	@NonNull
	@Override
	public Object[] toArray() {
		return set.toArray();
	}


	// TODO: 15/03/2016 why are the bellow warnings shown?
	@NonNull
	@Override
	public <T> T[] toArray(T[] array) {
		return set.toArray(array);
	}

	// TODO: 15/03/2016 why are the bellow warnings shown?
	@Override
	public boolean equals(Object o) {
		return set.equals(o);
	}

	@Override
	public int hashCode() {
		return set.hashCode();
	}

	@Override
	public String toString() {
		return set.toString();
	}
}
