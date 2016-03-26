package c_Methods_Common_to_All_Objects.Item_8_Obey_the_general_contract_when_overriding_equals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ContactWithEqualsExtended}
 */
public class ContactWithEqualsExtendedTest {


	public static final String NAME = "name";
	public static final String NUMBER = "123";
	public static final String ADDRESS = "address";

	ContactWithEquals contact1 = new ContactWithEquals(NAME, NUMBER);
	ContactWithEqualsExtended contact2 = new ContactWithEqualsExtended(NAME, NUMBER, null);
	ContactWithEqualsExtended contact3 = new ContactWithEqualsExtended(NAME, NUMBER, null);

	// 5 parts of equals() contract:
	// 1. Reflexive
	// 2. Symmetric
	// 3. Transitive
	// 4. Consistent
	// 5. Nullability

	@Test
	@SuppressWarnings ("EqualsWithItself")
	public void reflexive() {
		assertThat(contact1.equals(contact1)).isTrue();
	}

	@Test
	public void symmetric_1() {
		assertThat(contact1.equals(contact2)).isTrue();
	}

	@Test
	public void symmetric_2() {
		assertThat(contact2.equals(contact1)).isTrue();
	}

	@Test
	public void transitive() {
		assertThat(contact1.equals(contact2)).isTrue();
		assertThat(contact2.equals(contact3)).isTrue();
		assertThat(contact3.equals(contact1)).isTrue();
	}

	@Test
	public void consistent() {
		for (int i = 0; i < 1000000; i++) {
			assertThat(contact1.equals(contact2)).isTrue();
		}
	}

	@Test
	public void nullability() {
		//noinspection ObjectEqualsNull
		assertThat(contact1.equals(null)).isFalse();
	}

}