using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Threading.Tasks;

namespace Teste3.Models
{
    public class Cadastro
    {
        public int Id { get; set; }
        [MaybeNull]
        public string Nome { get; set; }
        [MaybeNull]
        public string Sobrenome { get; set; }
    }
}