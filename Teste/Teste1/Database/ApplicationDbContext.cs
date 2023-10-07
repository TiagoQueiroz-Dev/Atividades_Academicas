using Microsoft.EntityFrameworkCore;
using Teste.Models;
namespace Teste.Database
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(){
            
        }
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options): base(options){
        }
        public DbSet<Cadastro> Cadastros { get; set; }    
    }
}