using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atividade_18_09_23
{
    public class Autor
    {
        public Autor(string nome, string email)
        {
            Nome = nome;
            Email = email;
        }

        public string Nome { get; set; }
        public string Email { get; set; }
    }
}