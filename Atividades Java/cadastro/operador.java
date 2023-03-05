import javax.swing.JOptionPane;

public class operador {

    int n = 5,i;
    String[] nome = new String[n];
    String consultar = " ";

    boolean fa1se = true;

    public void cadastrar()
    {
        
        for(i = 0; i < n; i++)
        {
            nome[i] = JOptionPane.showInputDialog(null,"digite o " + (i+1) + "º nome","CADASTRO",1);
        }

    }
    public void consulta()
    {

        consultar = JOptionPane.showInputDialog(null, "digite o nome do cadastro que deseja buscar", "BUSCAR",1);

        for(i = 0; i < n; i++)
        {
            

            if(nome[i].equals(consultar))
            {
                //i = n;
                fa1se = false;
                break;
            }

        }
        if(fa1se)
        {
            JOptionPane.showMessageDialog(null, "O cadastro nao existe", "CONSULTA", 1); 
        }
        else
        {

            JOptionPane.showMessageDialog(null, "O nome consta no cadastro", "CONSULTA", 1);
            
        }

    }
    public void alterar()
    {

        consultar = JOptionPane.showInputDialog(null, "digite o nome do cadastro que deseja alterar", "BUSCAR",1);

        for(i = 0; i < n; i++)
        {
            

            if(nome[i].equals(consultar))
            {
                //i = n;
                fa1se = false;
                break;
            }

        }
        if(!fa1se)
        {
            nome[i] = JOptionPane.showInputDialog(null,"Altere o " + (i+1) + "º nome","Alteraçao",1);
        }
        
    }
    public void imprimir()
    {

        consultar = "";

        for(i = 0; i < n;i++)
        {

            consultar += nome[i] + "\n";

        }

        JOptionPane.showMessageDialog(null,consultar, "IMPRIMIR", 1);

    }
    public void Ordem_Cressente()
    {

        int a,b;
        String aux = "";
        for(i = 0; i < 4; i++ )
        {

            for(a = i+1; a < 5; a++)
            {

                b = (nome[i].compareTo(nome[a]));
                if(b > 0)
                {

                    aux = nome[i];
                    nome[i] = nome[a];
                    nome[a] = aux;

                }

            }

        }

    }
    public void Ordem_Decressente()
    {

        int a,b;
        String aux = "";
        for(i = 0; i < 4; i++ )
        {

            for(a = i+1; a < 5; a++)
            {

                b = (nome[i].compareTo(nome[a]));
                if(b < 0)
                {

                    aux = nome[i];
                    nome[i] = nome[a];
                    nome[a] = aux;

                }

            }

        }

    }
    public void Excluir()
    {
        int aux;

        consultar = JOptionPane.showInputDialog(null, "digite o nome do cadastro que deseja Excluir", "Excluir",1);

        for(i = 0; i < n; i++)
        {
            

            if(nome[i].equals(consultar))
            {
                
                for(aux = i; aux < n; aux++)
                {
                    if(aux < 4)
                    {

                        nome[aux] = nome[aux+1];

                    }

                }
                nome[4] = "";
                
            }

        }
       
        
    }
    

    
}
