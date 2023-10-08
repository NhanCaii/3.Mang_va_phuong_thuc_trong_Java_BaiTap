import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap so o vi tri "+i+" "+j+" ");
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.print("Nhap cot: ");
        int col= sc.nextInt();
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][col-1]);
            total+=arr[i][col-1];
        }
        System.out.println("Tong: "+total);
    }
}