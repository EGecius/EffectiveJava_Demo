package f_Enums_And_Annotations.Item_33_Use_EnumMap_instead_of_ordinal_indexing;

import java.util.EnumMap;

/**
 * A class to be sorted by {@link EnumMap} using its enum values
 */
public class Herb {

	enum Type {ANNUAL, PERENNIAL, BIENNIAL}

	final String name;
	final Type type;

	public Herb(Type type, String name) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

