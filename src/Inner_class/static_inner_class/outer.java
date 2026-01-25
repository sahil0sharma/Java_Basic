package Inner_class.static_inner_class;

public class outer {
    int x = 10;     // can't access
    static int y = 20;   // can access

    static class Static {
        void show(){
            System.out.println("In static class " + y );
        }
    }

    public static void main(String[] args) {
        outer.Static c = new Static();
        c.show();
    }
}
