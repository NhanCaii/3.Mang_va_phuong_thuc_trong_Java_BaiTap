import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr1=new int[4];
        int[] arr2=new int[5];
        int[] arr3=new int[arr1.length+ arr2.length];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhap arr1 so tai vi tri "+(i+1)+": ");
            arr1[i]=sc.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.print("Nhap arr2 so tai vi tri "+(j+1)+": ");
            arr2[j]=sc.nextInt();
        }

        for (int i=0;i< arr1.length;i++ ) {
            arr3[i]=arr1[i];
        }
        int a=0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i]=arr2[a];
            a++;
        }
        for (int j=0;j< arr3.length;j++ ) {
            System.out.println(arr3[j]);
        }

    }
}