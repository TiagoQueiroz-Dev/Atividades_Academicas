using sistem;
class ativ7{
    static void Main(){
        float valor,dobro,Tparte;
        Console.WriteLine("digite um valor:");
        valor = float.Parse(Console.ReadLine());
        dobro = valor*2;
        Tparte = valor/3;
        Console.WriteLine($"o dobro de {valor} é: {dobro} e a terça parte de {valor} é: {Tparte}");
    }
}