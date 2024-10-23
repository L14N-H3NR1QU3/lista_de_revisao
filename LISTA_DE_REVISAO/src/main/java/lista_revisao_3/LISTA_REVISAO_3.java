/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista_revisao_3;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_REVISAO_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int resA;
        int resB; 
        System.out.println("Digite um numero: ");
        String respA = s.next();
        System.out.println("Digite um numero: ");
        String respB = s.next();
        try{
            resA = Integer.parseInt(respA);
            resB = Integer.parseInt(respB);
            if(resA > resB){
                System.out.println("Primeiro numero e maior!");
            }
            else{
                System.out.println("Segundo numero e maior!");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Numero invalido!");
        }
    }
}
