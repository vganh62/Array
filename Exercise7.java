package Ex;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap n: ");
            arr[i] = sc.nextInt();
        }
        int t1 = Integer.MIN_VALUE;
        int t2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > t1) {
                t2 = t1;
                t1 = arr[i];
            } else if (arr[i] > t2 && arr[i] != t1) {
                t2 = arr[i];
            }
        }
        System.out.println("Second largest element: " + t2);

    }
}
