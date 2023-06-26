import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        StringBuilder output = new StringBuilder();
        int currentTerm = 1;
        int step = 1;

        for (int i = 1; i <= n; i++) {
            output.append(currentTerm);

            if (i != n) {
                output.append("-");
            }

            currentTerm += step;
            step++;
        }

        System.out.println("Output: " + output.toString());
    }
}
