/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p180524;

/**
 *
 * @author ACER
 */
public class FactoralRecursif {
    static int factorial (int n){
        if(n==1){
            return 1;
        }
        return factorial(n -1)*n;
    }
    public static void main(String[]args){
        int n=6;
        System.out.println(factorial(n));
    }
    
}
