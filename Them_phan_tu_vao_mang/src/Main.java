import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5,6,7,8};
        Scanner sc=new Scanner(System.in);
        System.out.print("Vi tri them: ");
        int viTriThem = sc.nextInt(); // Vị trí cần thêm phần tử
        System.out.println("Gia tri them: ");
        int giaTriThem = sc.nextInt(); // Giá trị mới

        int kichThuocMoi = mang.length + 1;
        int[] mangMoi = new int[kichThuocMoi];

        for (int i = 0, j = 0; i < kichThuocMoi; i++) {
            if (i == viTriThem) {
                mangMoi[i] = giaTriThem;
            } else {
                mangMoi[i] = mang[j];
                j++;
            }
        }

        mang = mangMoi;
        for (int j : mang) {
            System.out.println(j);
        }

    }
}