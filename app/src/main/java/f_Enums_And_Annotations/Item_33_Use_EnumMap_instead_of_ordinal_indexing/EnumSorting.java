package f_Enums_And_Annotations.Item_33_Use_EnumMap_instead_of_ordinal_indexing;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EnumSorting {

	Map<Herb.Type, Set<Herb>> sort(List<Herb> garden) {

		//create buckets for every enum type
		Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<>(Herb.Type.class);
		for (Herb.Type t : Herb.Type.values()) {
			herbsByType.put(t, new HashSet<Herb>());
		}

		// assign to buckets by enum types
		for (Herb h : garden) {
			herbsByType.get(h.type).add(h);
		}

		System.out.println(herbsByType);
		return herbsByType;
	}

}

