package g_Methods.item_42_Use_varargs_judiciously;

import org.junit.Before;
import org.junit.Test;

public class VarargGoodPracticeTest {

    private VarargGoodPractice mSut;

    @Before
    public void setUp() {
        mSut = new VarargGoodPractice();
    }

    @Test (expected = IllegalArgumentException.class)
    public void compilesButFailsAtRuntime_withBadDesign() {
        mSut.min();
    }

    @Test
    public void doesNotCompile_passingZeroArgs_withGoodDesign() {
//        mSut.minGoodDesign();
    }


}