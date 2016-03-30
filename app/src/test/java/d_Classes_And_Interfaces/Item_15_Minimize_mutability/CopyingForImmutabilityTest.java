package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link CopyingForImmutability}
 */
public class CopyingForImmutabilityTest {

	public static final String NEW_VALUE = "new value";
	public static final String ORIGINAL_VALUE = "original";
	CopyingForImmutability mutable;
	CopyingForImmutability immutable;
	String[] stringsArray = {ORIGINAL_VALUE};

	@Before
	public void setup() {
		mutable = CopyingForImmutability.getInstanceWithoutCopying(stringsArray);
		immutable = CopyingForImmutability.getInstanceWithCopying(stringsArray);
	}

	@Test (expected = ComparisonFailure.class)
	public void given_mutableObject_when_elementChangedViaInjectedVariable_mutabilityIsNotRetained() {
		//WHEN
		stringsArray[0] = NEW_VALUE;
		//THEN
		String foundValue = mutable.getMutableArrayWithoutCopying()[0];
		assertThat(foundValue).isEqualTo(ORIGINAL_VALUE);
	}

	@Test (expected = ComparisonFailure.class)
	public void when_elementChangedViaGetterWithoutCopying_mutabilityIsNotRetained() {
		//WHEN
		mutable.getMutableArrayWithoutCopying()[0] = NEW_VALUE;
		//THEN
		String foundValue = mutable.getMutableArrayWithoutCopying()[0];

		assertThat(foundValue).isEqualTo(ORIGINAL_VALUE);
	}

	/* IMMUTABLE*/

	@Test
	public void given_immutableObject_when_elementChangedViaInjectedVariable_mutabilityIsRetained() {
		//WHEN
		stringsArray[0] = NEW_VALUE;
		//THEN
		String foundValue = immutable.getMutableArrayWithoutCopying()[0];

		assertThat(foundValue).isEqualTo(ORIGINAL_VALUE);
	}

	@Test
	public void when_elementChangedViaGetterWithoutCopying_mutabilityIsRetained() {
		//WHEN
		mutable.getMutableArrayWitCopying()[0] = NEW_VALUE;
		//THEN
		String foundValue = mutable.getMutableArrayWitCopying()[0];

		assertThat(foundValue).isEqualTo(ORIGINAL_VALUE);
	}

}