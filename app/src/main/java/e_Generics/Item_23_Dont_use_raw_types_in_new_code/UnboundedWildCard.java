package e_Generics.Item_23_Dont_use_raw_types_in_new_code;

import java.util.Set;

/**
 * Shows how wildcards ensure type safety
 */
final class UnboundedWildCard {

	/** Here using wildcard prevents compilation when objects are added. That's because wildcard indicates that we
	 * don't know what type a set will be parameterized to, so can't make any assumptions and can't add anything */
	int getNumElementsInCommonWithTypeWildcard(Set<?> set1, Set<?> set2) {
		int result = 0;

//		set1.add(new Object()); // does not compile unless set1 wildcard is replaced with 'Object'

		for (final Object s : set1) {
			if (set2.contains(s)) {
				result++;
			}
		}

		return result;
	}

	/** Here we set type to Object, which limits caller to pass Sets of type Object. This makes API less useful since
	 you can't pass Set<String> or similar - only Set<Object>  */
	int getNumElementsInCommonWithTypeObject(Set<Object> set1, Set<Object> set2) {
		int result = 0;

		// not that both Sets are of type Object it compiles
		set1.add(new Object());

		for (final Object s : set1) {
			if (set2.contains(s)) {
				result++;
			}
		}

		return result;
	}

}
