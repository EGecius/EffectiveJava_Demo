package f_Enums_And_Annotations.item_36_Consistently_use_Override_annotation;

/**
 * The method here shows how one can accidentally overload a method instead of overriding it.
 */
public class OverridingBug {

	// - adding '@Override' would prevent compilation, thus showing a bug immediately
//	@Override
	public boolean equals(OverridingBug o) {
		return super.equals(o);
	}



}
