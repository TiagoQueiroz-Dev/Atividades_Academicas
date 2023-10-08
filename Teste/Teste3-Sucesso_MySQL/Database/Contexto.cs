using Microsoft.EntityFrameworkCore;
using Teste3.Models;
namespace Teste3.Database;

public class Contexto : DbContext{
    public Contexto(DbContextOptions<Contexto> options) : base(options){}

    public DbSet<Cadastro> Cadastros { get; set; }
}