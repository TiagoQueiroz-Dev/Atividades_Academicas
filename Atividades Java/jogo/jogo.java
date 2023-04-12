package jogo;

import java.util.ArrayList;

public class jogo extends javax.swing.JFrame {
    
    Codigo1 a = new Codigo1();
    boolean teste = false;
    
    public jogo(){
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        Caixa_Vitoria = new javax.swing.JLabel();
        Numero_Jogadas = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(104, 178, 248));

        B1.setText("1");
        B1.setName("B1"); // NOI18N
        B1.setOpaque(true);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.setName("B1"); // NOI18N
        B2.setOpaque(true);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.setName("B1"); // NOI18N
        B3.setOpaque(true);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.setName("B1"); // NOI18N
        B4.setOpaque(true);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.setName("B1"); // NOI18N
        B5.setOpaque(true);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.setName("B1"); // NOI18N
        B6.setOpaque(true);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.setName("B1"); // NOI18N
        B7.setOpaque(true);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.setName("B1"); // NOI18N
        B8.setOpaque(true);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.setName("B1"); // NOI18N
        B9.setOpaque(true);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B10.setText("10");
        B10.setName("B1"); // NOI18N
        B10.setOpaque(true);
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        B11.setText("11");
        B11.setName("B1"); // NOI18N
        B11.setOpaque(true);
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B12.setName("B1"); // NOI18N
        B12.setOpaque(true);
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        B13.setText("13");
        B13.setName("B1"); // NOI18N
        B13.setOpaque(true);
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        B14.setText("14");
        B14.setName("B1"); // NOI18N
        B14.setOpaque(true);
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });

        B15.setText("15");
        B15.setName("B1"); // NOI18N
        B15.setOpaque(true);
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        B16.setText("12");
        B16.setName("B1"); // NOI18N
        B16.setOpaque(true);
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });

        Caixa_Vitoria.setToolTipText("");

        Numero_Jogadas.setText("Jogada Nº");

        Time.setText("Time: 00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Caixa_Vitoria)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(Numero_Jogadas)
                        .addGap(34, 34, 34)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero_Jogadas)
                            .addComponent(Time))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Caixa_Vitoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B2, B1, B3, B6,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B6, B2, B5, B7, B10,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        a.movimento(B10, B6, B9, B11, B14,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                   

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        a.movimento(B14, B10, B13, B15,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                   

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B1, B2, B5,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B4, B3, B8,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        a.movimento(B12, B8, B11, B16,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                   

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B3, B2, B4, B7,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        a.movimento(B15, B11, B14, B16,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                   

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        ArrayList<String> posicao = new ArrayList();
        
        a.movimento(B16, B12, B15,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
        
        if(B1.getText().equals("1")&& B4.getText().equals("4")&& B13.getText().equals("13"))
        {
            posicao.add(B1.getText());
            posicao.add(B2.getText());
            posicao.add(B3.getText());
            posicao.add(B4.getText());
            posicao.add(B5.getText());
            posicao.add(B6.getText());
            posicao.add(B7.getText());
            posicao.add(B8.getText());
            posicao.add(B9.getText());
            posicao.add(B10.getText());
            posicao.add(B11.getText());
            posicao.add(B12.getText());
            posicao.add(B13.getText());
            posicao.add(B14.getText());
            posicao.add(B15.getText());
            posicao.add(B16.getText());
        }
        
        a.vitoria(posicao,Caixa_Vitoria);
        
        if(Caixa_Vitoria.getText().equals("VOCE VENCEU!"))
        {
            a.embaralhar(posicao,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,Caixa_Vitoria);
            teste = false;
            //Time.setText("Time: 00:00:00");
            Teste thread = new Teste(Time,teste);
        }
    }                                   

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        a.movimento(B13, B9, B14,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                   

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B9, B5, B10, B13,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        a.movimento(B11, B7, B10, B12, B15,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                   

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B8, B4, B7, B12,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B7, B3, B6, B8, B11,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        a.movimento(B5, B1, B6, B9,Numero_Jogadas);
        
        if(!teste){
            Teste thread = new Teste(Time,teste);
            teste = true;
        }
    }                                  

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel Caixa_Vitoria;
    private javax.swing.JLabel Numero_Jogadas;
    private javax.swing.JLabel Time;
    // End of variables declaration                   
}
