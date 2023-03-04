import javax.swing.JOptionPane;


public class cadastro 
{

    public static void main(String[] args)
    {

        int op;
        operador nome = new operador();

        do{

            op = Integer.parseInt(JOptionPane.showInputDialog(null,"selecione uma opçao\n\n1 - Cadastrar\n2 - Consultar\n3 - Alterar\n4 - Ordenar Crescente\n5 - Ordenar Decrescente\n6 - Excluir\n7 - Imprimir\n8 - Sair"));

            switch(op)
            {
                case 1:
                    nome.cadastrar();
                break;
                case 2:
                    nome.consulta();
                break;
                case 3:
                    nome.alterar();
                break;
                case 4:
                    nome.Ordem_Cressente();
                break;
                case 5:
                    nome.Ordem_Decressente();
                break;
                case 6:
                    nome.Excluir();
                break;
                case 7:
                    nome.imprimir();
                break;
                case 8:
                
                break;
            }
        }while(op != 8);
    }
    
}
