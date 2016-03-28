package z_Shared;

import java.util.Iterator;

/**
 * //todo
 */
public final class NumbersIterable implements Iterable<Number> {

	@Override
	public Iterator<Number> iterator() {
		return new Iterator<Number>() {
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Number next() {
				return null;
			}

			@Override
			public void remove() {

			}
		};
	}
}
