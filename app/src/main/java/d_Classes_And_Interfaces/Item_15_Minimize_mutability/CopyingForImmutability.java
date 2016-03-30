package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

import java.util.Arrays;

/**
 * Sample how a class can accept mutable objects via constructor but stay immutable by making copies of them.
 */
final class CopyingForImmutability {

	private String[] mutableArray;

	private CopyingForImmutability(String[] mutableArray){
		this.mutableArray = mutableArray;
	}

	public static CopyingForImmutability getInstanceWithoutCopying(String[] mutableArray) {
		return new CopyingForImmutability(mutableArray);
	}

	public static CopyingForImmutability getInstanceWithCopying(final String[] mutableArray) {
		String[] copy = Arrays.copyOf(mutableArray, mutableArray.length);
		return new CopyingForImmutability(copy);
	}


	public String[] getMutableArrayWithoutCopying() {
		return mutableArray;
	}

	public String[] getMutableArrayWitCopying() {
		return  Arrays.copyOf(mutableArray, mutableArray.length);
	}
}
