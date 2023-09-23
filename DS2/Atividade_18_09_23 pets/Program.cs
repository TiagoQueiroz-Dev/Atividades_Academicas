using Atividade_18_09_23_pets;

//Cachorro gato = new Cachorro();
List<Animal> anima = new List<Animal>{
    new Animal {Nome = "pit",Raca = "vira-lata",Vacina = false,Idade = 1,Humano = "Iago"},
    new Animal {Nome = "Zeus",Raca = "Beagle",Vacina = false,Idade = 2,Humano = "Iago"},
    new Animal {Nome = "macaco",Raca = "salsicha",Vacina = true,Idade = 1,Humano = "Joroba"},
    new Animal {Nome = "Thor",Raca = "Beagle",Vacina = true,Idade = 2,Humano = "Tiago"},
};
List<Cachorro> dog = new List<Cachorro>{
    new Cachorro {Nome = "pit",Raca = "vira-lata",Vacina = false,Idade = 1,Humano = "Iago",Tamanho = "medio"}
};
var teste = anima.FindAll(anima => anima.Humano == "Iago");
Console.WriteLine("Pet's de Iago:");
foreach (var item in teste)
{
    Console.WriteLine(item.Nome);
}
var teste1 = anima.FindAll(anima => anima.Humano == "Tiago");
Console.WriteLine("Pet's de Tiago:");
foreach (var item in teste1)
{
    Console.WriteLine(item.Nome);
}