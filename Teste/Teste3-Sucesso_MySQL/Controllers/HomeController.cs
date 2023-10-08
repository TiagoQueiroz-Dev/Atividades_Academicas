using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Teste3.Models;
using Teste3.Database;

namespace Teste3.Controllers;

public class HomeController : Controller
{
    private Contexto _db;
    //private readonly ILogger<HomeController> _logger;

    public HomeController(Contexto db)
    {
        _db = db;
    }

    public IActionResult Index()
    {
        return View();
    }
    [HttpPost]
    public IActionResult Cadastro(Cadastro a)
    {
        _db.Cadastros.Add(a);
        _db.SaveChanges();
        return RedirectToAction("Index");
    }
    public IActionResult Imprimir()
    {
        var b = _db.Cadastros.ToList();
        return View(b);
    }



    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
