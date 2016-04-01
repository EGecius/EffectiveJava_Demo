package f_Enums_And_Annotations.Item_31_Use_instance_fields_instead_of_ordinals;

enum EnumAvoidingOrdinals {

	JORDAN(1), MAGIC(2), BIRD(3);

	/** Greatest of all times index */
	final int goatIndex;

	EnumAvoidingOrdinals(final int goatIndex) {
		this.goatIndex = goatIndex;
	}
}
