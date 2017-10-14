package h_GeneralProgramming.Item_45_Minimize_scope_of_local_variables;


import java.util.Iterator;
import java.util.List;

public class RiskOfWhileLoop {

    /** What's a problem here */
    void whileLoop(List<Integer> a, List<Integer> c) {

        Iterator<Integer> i = a.iterator();

        Iterator<Integer> i2 = c.iterator();
        while (i.hasNext()){
            doSomethingElse(i2.next());
        }
    }

    private void doSomethingElse(Integer next) {
        //do
    }

    void forLoop(List<Integer> a, List<Integer> c) {

        Iterator<Integer> i = a.iterator();
        Iterator<Integer> i2 = c.iterator();

        // here same bug would be much more visible
        for (Integer integer : c) {
            doSomethingElse(i2.next());
        }

    }
}
