using Atividade_18_09_23;
List<Autor> Autores = new List<Autor>();
Autor autor = new Autor("Tiago","enail");
Autor autor1 = new Autor("icaro","enail");

Autores.Add(autor);
Autores.Add(autor1);

Artigos aux = new Artigos("Ricardo Eletro","Falencia",Autores,"Senai");



List<Autor> Autores1 = new List<Autor>();
Autor autor2 = new Autor("kevin","enail");
Autor autor3 = new Autor("raphael","enail");
Autores1.Add(autor2);
Autores1.Add(autor3);

Artigos aux1 = new Artigos("Magalu","Sucesso",Autores1,"Unifacs");

List<Autor> Autores2 = new List<Autor>();
Autor autor4 = new Autor("Will","enail");
Autor autor5 = new Autor("Bergues","enail");
Autores2.Add(autor4);
Autores2.Add(autor5);

Artigos aux2 = new Artigos("Americanas","Sucesso",Autores2,"Pitagoras");


Console.WriteLine("Digite a palavra chave do artigo");
string op = Console.ReadLine();
Console.Clear();
Console.WriteLine("ARTIGOS ENCONTRADOS:\n");

if(string.Equals(op,"Falencia", StringComparison.OrdinalIgnoreCase)){
    aux.impressao();
}else if(string.Equals(op,"Sucesso", StringComparison.OrdinalIgnoreCase)){
    aux1.impressao();
    aux2.impressao();
}else{
    Console.WriteLine("Nenhum artigo com esta palavra chave");
}