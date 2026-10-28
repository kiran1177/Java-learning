// with stop condition
class DemoRecursionCon {
    public void print(int i) {
        if (i >= 4) {
            return;
        }

        print(i + 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        DemoRecursionCon obj = new DemoRecursionCon();
        obj.print(0);
    }
}
