package e_Generics.item_27_Favor_generic_methods;

import java.util.List;

/**
 * Single responsibility:
 * //todo
 */
interface RecursiveTypeBound {
	/** Returns max value from the list provided */
	<T extends Comparable<T>> T max(List<T> list);
}
