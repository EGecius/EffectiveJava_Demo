package g_Methods.Item_41_Use_overloading_judiciously;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ConfusingOverloading}
 */
public class ConfusingOverloadingTest {

	ConfusingOverloading overloading;

	@Before
	public void setup() {
		overloading = new ConfusingOverloading();
	}

	@Test
	public void when_arrayListPassedWithoutBeingReferredToAsCollection_then_worksAsExpected() {
		//WHEN
		String satisfy = overloading.satisfy(new ArrayList<BigInteger>());
		//THEN
		assertThat(satisfy).isEqualTo(ConfusingOverloading.LIST);
	}

	@Test
	public void when_hashSetPassedWithoutBeingReferredToAsCollection_then_worksAsExpected() {
		//WHEN
		String satisfy = overloading.satisfy(new HashSet<String>());
		//THEN
		assertThat(satisfy).isEqualTo(ConfusingOverloading.SET);
	}

	@Test
	public void when_hashSetPassedAsCollection_then_treatedAsCollection() {
		//WHEN
		Collection<String> setAsCollection = new HashSet<>();
		String satisfy = overloading.satisfy(setAsCollection);
		//THEN
		assertThat(satisfy).isEqualTo(ConfusingOverloading.COLLECTION);
	}

}