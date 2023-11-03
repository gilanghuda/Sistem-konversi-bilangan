/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uang;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Aok {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);  
        int menu;
        do {
            System.out.println("pilih menu : ");
            System.out.println("1. Biner ke desimal");
            System.out.println("2. Desimal ke biner");
            System.out.println("3. Biner ke hexa");
            System.out.println("4. Hexa ke biner");
            System.out.println("5. Desimal ke hexa");
            System.out.println("6. Hexa ke desimal");
            System.out.print("(pilih menu dengan menginputkan nomornya) : ");
             menu = input.nextInt();
            switch (menu){
                case 1 :{
                    System.out.println("masukkan binary number : ");
                    String binary = input.next();
                    int desimal =0;
                    try{
                     desimal = Integer.parseInt(binary, 2);
                    }
                    catch (NumberFormatException NFE){
                        System.out.println("binary number yang anda masukkan tidak valid");
                    }
                    finally{
                    System.out.println("Hasil konversi binary number anda adalah = " + desimal);
                    }
                    break;
                }
                case 2 : {
                    System.out.println("masukkan bilangan desimal anda : ");
                    int decimalNumber = input.nextInt();
                    String binaryNumber = Integer.toBinaryString(decimalNumber);
                    System.out.println("Bilangan biner : " + binaryNumber);
                    break;
                }  
                case 3 :  {
                    System.out.println("masukkan bilangan binary anda : ");
                    String binaryNumber = input.next();
                    int decimal = Integer.parseInt(binaryNumber, 2);
                    String hexadecimalNumber = Integer.toHexString(decimal).toUpperCase();
                    System.out.println("Bilangan heksadesimal: " + hexadecimalNumber);
                    break;
                  }
                case 4 : {
                     System.out.println("masukkan bilangan hexadecimal anda : ");
                    String hexadecimalNumber = input.next();
                     StringBuilder binaryNumber = new StringBuilder();
                     for (int i = 0; i < hexadecimalNumber.length(); i++) {
                        char hexDigit = hexadecimalNumber.charAt(i);
                        int decimal = Character.digit(hexDigit, 16);
                        String binaryDigit = Integer.toBinaryString(decimal);
                        binaryNumber.append(String.format("%4s", binaryDigit).replace(' ', '0'));
                        }
                      System.out.println("Bilangan biner: " + binaryNumber);
                      break;
                }
                case 5 : {
                    System.out.println("masukkan bilangan desimal anda : ");
                    int decimalNumber = input.nextInt();
                    StringBuilder hexadecimalNumber = new StringBuilder();
                    while (decimalNumber > 0) {
                         int remainder = decimalNumber % 16;
                         char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
                         hexadecimalNumber.insert(0, hexDigit);
                         decimalNumber /= 16;
                       }
                    System.out.println("Bilangan heksadesimal: " + hexadecimalNumber);
                    break;
                }
                case  6 : {
                    System.out.println("masukkan bilangan hexa anda : ");
                    String hexadecimalNumber = input.next();
                    int decimalNumber = 0;
                    int power = 0;
                    for (int i = hexadecimalNumber.length() - 1; i >= 0; i--) {
                         char hexDigit = hexadecimalNumber.charAt(i);
                         int digitValue = Character.digit(hexDigit, 16);
                         decimalNumber += digitValue * Math.pow(16, power);
                         power++;
                         }
                 System.out.println("Bilangan desimal: " + decimalNumber);
                 break;
                }
            } 
                }while (menu<=6);
        if (menu>6)System.out.println("tidak ada di pilihan menu");
        }
}
