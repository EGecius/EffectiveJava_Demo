package e_Generics.Item_24_Eliminate_unchecked_warnings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Shows how suppressing warnings is sometimes unavoidable.
 */
final class UncheckedWarningsDemo {

	private final Object[] elementData;
	private final int size;

	public UncheckedWarningsDemo(final ArrayList<String> list) {
		this.elementData = list.toArray();
		size = elementData.length;
	}

	@SuppressWarnings ("unchecked")
	public <T> T[] toArray(T[] a) {
		if (a.length < size)
			// Make a new array of a's runtime type, but my contents:
			return (T[]) Arrays.copyOf(elementData, size, a.getClass());
		System.arraycopy(elementData, 0, a, 0, size);
		if (a.length > size)
			a[size] = null;
		return a;
	}

	/** this is identical to method bellow but instead of method-wide suppression, it suppresses only one line  */
	public <T> T[] toArray2(T[] a) {
		if (a.length < size)
			// Make a new array of a's runtime type, but my contents:
			//noinspection unchecked
			return (T[]) Arrays.copyOf(elementData, size, a.getClass());
		System.arraycopy(elementData, 0, a, 0, size);
		if (a.length > size)
			a[size] = null;
		return a;
	}

}
