package finalModifier;

public class FinalMethod {

    class A {
        void abc() {
        }
        final void bcd() {
        }
    }

    class B extends A {
        void abc() {
        }
//        void bcd() {
//        }
    }
}
