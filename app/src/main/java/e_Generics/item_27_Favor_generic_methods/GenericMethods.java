package e_Generics.item_27_Favor_generic_methods;

import java.util.HashSet;
import java.util.Set;

public class GenericMethods {

	public <E> Set<E> union(Set<E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

}
