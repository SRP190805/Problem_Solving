import java.util.Scanner;

public class TwoSumSolution {

    public static void TwoSum(int[] a, int t) {
        int[] indices = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[i] + a[j] == t) {
                    indices[0] = i;
                    indices[1] = j;
                    System.out.println("[" + indices[0] + ", " + indices[1] + "]");
                    return;
                }
            }
        }
    }

    public static void mainFunction(int test, Scanner sc) {
        while (test > 0) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the target: ");
            int target = sc.nextInt();

            TwoSum(arr, target);
            test--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int test = sc.nextInt();
        mainFunction(test, sc);
        sc.close();
    }
}
