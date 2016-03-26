package c_Methods_Common_to_All_Objects.Item_9_Always_override_hashCode_when_you_override_equals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link WithEqualsWithHashCode}
 */
public class WithEqualsWithHashCodeTest {

	public static final String TITLE = "title";
	public static final String TITLE_CUSTOM = "title_custom";
	public static final int ID = 1;
	public static final int ID_CUSTOM = 3;

	WithEqualsWithHashCode sample1 = new WithEqualsWithHashCode(TITLE, ID);
	WithEqualsWithHashCode sample2 = new WithEqualsWithHashCode(TITLE, ID);
	WithEqualsWithoutHashCode sampleUnequal = new WithEqualsWithoutHashCode(TITLE_CUSTOM, ID_CUSTOM);

	// Contract of hashCode();
	// 1. Consistency - returns same hashcode every time called on a object
	// 2. Symmetry - returns same hashcode on two objects which are equal

	@Test
	public void consistency() {
		for (int i = 0; i < 1000000; i++) {
			//WHEN
			int hash1 = sample1.hashCode();
			int hash2 = sample1.hashCode();
			//THEN
			assertThat(hash1 == hash2).isTrue();
		}
	}

	@Test
	public void symmetry() {
		//WHEN
		int hash1 = sample1.hashCode();
		int hash2 = sample2.hashCode();
		//THEN
		assertThat(hash1 == hash2).isTrue();
	}

	@Test
	public void distinction() {

		for (int i = 0; i < 100000; i++) {
			WithEqualsWithHashCode o1 = new WithEqualsWithHashCode(TITLE, ID);
			WithEqualsWithoutHashCode o2 = new WithEqualsWithoutHashCode(TITLE_CUSTOM, ID_CUSTOM);
			//WHEN
			int hash1 = o1.hashCode();
			int hash2 = o2.hashCode();
			//THEN
			assertThat(hash1 == hash2).isFalse();
		}
	}

}