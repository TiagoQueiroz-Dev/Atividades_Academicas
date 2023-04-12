
package jogo;

import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Collections;


public class Codigo1 extends Thread
{
    
    static int Quantidade_Movimentos = 0;
    static int op;
    
    //um metodo para fazer o movimento dos botoes que possuem 3 movimentos
    public static void movimento(JButton bp, JButton p1, JButton p2, JButton p3,JLabel Numero_Jogadas)
    {
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
            
            //como a quantidade de movimentos tem que ser de acordo com o movimento da speças coloquei uma variavel para armazenar a quantidade de movimentos realizados
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }else if(p3.getText().equals("")){
            p3.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }  
    }
    //um metodo para fazer o movimento dos botoes que possuem 2 movimentos
    public static void movimento(JButton bp, JButton p1, JButton p2,JLabel Numero_Jogadas){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }
    }
    //um metodo para fazer o movimento dos botoes que possuem 4 movimentos
    public static void movimento(JButton bp, JButton p1, JButton p2, JButton p3, JButton p4,JLabel Numero_Jogadas){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }else if(p3.getText().equals("")){
            p3.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }else if(p4.getText().equals("")){
            p4.setText(bp.getText());
            bp.setText("");
            
            Quantidade_Movimentos++;
            Numero_Jogadas.setText("Jogada Nº " + Quantidade_Movimentos);
            
        }
    }
    
    //um metodo para comparar a vitoria do jogo onde ele pega a posiçao dos botes no jogo e compra com um vetor com as possiçoes corretas caso o a ordem dos botoes e o vetor com as possiçoes corretas
    //estejam identicos o jogador tera vencido o jogo e a aparecera a menssagem de que ele venceu 
    public static void vitoria(ArrayList<String> Posicao_Botoes, JLabel Mensagem_Vitoria){
        ArrayList<String> Posicao_Vitoria = new ArrayList();
        Posicao_Vitoria.add("1");
        Posicao_Vitoria.add("2");
        Posicao_Vitoria.add("3");
        Posicao_Vitoria.add("4");
        Posicao_Vitoria.add("5");
        Posicao_Vitoria.add("6");
        Posicao_Vitoria.add("7");
        Posicao_Vitoria.add("8");
        Posicao_Vitoria.add("9");
        Posicao_Vitoria.add("10");
        Posicao_Vitoria.add("11");
        Posicao_Vitoria.add("12");
        Posicao_Vitoria.add("13");
        Posicao_Vitoria.add("14");
        Posicao_Vitoria.add("15");
        Posicao_Vitoria.add("");
        
        if(Posicao_Botoes.equals(Posicao_Vitoria)){
        Mensagem_Vitoria.setText("VOCE VENCEU!");
        }  
    }
    
    //um metodo para embaralhar o jogo caso o usuario tenha vencido o jogo e desejar jgar novamente se nao for o cas
    //o jogador tera a opçao de sair
    public static void embaralhar(ArrayList<String> Nova_Posicao,JButton T1,JButton T2,JButton T3,JButton T4,JButton T5,JButton T6,JButton T7,JButton T8,JButton T9,JButton T10,JButton T11,JButton T12,JButton T13,JButton T14,JButton T15,JButton T16,JLabel Texto_Vitoria){
        op = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente!", 1);
        if(op == 0){
        Collections.shuffle(Nova_Posicao);
        T1.setText(Nova_Posicao.get(0).toString());
        T2.setText(Nova_Posicao.get(1).toString());
        T3.setText(Nova_Posicao.get(2).toString());
        T4.setText(Nova_Posicao.get(3).toString());
        T5.setText(Nova_Posicao.get(4).toString());
        T6.setText(Nova_Posicao.get(5).toString());
        T7.setText(Nova_Posicao.get(6).toString());
        T8.setText(Nova_Posicao.get(7).toString());
        T9.setText(Nova_Posicao.get(8).toString());
        T10.setText(Nova_Posicao.get(9).toString());
        T11.setText(Nova_Posicao.get(10).toString());
        T12.setText(Nova_Posicao.get(11).toString());
        T13.setText(Nova_Posicao.get(12).toString());
        T14.setText(Nova_Posicao.get(13).toString());
        T15.setText(Nova_Posicao.get(14).toString());
        T16.setText(Nova_Posicao.get(15).toString());
        }
        else{
            System.exit(0);
        }
        Texto_Vitoria.setText("");
    }
}
