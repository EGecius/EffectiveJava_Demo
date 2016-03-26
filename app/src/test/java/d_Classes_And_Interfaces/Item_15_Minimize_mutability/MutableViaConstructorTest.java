package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link MutableViaConstructor}
 */
public class MutableViaConstructorTest {

	public static final String INITIAL_VALUE = "initial_value";
	public static final String NEW_VALUE = "new value";
	String[] arrayInjectedReference = new String[1];
	MutableViaConstructor mutable;

	@Before
	public void setup() {
		arrayInjectedReference[0] = INITIAL_VALUE;
		mutable = new MutableViaConstructor("title", 1, arrayInjectedReference);
	}

	@Test
	public void when_arrayValueCheckedBeforeModification_then_itIsSameAsInitiallySet() {
		//WHEN
		String s = mutable.getMutableArray()[0];
		//THEN
		assertThat(s).isEqualTo(INITIAL_VALUE);
	}

	@Test
	public void when_arrayValueCheckedAfterModification_then_arrayInsideObjectIsModified() {
		//WHEN
		arrayInjectedReference[0] = NEW_VALUE;
		String s = mutable.getMutableArray()[0];
		//THEN
		assertThat(s).isEqualTo(NEW_VALUE);
	}

}