package e_Generics.item_27_Favor_generic_methods;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericMethodsTest {

	GenericMethods test;

	@Before
	public void setup() {
		test = new GenericMethods();
	}

	@Test
	public void when__then() {

		HashSet<String> setHashSet = new HashSet<>();
		setHashSet.add("one");
		setHashSet.add("two");

		LinkedHashSet<String> setLinkedHashSet = new LinkedHashSet<>();
		setLinkedHashSet.add("vienas");
		setLinkedHashSet.add("du");

		//WHEN
		Set<String> union = test.union(setHashSet, setLinkedHashSet);
		//THEN

		assertThat(union.size()).isEqualTo(4);
	}

	@Test
	public void when_addingSetsWithDifferentTypes() {
		//WHEN
		Set<List<String>> setList = new HashSet<>();

		Set<ArrayList<String>> setIntegers = new HashSet<>();

		Set<List<String>> union = test.union(setList, setIntegers);

		//THEN
	}

}