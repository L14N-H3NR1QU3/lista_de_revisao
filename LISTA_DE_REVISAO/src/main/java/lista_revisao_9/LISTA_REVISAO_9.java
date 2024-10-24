/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_9;

import java.util.Scanner;

/**
 *
 * @author l.silva
 */
public class LISTA_REVISAO_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int menuVal[] = {10, 20, 15, 25, 30};
        String menuNome[] = {"Suco", "Hamburguer", "Refrigerante", "Bolo", "Prato feito"};
        String resp;
        int qtd = 0;
        System.out.println("Digite seu nome: ");
        String nome = s.next();
        System.out.println("Quantidade de itens: ");
        resp = s.next();
        try{
            qtd = Integer.parseInt(resp);
        }
        catch(NumberFormatException e){
            System.out.println("Numbero invalido!");
        }
        for(int i = 0; i < qtd; i++){
            int esc[] = new int [qtd];
            for(int j = 0; j < 5; j++){
                System.out.println((j+1)+"-"+menuNome[j]+": R$"+menuVal[j]);
            }
            System.out.println("Escolha: ");
            resp = s.next();
            try{
                esc[i] = Integer.parseInt(resp);
            }
            catch(NumberFormatException e){
                System.out.println("Numero invalido!");
            }
        }
    }
}
