 import java.util.Scanner;

public class StarSumCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int count = countValues(N);
        System.out.println("Count of values of M: " + count);
    }

    public static int countValues(int N) {
        int count = 0;
        for (int M = 1; M <= N; M++) {
            int starSum = calculateStarSum(M);
            if (starSum > N) {
                count++;
            }
        }
        return count;
    }

    public static int calculateStarSum(int M) {
        int sum = 0;
        String strM = String.valueOf(M);
        for (int i = 1; i <= strM.length(); i++) {
            sum += Integer.parseInt(strM.substring(0, i));
        }
        return sum;
    }
}

