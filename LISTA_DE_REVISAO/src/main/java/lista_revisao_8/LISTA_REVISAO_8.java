/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_8;

import java.util.Scanner;

/**
 *
 * @author l.silva
 */
public class LISTA_REVISAO_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float soma = 0;
        String resp;
        int res = 0;
        do{
            for(int i = 0; i < 3; i++){
                System.out.println("Digite a nota: ");
                resp = s.next();
                try{
                    soma += Float.parseFloat(resp);
                }
                catch(NumberFormatException e){
                    System.out.println("Numero invalido!");
                }
                if((soma/3) >= 6){
                    System.out.println("Passou!");
                }
                else{
                    System.out.println("Reprovado!");
                }
            }
            System.out.println("Deseja calcular novamente? (1-Sim/2-Nao)");
            resp = s.next();
            try{
                res = Integer.parseInt(resp);
            }
            catch(NumberFormatException e){
                System.out.println("Numero invalido!");
            }
        }while(res == 2);
    }
}
