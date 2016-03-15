package c_Methods_Common_to_All_Objects.Item_12_Consider_implementing_Comparable;

import android.support.annotation.NonNull;

public class ComparableDemo implements Comparable<ComparableDemo> {

	private final int value;

	public ComparableDemo(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(@NonNull ComparableDemo another) {

		if (value > another.getValue()) {
			return 1;
		} else if (value < another.getValue()) {
			return -1;
		}

		return 0;
	}

}
