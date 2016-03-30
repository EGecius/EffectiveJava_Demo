package e_Generics.item_27_Favor_generic_methods;

import java.util.HashSet;
import java.util.Set;

public class GenericMethods {

	/** Generic - can accept of type or their children */
	public <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	/** This method has no choice bu to return a Set of raw type, accepting any object - unacceptable. */
	public Set union_with_raw_types(Set s1, Set s2) {
		Set result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

}
