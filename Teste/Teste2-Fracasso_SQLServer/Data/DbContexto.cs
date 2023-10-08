using Microsoft.EntityFrameworkCore;
public class DbContexto : DbContext{
    
    // public DbContexto(DbContextOptions<DbContexto> options): base(options){}

    // public DbContexto()
    // {
    // }
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseSqlServer("Conexao");
        }
    }

    public DbSet<Cadastro> Cadastros { get; set; }
}