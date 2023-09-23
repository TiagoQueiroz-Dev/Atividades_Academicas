using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atividade_18_09_23_pets
{
    public class Humano
    {
        public Humano(string nome, int idade, string endereco)
        {
            Nome = nome;
            Idade = idade;
            Endereco = endereco;
        }

        public string Nome { get; set; }
        public int Idade { get; set; }
        public string Endereco { get; set; }
    }
}