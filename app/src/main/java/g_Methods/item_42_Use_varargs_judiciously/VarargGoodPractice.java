package g_Methods.item_42_Use_varargs_judiciously;

public class VarargGoodPractice {

    /** Returns minimum value
     * 2 problems:
     * 1) no compile-time enforcing of arguments - fails at runtime only
     * 2) it's ugly
     * */
    static int min(int... args) {

        if (args.length == 0) {
            throw new IllegalArgumentException("too few arguments");
        }

        int min = args[0];

        for (int arg : args) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }

    /** Much better alternative */
    static int min(int firsArg, int... remainingArgs) {

        int min = firsArg;

        for (int arg : remainingArgs) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }

}