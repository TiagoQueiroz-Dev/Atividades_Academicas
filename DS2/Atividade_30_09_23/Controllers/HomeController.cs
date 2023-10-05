using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Atividade_30_09_23.Models;

namespace Atividade_30_09_23.Controllers;

public class HomeController : Controller
{
    List<Cadastrar> PessoasCadastradas = new List<Cadastrar>{
        new Cadastrar("Tiago","19")
    };
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }
    public IActionResult Cadastro()
    {
        return View();
    }
    
    public IActionResult Lista()
    {
        return View(PessoasCadastradas);
    }
    [HttpPost]
    public IActionResult CadastroPost(Cadastrar teste)
    {

        PessoasCadastradas.Add(teste);
        return RedirectToAction("Cadastro");
    }
    

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
