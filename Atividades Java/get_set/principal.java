package get_set;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class principal
{

    public static void main(String[] args)
    {
        int op,matricula,idade,cont = 0;
        String nome,curso,acumulador = " ";
        ArrayList<oper> cadastro = new ArrayList<oper>();


        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opçao\n\n1 - Cadastrar\n2 - Consultar\n3 - Alterar\n4 - Excluir\n5 - Imprimir\n6 - Sair","OPCOES",1));

            cont++;

            switch(op)
            {
                case 1:
                matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua Matricula","CADASTRO",1));

                nome = (JOptionPane.showInputDialog(null,"Digite seu Nome","CADASTRO",1));

                idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua Idade","CADASTRO",1));

                curso = (JOptionPane.showInputDialog(null,"Digite seu Curso","CADASTRO",1));

                oper operador = new oper(matricula, idade, nome, curso);

                cadastro.add(operador);


                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                case 5:
                    
                    for (oper i : cadastro) {
                        JOptionPane.showMessageDialog(null, cadastro,"IMPRESSAO",1);
                    }
                    break;
                case 6:

                break;
            }
        }while(op != 6);

    }
    
}
