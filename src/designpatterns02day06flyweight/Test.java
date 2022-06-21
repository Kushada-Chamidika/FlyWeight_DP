package designpatterns02day06flyweight;

import java.util.HashMap;

/**
 *
 * @author 1999k
 */
public class Test {

    public static void main(String[] args) {

//        A a1 = new A(10);
//        A a2 = new A(50);
//        A a3 = new A(10);
        A a1 = AFactory.getA(10);
        A a2 = AFactory.getA(50);
        A a3 = AFactory.getA(10);
//        A a1 = A.getA(10);
//        A a2 = A.getA(50);
//        A a3 = A.getA(10);

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);

    }

}

//class A {
//
//    int i;
//
//    private static final HashMap<String, A> POOL = new HashMap<>();
//
//    private A(int i) {
//        this.i = i;
//    }
//
//    public static A getA(int i) {
//
//        A a = A.POOL.get(String.valueOf(i));
//
//        if (a == null) {
//            a = new A(i);
//            A.POOL.put(String.valueOf(i), a);
//
//        }
//        return a;
//    }
//
//}
class A {

    int i;

    A(int i) {
        this.i = i;
    }

}

class AFactory {

    private static final HashMap<String, A> POOL = new HashMap<>();

    public static A getA(int i) {

        A a = AFactory.POOL.get(String.valueOf(i));

        if (a == null) {
            a = new A(i);
            AFactory.POOL.put(String.valueOf(i), a);

        }
        return a;
    }
}
