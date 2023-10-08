import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr=new int[8];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("NHap gia tri tai vi tri: "+(i+1)+": ");
            arr[i]= sc.nextInt();
        }
        System.out.print("Nhap gia tri can tim ");
        int num= sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                count++;
            }
        }
        if (count==0){
            System.out.println("Khong co gia tri");
        } else {
            System.out.println("So lan lap gia tri "+num+ ": "+count);
        }
    }
}