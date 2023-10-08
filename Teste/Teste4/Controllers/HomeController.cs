using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Teste4.Database;
using Teste4.Models;

namespace Teste4.Controllers;

public class HomeController : Controller
{
    private Context a;

    public HomeController(Context logger)
    {
        a = logger;
    }

    public IActionResult Index()
    {
        var b = a.Produtos.ToList();
        return View(b);
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
