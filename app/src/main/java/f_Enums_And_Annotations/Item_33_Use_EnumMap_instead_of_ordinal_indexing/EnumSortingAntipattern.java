package f_Enums_And_Annotations.Item_33_Use_EnumMap_instead_of_ordinal_indexing;

import java.util.HashSet;
import java.util.Set;

/**
 * Shows hot not to do it (EffectiveJava, Item 33)
 */
public class EnumSortingAntipattern {

	Set<Herb>[] getSortet(Herb[] garden) {

		Set<Herb>[] herbsByType = (Set<Herb>[]) new Set[Herb.Type.values().length];

		for (int i = 0; i < herbsByType.length; i++) {
			herbsByType[i] = new HashSet<>();
		}

		for (Herb herb : garden) {
			herbsByType[herb.type.ordinal()].add(herb);
		}

		//print the results
		for (int i = 0; i < herbsByType.length; i++) {
			System.out.printf("%s: %s%n", Herb.Type.values()[i], herbsByType[i]);
		}

		return herbsByType;
	}

}