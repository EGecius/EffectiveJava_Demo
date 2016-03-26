package c_Methods_Common_to_All_Objects.Item_9_Always_override_hashCode_when_you_override_equals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link WithEqualsWithoutHashCode}
 */
public class WithEqualsWithoutHashCodeTest {

	public static final String TITLE = "title";
	public static final String TITLE_CUSTOM = "title_custom";
	public static final int ID = 1;
	public static final int ID_CUSTOM = 3;

	WithEqualsWithoutHashCode sample1 = new WithEqualsWithoutHashCode(TITLE, ID);
	WithEqualsWithoutHashCode sample2 = new WithEqualsWithoutHashCode(TITLE, ID);
	WithEqualsWithoutHashCode sampleUnequal = new WithEqualsWithoutHashCode(TITLE_CUSTOM, ID_CUSTOM);

	// Contract of hashCode();
	// 1. Consistency - returns same hashcode every time called on a object
	// 2. Symmetry - returns same hashcode on two objects which are equal
	// 3. Distinction - not required but improves performance of some algorithms if returns distinct values for
	// unequal objects

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
		//WHEN
		int hash1 = sample1.hashCode();
		int hash2 = sampleUnequal.hashCode();
		//THEN
		assertThat(hash1 == hash2).isFalse();
	}

}