/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_revisao_10;

/**
 *
 * @author l.silva
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class LISTA_REVISAO_10 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        String resp;
        String genero[] = {"Acao", "Comedia", "Drama", "Romance", "Ficcao"};
        int qtd = 0;
        int qtdEscGen[] = {0, 0, 0, 0, 0};
        System.out.println("Quantidade de clientes: ");
        resp = s.next();
        try{
            qtd = Integer.parseInt(resp);
        }
        catch(NumberFormatException e){
            System.out.println("Valor invalido!");
        }
        int escGen[] = new int [qtd];
        for(int i = 0; i < qtd; i++){
            for(int j = 0; j < 5; j++){
                System.out.println((j+1)+" - "+genero[j]);
            }
            System.out.println("Resposta: ");
            resp = s.next();
            try{
                int gen = Integer.parseInt(resp);
                qtdEscGen[gen-1]++;
                escGen[i] = gen;
            }
            catch(NumberFormatException e){
                System.out.println("Valor invalido!");
            }
        }
        JOptionPane.showMessageDialog(null, "Acao: "+qtdEscGen[0]+"\nComedia: "+qtdEscGen[1]+"\nDrama: "+qtdEscGen[2]+"\nRomance: "+qtdEscGen[3]+"\nficcao: "+qtdEscGen[4]);
        FileWriter arquivo = new FileWriter("Resultado");
        PrintWriter g = new PrintWriter(arquivo);
        g.printf("Acao: "+qtdEscGen[0]+"\nComedia: "+qtdEscGen[1]+"\nDrama: "+qtdEscGen[2]+"\nRomance: "+qtdEscGen[3]+"\nficcao: "+qtdEscGen[4]);
        arquivo.close();
    }
}
