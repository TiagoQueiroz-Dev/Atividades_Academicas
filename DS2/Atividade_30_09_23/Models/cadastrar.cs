using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Threading.Tasks;

namespace Atividade_30_09_23.Models
{
    public class Cadastrar
    {
        public Cadastrar()
        {
        }

        public Cadastrar(string nome, string idade)
        {
            Nome = nome;
            Idade = idade;
        }

        [MaybeNull]
        public string Nome { get; set; }
        [MaybeNull]
        public string Idade { get; set; }
    }
}