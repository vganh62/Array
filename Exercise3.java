package Ex;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap n: ");
            arr[i] = sc.nextInt();
        }
        boolean palindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
