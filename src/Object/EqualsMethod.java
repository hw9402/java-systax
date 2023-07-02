package Object;

public class EqualsMethod {

    class A {
        String name;
        A(String name) {
            this.name = name;
        }
    }

    class B {
        String name;

        B(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof B) {
                if (this.name == ((B) obj).name) {
                    return true;
                }
            }
            return false;
        }
    }
}
