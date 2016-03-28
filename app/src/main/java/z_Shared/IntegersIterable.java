package z_Shared;

import java.util.Iterator;

/**
 * //todo
 */
public final class IntegersIterable implements Iterable<Integer> {
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Integer next() {
				return null;
			}

			@Override
			public void remove() {

			}
		};
	}
}
