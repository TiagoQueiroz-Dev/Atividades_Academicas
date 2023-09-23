using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atividade_18_09_23_pets
{
    public class Cachorro : Animal    {
        public Cachorro (string Nome, string Raca, bool Vacina, int Idade, string Humano,string Tamanho) : base(Nome, Raca, Vacina, Idade, Humano)
        {
            // this.Nome = Nome;
            // this.Raca = Raca;
            // this.Vacina = Vacina;
            // this.Idade = Idade;
            // this.Humano = Humano;
            this.Tamanho = Tamanho;
        }
        public string Tamanho { get; set; }
        

    }
}