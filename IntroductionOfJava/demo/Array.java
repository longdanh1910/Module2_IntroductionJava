import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Phần tử thứ "+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
