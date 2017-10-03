package e_Generics.Item_23_Dont_use_raw_types_in_new_code;


import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class UnboundedWildCardTest {

	private UnboundedWildCard mSut;

	@Before
	public void setUp() {
		mSut = new UnboundedWildCard();
	}

	@Test
	public void getNumElementsInCommon() {

		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);

		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("3");
		hashSet2.add("4");


		int numElementsInCommon = mSut.getNumElementsInCommonWithTypeWildcard(hashSet, hashSet2);

		assertThat(numElementsInCommon).isEqualTo(0);
	}

	@Test
	public void getNumElementsInCommonWithObjectType() {

		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);

		HashSet<Object> hashSet2 = new HashSet<>();
		hashSet2.add("3");
		hashSet2.add("4");

		int numElementsInCommon = mSut.getNumElementsInCommonWithTypeObject(hashSet, hashSet2);

		assertThat(numElementsInCommon).isEqualTo(0);
	}

}