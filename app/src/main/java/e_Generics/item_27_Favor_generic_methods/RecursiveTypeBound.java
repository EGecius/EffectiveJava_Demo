package e_Generics.item_27_Favor_generic_methods;

import java.util.Iterator;
import java.util.List;

/**
 * //todo
 */
final class RecursiveTypeBound {

	public <T extends Comparable<T>> T max(List<T> list) {

		Iterator<T> iterator = list.iterator();
		T result = iterator.next();

		while (iterator.hasNext()) {

			T next = iterator.next();

			if (next.compareTo(result) > 0) {
				result = next;
			}
		}

		return result;
	}
}
