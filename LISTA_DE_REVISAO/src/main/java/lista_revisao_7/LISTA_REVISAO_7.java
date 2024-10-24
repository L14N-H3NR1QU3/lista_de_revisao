/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_7;

import java.util.Scanner;

/**
 *
 * @author l.silva
 */
public class LISTA_REVISAO_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int tam = 0;
        int val;
        System.out.println("Digite o tamanho do inventario: ");
        String resp = s.next();
        try{
            tam = Integer.parseInt(resp);
        }
        catch(NumberFormatException e){
            System.out.println("Numero invalido!");
        }
        int inv[] = new int [tam];
        for(int i = 0; i < tam; i++){
            System.out.println("Digite os valores do inventario: ");
            resp = s.next();
            try{
                inv[i] = Integer.parseInt(resp);
            }
            catch(NumberFormatException e){
                System.out.println("Numero invalido!");
                i--;
            }
        }
        System.out.println("Digite o valor desejado: ");
        resp = s.next();
        try{
            val = Integer.parseInt(resp);
            for(int i = 0; i < tam; i++){
                if(val == inv[i]){
                    System.out.println("Valor encontrado "+inv[i]+"["+(i)+"]");
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("Numero invalido!");
        }
    }
}
