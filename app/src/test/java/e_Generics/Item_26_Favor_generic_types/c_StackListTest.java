package e_Generics.Item_26_Favor_generic_types;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

import z_Shared.Child;
import z_Shared.IntegersIterable;
import z_Shared.NumbersIterable;
import z_Shared.Parent;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class c_StackListTest {

	public static final String ONE = "One";
	public static final String TWO = "Two";
	public static final String THREE = "Three";
	public static final String FOUR = "Four";
	c_StackList<String> stack;

	@Before
	public void setup() {
		stack = new c_StackList<>();
	}

	@Test
	public void when_push4Times_then_everyPopReturnsSameObjects() {
		//WHEN
		stack.push(ONE);
		stack.push(TWO);
		stack.push(THREE);
		stack.push(FOUR);

		//THEN
		assertThat(stack.getSize()).isEqualTo(4);
		assertThat(stack.pop()).isEqualTo(FOUR);
		assertThat(stack.getSize()).isEqualTo(3);

		assertThat(stack.pop()).isEqualTo(THREE);
		assertThat(stack.pop()).isEqualTo(TWO);
		assertThat(stack.pop()).isEqualTo(ONE);

		assertThat(stack.getSize()).isEqualTo(0);
	}

	@Test (expected = EmptyStackException.class)
	public void when_popsEmptyStack_then_emptyStackExceptionThrown() {
		//WHEN
		stack.pop();
		//THEN
		//fails
	}

	@Test
	public void when_pushingSubtypes_then_it_compiles() {
		//WHEN
		c_StackList<Parent> stackNumbers = new c_StackList<>();

		Parent parent = new Parent();
		Child child = new Child();
		stackNumbers.push(parent);
		stackNumbers.push(child);

		//THEN
	}

	@Test
	public void when_pushingIterable_then_extendsWildcardHasToBeUsed() {
		//WHEN
		c_StackList<Number> c_StackList = new c_StackList<>();

		NumbersIterable numbers = new NumbersIterable();
		c_StackList.pushAll(numbers);

		IntegersIterable integers = new IntegersIterable();
		c_StackList.pushAll(integers);

		//THEN
	}

	@Test
	public void when_popAllToCollectionOfParentType_then_superWildcardHasToBeUsed() {
		//WHEN
		c_StackList<Child> stackNumbers = new c_StackList<>();

		Collection<Parent> collection = new ArrayList<>();
		//THEN
		stackNumbers.popAll(collection);
	}

}