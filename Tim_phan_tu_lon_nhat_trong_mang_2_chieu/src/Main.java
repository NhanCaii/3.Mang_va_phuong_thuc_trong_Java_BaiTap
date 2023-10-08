import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] arr= new int[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap gia tri toa do "+i+" "+j+" ");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        int max=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat: "+max);

    }
}