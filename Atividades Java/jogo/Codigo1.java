
package jogo;

import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Codigo1 {
    
    static int contar = 0;
    static int ap;
    
    public static void movimento(JButton bp, JButton p1, JButton p2, JButton p3,JLabel rec){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }else if(p3.getText().equals("")){
            p3.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }  
    }
    
    public static void movimento(JButton bp, JButton p1, JButton p2,JLabel rec){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }
    }
    public static void movimento(JButton bp, JButton p1, JButton p2, JButton p3, JButton p4,JLabel rec){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }else if(p3.getText().equals("")){
            p3.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }else if(p4.getText().equals("")){
            p4.setText(bp.getText());
            bp.setText("");
            contar++;
            rec.setText("Jogada Nº "+contar);
        }
    }
    public static void vitoria(ArrayList<String> comparar, JLabel vit){
        ArrayList<String> a = new ArrayList();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        a.add("10");
        a.add("11");
        a.add("12");
        a.add("13");
        a.add("14");
        a.add("15");
        a.add("");
        
        if(comparar.equals(a)){
        vit.setText("VOCE VENCEU!");
        }  
    }
    public static void embaralhar(ArrayList<String> incinuante,JButton T1,JButton T2,JButton T3,JButton T4,JButton T5,JButton T6,JButton T7,JButton T8,JButton T9,JButton T10,JButton T11,JButton T12,JButton T13,JButton T14,JButton T15,JButton T16,JLabel nokia){
        ap = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente!", 1);
        if(ap == 0){
        Collections.shuffle(incinuante);
        T1.setText(incinuante.get(0).toString());
        T2.setText(incinuante.get(1).toString());
        T3.setText(incinuante.get(2).toString());
        T4.setText(incinuante.get(3).toString());
        T5.setText(incinuante.get(4).toString());
        T6.setText(incinuante.get(5).toString());
        T7.setText(incinuante.get(6).toString());
        T8.setText(incinuante.get(7).toString());
        T9.setText(incinuante.get(8).toString());
        T10.setText(incinuante.get(9).toString());
        T11.setText(incinuante.get(10).toString());
        T12.setText(incinuante.get(11).toString());
        T13.setText(incinuante.get(12).toString());
        T14.setText(incinuante.get(13).toString());
        T15.setText(incinuante.get(14).toString());
        T16.setText(incinuante.get(15).toString());
        }
        nokia.setText("");
    }
    /*public static void time(JLabel tempo){
        tempo.setText("Time: " );
    */   
}
