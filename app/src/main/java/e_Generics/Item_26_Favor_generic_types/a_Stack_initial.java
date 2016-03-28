package e_Generics.Item_26_Favor_generic_types;

import java.util.Arrays;
import java.util.EmptyStackException;

/** This is what stack looks like initially, before any generification attempts. Is not type safe because any Object
 * can be put in. When popping off the stack, you will need to cast objects, which is not safe */
public class a_Stack_initial {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public a_Stack_initial() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
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
