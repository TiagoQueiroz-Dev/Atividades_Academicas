using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atividade_18_09_23
{
    public class Artigos
    {
        public string Titulo { get; set; }
        public string Palavra { get; set; }
        public List<Autor> Autores{ get; set; }
        public string Instituicao { get; set; }
        public Artigos(string titulo, string palavra, List<Autor> autores, string instituicao)
        {
            this.Titulo = titulo;
            this.Palavra = palavra;
            this.Autores = autores;
            this.Instituicao = instituicao;
        }

        public void impressao(){
            Console.WriteLine($"Titulo: {Titulo}\nInstituiçao: {Instituicao}\nAutores: ");
            foreach (var item in Autores)
            {
               Console.WriteLine($"»{item.Nome}"); 
            }
            Console.WriteLine("");
        }
        
    }

    
}