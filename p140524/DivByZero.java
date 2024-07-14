/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p140524;

/**
 *
 * @author Asus
 */
public class DivByZero {
    
    public static void main(String args[]) {
        try {
            int angka = Integer.parseInt(args[0]);
        System.out.println(3 / angka);
        System.out.println("Cetak.");
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Argument tidak ada :" + ex.getMessage());
    } catch (ArithmeticException ex) {
        System.out.println("Error   ;" + ex.getMessage());
    } finally {
        System.out.println("Block Finally Setelah Exception");
   }
}
}
