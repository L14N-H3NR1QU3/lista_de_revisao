/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_2;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_REVISAO_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String qtd;
        int conversor = 0;
        boolean entrada = true;
        do{
            System.out.println("Digite a quantidade: (digite uma letra para sair)");
            qtd = s.next();
        try{
            conversor = Integer.parseInt(qtd);
            if(conversor%2 == 0){
                System.out.println("Numero par!");
            }
            else{
                System.out.println("Numero impar!");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Obrigado por usar o sistema!");
            entrada = false;
        }
        }while(entrada);
    }
}
