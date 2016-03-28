package e_Generics.Item_26_Favor_generic_types;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Initial attempt to generify stack - won't compile because creation of arrays of non-reified types is prohibited.
 * Non-reified are those whose types is not known at runtime. That's because arrays, unlike generics, allow losing
 * track of the type by allowing assign an object to its paren type.
 * E.g. this is allowed:
 * Object[] array = new String[]
 * but this is not:
 * List<Object> list = new ArrayList<String>()
 */
public class b_Stack_failed_attempt<E> {

	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public b_Stack_failed_attempt() {
//		elements = new E[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null; // eliminate obsolete reference
		return result;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

}