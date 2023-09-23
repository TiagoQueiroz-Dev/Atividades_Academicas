using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atividade_18_09_23_pets
{
    public class Animal
    {
        public Animal()
        {
        }

        public Animal(string Nome, string Raca, bool Vacina, int Idade, string Humano)
        {
            this.Nome = Nome;
            this.Raca = Raca;
            this.Vacina = Vacina;
            this.Idade = Idade;
            this.Humano = Humano;
            //iagoganhanaquedadebraço.C#
        }

        public string Nome { get; set; }
        public string Raca { get; set; }
        public Boolean Vacina { get; set; }
        public int Idade { get; set; }
        public string Humano { get; set; }
    }
}