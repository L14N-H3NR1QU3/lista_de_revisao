/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_11;

import java.io.IOException;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class LISTA_REVISAO_11 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        String resp;
        int tam = 0;
        int men = 0;
        int mai = 0;
        System.out.println("Digite o tamanho da serie de dados: ");
        resp = s.next();
        try{
            tam = Integer.parseInt(resp);
        }
        catch(NumberFormatException e){
            System.out.println("Valor invalido!");
        }
        int vet[] = new int [tam];
        for(int i = 0; i < tam; i++){
            System.out.println("Digita um valor: ");
            resp = s.next();
            try{
                vet[i] = Integer.parseInt(resp);
                if(mai < vet[i]){
                    mai = vet[i];
                }
                if(men == 0){
                    men = vet[i];
                }
                else if(men > vet[i]){
                    men = vet[i];
                }
            }
            catch(NumberFormatException e){
                System.out.println("Valor invalido!");
            }
        }
        System.out.println("Maior: "+mai);
        System.out.println("Menor: "+men);
    }
}