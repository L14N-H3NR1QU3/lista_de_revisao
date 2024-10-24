/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_6;

import java.util.Scanner;

/**
 *
 * @author l.silva
 */
public class LISTA_REVISAO_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float soma = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Digite uma nota: ");
            String resp = s.next();
            try{
                soma += Float.parseFloat(resp);
            }
            catch(NumberFormatException e){
                System.out.println("Numero invalido!");
            }
        }
        System.out.println("Media calculada: "+(soma/3));
    }
}
