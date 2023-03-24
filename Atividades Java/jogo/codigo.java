package jogo;
import javax.swing.JButton;

public class codigo {
    public static void movimento(JButton bp, JButton p1, JButton p2, JButton p3){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
        }else if(p3.getText().equals("")){
            p3.setText(bp.getText());
            bp.setText("");
        }  
    }
    
    public static void movimento(JButton bp, JButton p1, JButton p2){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
        }
    }
    public static void movimento(JButton bp, JButton p1, JButton p2, JButton p3, JButton p4){
        if(p1.getText().equals("")){
            p1.setText(bp.getText());
            bp.setText("");
        }else if(p2.getText().equals("")){
            p2.setText(bp.getText());
            bp.setText("");
        }else if(p3.getText().equals("")){
            p3.setText(bp.getText());
            bp.setText("");
        }else if(p4.getText().equals("")){
            p4.setText(bp.getText());
            bp.setText("");
        }
    }
}
