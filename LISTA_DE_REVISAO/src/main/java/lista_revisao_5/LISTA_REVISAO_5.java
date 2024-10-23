/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_5;

import java.util.Scanner;

/**
 *
 * @author l.silva
 */
public class LISTA_REVISAO_5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num;
        System.out.println("Digite o numero inicial: ");
        String resp = s.next();
        try{
            num = Integer.parseInt(resp);
            for(int i = num; i >= 0; i--){
                System.out.println(i);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Numero invalido!");
        }
    }
}
