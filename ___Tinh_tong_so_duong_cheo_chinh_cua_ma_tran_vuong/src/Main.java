import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] arr=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Nhap so tai vi tri "+i+" "+j+" ");
                arr[i][j]=sc.nextInt();
            }
        }
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i][i];
        }
        System.out.println("Tong: "+total);
    }
}