package jogo;

import javax.swing.JLabel;

public class Teste extends Thread {
    
    JLabel tempo;
    boolean novo_jogo;
    int h = 0;
    int m = 0;
    int s = 0;

    public Teste(JLabel tempo, boolean novo_jogo) {
        this.tempo = tempo;
        this.novo_jogo = novo_jogo;
        start();
    }
    
    public void run(){
        if(!novo_jogo){
            h = 0;
            m = 0;
            s = 0;
        }
        try{
            for(h = 00; h < 24; h++){
                for(m = 00; m < 60; m++){
                    for(s = 00; s < 60; s++){
                        tempo.setText(String.format("Time: %02d:%02d:%02d", h, m, s));
                        
                        Thread.sleep(1000);
                        
                    }
                }
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
