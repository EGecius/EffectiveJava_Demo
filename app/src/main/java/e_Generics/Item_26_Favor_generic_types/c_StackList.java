package e_Generics.Item_26_Favor_generic_types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

/**
 * List-based stack
 */
public class c_StackList<E> {

	private List<E> elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 2;

	public c_StackList() {
		elements = new ArrayList<>(DEFAULT_INITIAL_CAPACITY);
	}

	public void push(E e) {
		elements.add(e);
		size = elements.size();
	}

	public void pushAll(Iterable<? extends E> src) {
		for (E e : src) {
			push(e);
		}
	}

	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		E result = elements.get(--size);
		elements.remove(size); // eliminate obsolete reference
		return result;
	}

	public void popAll(Collection<? super E> dest) {
		while (!isEmpty()) {
			dest.add(pop());
		}
	}

	private boolean isEmpty() {
		return getSize() == 0;
	}

	int getSize() {
		return elements.size();
	}

}
