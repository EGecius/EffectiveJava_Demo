package e_Generics.Item_28_Use_bounded_wildcards_to_increase_API_flexibility;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import z_Shared.Child;
import z_Shared.Parent;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link StackWithBoundedWildcards}
 */
public class StackWithBoundedWildcardsTest {

	StackWithBoundedWildcards<Parent> wildcards;

	@Before
	public void setup() {
		wildcards = new StackWithBoundedWildcards<>();
		wildcards.push(new Parent());
		wildcards.push(new Parent());
	}

	@Test
	public void allowsPuttingChildren() {
		//WHEN
		wildcards.push(new Parent());
		wildcards.push(new Child());
	}

	@Test
	public void allowsPuttingAMixedCollection() {

		List<Parent> list = new ArrayList<>();
		list.add(new Parent());
		list.add(new Child());

		assertThat(wildcards.size()).isEqualTo(2);
		wildcards.pushAll(list);
		assertThat(wildcards.size()).isEqualTo(4);
	}

	@Test
	public void allowsPoppingIntoAParentCollection() {

		List<Parent> list = new ArrayList<>();

		wildcards.popAll(list);
		assertThat(list.size()).isEqualTo(2);
	}


	@Test
	public void allowsPoppingIntoParentsParentCollection() {

		List<Object> list = new ArrayList<>();

		wildcards.popAll(list);
		assertThat(list.size()).isEqualTo(2);
	}

}