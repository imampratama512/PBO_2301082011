/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p140524;

/**
 *
 * @author Asus
 */
public class TextException {
    
    public static void main(String[] args) {
        try{
        for (int i = 0; true; i++) {
        System.out.println("args[" + i + "]="
                +args[i]);
        }
    }
    catch (ArrayIndexOutOfBoundsException ex) {
       System.out.print("Error   :" + ex.getMessage());
    }
   }
}
