// Reverse an array using recursion.
// Works for both even and odd array sizes.
import java.util.Scanner;

class DemoReverseOdd {
    int[] a;

    public void reverse(int i, int n) {
        if (i >= n / 2) {
            return;
        }

        int temp = a[i];
        a[i] = a[n - i - 1];
        a[n - i - 1] = temp;

        reverse(i + 1, n);
    }

    public static void main(String[] args) {
        DemoReverseOdd obj = new DemoReverseOdd();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size");
        int n = sc.nextInt();
        obj.a = new int[n];

        System.out.println("enter numbers");
        for (int i = 0; i < n; i++) {
            obj.a[i] = sc.nextInt();
        }

        obj.reverse(0, n);

        System.out.println("reversed array");
        for (int i = 0; i < n; i++) {
            System.out.print(obj.a[i] + " ");
        }
    }
}
