//Learn about inheritance
//Method invocation will be from object type
//Variable invocation is from reference type

public class InheritanceByK {
    public static void main(String[] args) {
        Baap b = new Beta();
        b.getH();
        System.out.println(b.h);
        Beta bb = (Beta) b;
        bb.getH();
        System.out.println(bb.h);
    }
}

class Baap {
    int h = 4;

    public void getH() {
        System.out.println("Baap " + h);
    }
}

class Beta extends Baap {
    int h = 44;

    public void getH() {
        System.out.println("Beta " + h);
    }
}
