/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voto;

import javax.swing.JOptionPane;

/**
 *
 * @author William Lima Alves R.A:21123196-5
 */
public class Voto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantidade; // Declarar Variavel para controlar quantidade de votos
        int cont;// Declarar variavel para contador da quantidade de votos
        int voto;// Declarar variavel para receber o voto
        int opcao1 = 0;// variavel para receber voto zé da farmacia
        int opcao2 = 0;// variavel para receber voto Rita da padaria
        int percentual1;// variavel para calcular percentual de voto Ze da farmacia
        int percentual2;// variavel para calcular percentual de voto Rita da padaria
        
        
        String quantidadeStr = JOptionPane.showInputDialog(null, "Digite quantas pessoas vão participar da pesquisa:"); //Receber dados da quantidade de votos
        
        quantidade = Integer.parseInt(quantidadeStr);//transformar quantidadeStr em variavel integer
        
        cont = quantidade; // enviar dados da quantidade para contador
        
        JOptionPane.showMessageDialog(null,"Iremos ter no total "+quantidade+" de votos."); // exibir a quantidade de eleitores
        
        do{
            
            String votoStr = JOptionPane.showInputDialog(null,"Favor escolher entre:\nVote 1 - Zé da Farmácia \nVote 2 - Rita da Padaria");
            
            voto = Integer.parseInt(votoStr);
            
            switch(voto){
                case 1:
                    opcao1 += 1;
                    JOptionPane.showMessageDialog(null,"Seu voto no Zé da Farmácia foi computado.");
                    break;
                case 2:
                    opcao2 += 1;
                    JOptionPane.showMessageDialog(null,"Seu voto na Rita da Padaria foi computado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Você escolheu uma opção invalida seu voto foi anulado.");
                break;   
              
            }
            
            cont -= 1; 
        
        }while(cont >= 1); // fazer switch(escolha) enquanto o contador não zerar
        
        percentual1=(opcao1*100)/quantidade;//calculo para porcentagem
        percentual2=(opcao2*100)/quantidade;//calculo para porcentagem
        
        JOptionPane.showMessageDialog(null, "Quantidade total de votos: "+quantidade+"\nZé da Farmácia teve "+opcao1+" voto(s)  com percentual de"+percentual1+"%\nRita da Padaria teve  "+opcao2+ " voto(s)  com percentual de "+percentual2+ "%");
        
    }
    
}
