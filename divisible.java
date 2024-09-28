public class divisible {
    public static void main(String[] args) {
        int n=10;
        int x=2;
        int[] A=new int[n];
        int[] B=new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=i+1;
        }
        for (int i = 0; i < B.length; i++) {
            B[i]=A[i]+(A[(i+1)%n]);
        }
        int sum=0;
        for (int i = 0; i < B.length; i++) {
            if (B[i]%x==0) {
                sum+=B[i];
            }
        }
        System.out.println(sum);
    }
}
