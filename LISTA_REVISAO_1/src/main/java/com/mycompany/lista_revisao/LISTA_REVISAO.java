/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_REVISAO {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int soma = 0;
        System.out.println("Digite um numero: ");
        String numA = s.next();
        try{
            soma += Integer.parseInt(numA);
        }
        catch(NumberFormatException e){
            System.out.println("Numero invalido!");
        }
        System.out.println("Digite um numero: ");
        String numB = s.next();
        try{
            soma += Integer.parseInt(numB);
        }
        catch(NumberFormatException e){
            System.out.println("Numero invelido!");
        }
        System.out.println("Resultado: "+soma);
    }
}
