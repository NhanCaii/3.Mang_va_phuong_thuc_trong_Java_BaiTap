import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr={10,4,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so: ");
        int num=sc.nextInt();
        int index=0;
        boolean check=true;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index=i;
                check=true; break;
            } else {
                check=false;
            }
        }
        if(check) {
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1]=0;
            for (int j : arr) {
                System.out.println(j + "\t");
            }
        } else {
            System.out.println("Number not found");
        }
    }
}