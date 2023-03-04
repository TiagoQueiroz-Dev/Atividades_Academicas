import javax.swing.JOptionPane;

public class tabuada
{
    public static void main(String[] args) 
    {
     int valor,i,op,novo;
     Boolean teste;
     String aux;
     
     do
     {
        aux = "";
        teste = false;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um Valor", "ESCOLHA", 1));
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a Operação\n1 - Soma\n2 - Subtração\n3 - Multiplicção\n4 - Divisão", "OPÇÃO", 1));
        }while(op < 1 || op > 4);
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira Outro Valor", "ESCOLHA", 1));
        
       
            
            switch(op)
            {
                case 1:
                    
                    aux = aux + valor + " + " + i + " = " + (valor+i) + "\n";
                    
                break;
                case 2:
                    
                    aux = aux + valor + " - " + i + " = " + (valor-i) + "\n";
                    
                    
                    
                break;
                case 3:
                    
                    aux = aux + valor + " x " + i + " = " + (valor*i) + "\n";
                    
                break;
                case 4:
                    
                    aux = aux + valor + " / " + i + " = " + (valor/i) + "\n";
                    
                break;
                default:
                  
                        JOptionPane.showMessageDialog(null,"Opção Escolhida Invalida","ERRO",1);  
                    
                    teste = true;
                break;
                 
            }   
        
        if(!teste)
        {
            JOptionPane.showMessageDialog(null,aux ,"RESULTADO",1);
            novo = JOptionPane.showConfirmDialog(null,"Deseja Fazer Outra Conta?","?",JOptionPane.YES_NO_OPTION);
            
            if(novo == 0)
            {
                teste = true;
            }
        }
     }while(teste);
     
    }
    
}