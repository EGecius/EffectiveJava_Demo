package f_Enums_And_Annotations.Item_33_Use_EnumMap_instead_of_ordinal_indexing;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Single Responsibility:
 *
 * Tests for {@link EnumSorting}
 */
public class EnumSortingTest {

	public static final String AGUONA = "aguona";
	public static final String ZIBUTE = "zibute";
	public static final String META = "meta";
	public static final String RUTA = "ruta";
	public static final String BRASKE = "braske";
	public static final String ZEMUOGE = "zemuoge";
	EnumSorting enumSorting;

	@Before
	public void setup() {
		enumSorting = new EnumSorting();
	}

	@Test
	public void when__then() {
		//WHEN
		List<Herb> herbsList = new ArrayList<>();

		Herb aguona = new Herb(Herb.Type.ANNUAL, AGUONA);
		Herb zibute = new Herb(Herb.Type.ANNUAL, ZIBUTE);

		Herb meta = new Herb(Herb.Type.BIENNIAL, META);
		Herb ruta = new Herb(Herb.Type.BIENNIAL, RUTA);

		Herb braske = new Herb(Herb.Type.PERENNIAL, BRASKE);
		Herb zemuoge = new Herb(Herb.Type.PERENNIAL, ZEMUOGE);

		herbsList.add(aguona);
		herbsList.add(zibute);
		herbsList.add(meta);
		herbsList.add(ruta);
		herbsList.add(braske);
		herbsList.add(zemuoge);

		Map<Herb.Type, Set<Herb>> mappedHerbs = enumSorting.sort(herbsList);

		Set<Herb> herbs = mappedHerbs.get(Herb.Type.ANNUAL);

		assertThat(herbs.size()).isEqualTo(2);
		assertThat(herbs.contains(aguona));
		assertThat(herbs.contains(zibute));

	}

}