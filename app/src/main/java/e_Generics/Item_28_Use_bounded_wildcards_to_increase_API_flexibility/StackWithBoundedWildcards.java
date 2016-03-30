package e_Generics.Item_28_Use_bounded_wildcards_to_increase_API_flexibility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Demo ho wto user bounded wildcards
 */
final class StackWithBoundedWildcards<E> {

	public static final int INITIAL_CAPACITY = 6;
	private List<E> list = new ArrayList<>(INITIAL_CAPACITY);

	public void push(E element) {
		list.add(element);
	}

	public E pop() {
		int size = list.size();
		return list.get(size -1);
	}

	public void pushAll(Iterable<? extends E> iterable) {
		for (final E e : iterable) {
			list.add(e);
		}
	}

	public void popAll(Collection<? super E> collection) {
		collection.addAll(list);
		list.clear();
	}

	public int size() {
		return list.size();
	}

}
