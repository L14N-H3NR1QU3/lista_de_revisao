/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author l.silva
 */
public class LISTA_REVISAO_9 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        int menuVal[] = {10, 20, 15, 25, 30};
        String menuNome[] = {"Suco", "Hamburguer", "Refrigerante", "Bolo", "Prato feito"};
        String resp;
        int qtd = 0;
        int valTotal = 0;
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
        int esc[] = new int [qtd];
        for(int i = 0; i < qtd; i++){
            for(int j = 0; j < 5; j++){
                System.out.println((j+1)+"-"+menuNome[j]+": R$"+menuVal[j]+".00");
            }
            System.out.println("Escolha: ");
            resp = s.next();
            try{
                esc[i] = Integer.parseInt(resp);
                if(esc[i] <= 0 && esc[i] > 5){
                    System.out.println("Numero invalido!");
                    i--;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Numero invalido!");
            }
        }
        for(int i = 0; i < qtd; i++){
            valTotal += menuVal[esc[i]-1];
        }
        JOptionPane.showMessageDialog(null, "Valor total da compra: R$"+valTotal+".00");
        FileWriter arquivo = new FileWriter("Pedido "+nome);
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("----------------------------\n");
        gravar.printf("Nome do cliente: "+nome+"\n");
        gravar.printf("----------------------------\n");
        for(int i = 0; i < qtd; i++){
            gravar.printf(menuNome[esc[i]]+" - "+menuVal[esc[i]]+"\n");
        }
        gravar.printf("----------------------------\n");
        gravar.printf("Valor total: "+valTotal+"\n");
        arquivo.close();
    }
}
