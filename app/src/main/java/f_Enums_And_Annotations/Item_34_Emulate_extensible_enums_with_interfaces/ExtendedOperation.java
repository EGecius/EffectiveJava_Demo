package f_Enums_And_Annotations.Item_34_Emulate_extensible_enums_with_interfaces;

enum ExtendedOperation implements Operation {

	POWER(){
		@Override
		public double apply(final int arg1, final int arg2) {
			return Math.pow(arg1, arg2);
		}
	},
	REMAINDER() {
		@Override
		public double apply(final int arg1, final int arg2) {
			return arg1 % arg2;
		}
	}

}
