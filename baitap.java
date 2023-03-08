package baitap;
 
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class baitapthaotactoantu {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
         
        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
         
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân