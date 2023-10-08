import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap day array thu "+i+" ");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Gia tri nho nhat: "+min);
    }
}