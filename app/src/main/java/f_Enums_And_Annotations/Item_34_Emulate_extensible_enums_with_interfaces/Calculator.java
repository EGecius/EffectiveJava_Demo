package f_Enums_And_Annotations.Item_34_Emulate_extensible_enums_with_interfaces;

enum Calculator implements Operation {

	ADD() {
		@Override
		public double apply(final int arg1, final int arg2) {
			return arg1 + arg2;
		}
	},
	SUBTRACT() {
		@Override
		public double apply(final int arg1, final int arg2) {
			return arg1 - arg2;
		}
	},
	MULTIPLY() {
		@Override
		public double apply(final int arg1, final int arg2) {
			return arg1 * arg2;
		}
	},
	DIVIDE() {
		@Override
		public double apply(final int arg1, final int arg2) {
			return (float) arg1 / arg2;
		}
	}


}
