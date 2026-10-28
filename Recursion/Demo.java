// Basic example of recursion.
// A recursive method calls itself.
class Demo {
    public void print(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print(0, 5);
    }
}
