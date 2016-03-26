package e_Generics.Item_23_Dont_use_raw_types_in_new_code;

import java.util.Set;

/**
 * Shows how wildcards ensure typesafety
 */
final class UnboundedWildCard {

	/** Here using wildcard prevents compilation when objects are added. That's because wildcard indicates that we
	 * don't know what type a set will be parameterized to, so can't make any assumptions and can't add anything */
	int getNumElementsInCommon(Set<?> set1, Set<?> set2) {
		int result = 0;

//		set1.add(new Object()); // does not compile unless set1 wildcard is replaced with 'Object'

		for (final Object s : set1) {
			if (set2.contains(s)) {
				result++;
			}
		}

		return result;
	}
}
