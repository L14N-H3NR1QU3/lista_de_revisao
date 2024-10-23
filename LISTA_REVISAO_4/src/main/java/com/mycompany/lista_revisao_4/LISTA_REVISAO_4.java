/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_4;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_REVISAO_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num;
        System.out.println("Digite um numero: ");
        String resp = s.next();
        try{
            num = Integer.parseInt(resp);
            for(int i = 1; i <= 10; i++){
                System.out.println(num+" x "+i+" = "+(num*i));
            }
        }
        catch(NumberFormatException e){
            System.out.println("Numero invalido!");
        }
    }
}
