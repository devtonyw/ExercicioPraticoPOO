import entidades.Livro;
import entidades.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 19,"Masculino");
        p[1] = new Pessoa("Osmar", 32, "Masculino");

        l[0] = new Livro("Sherlock", "Holmes",245,p[0]);
        l[1] = new Livro("Homeria", "Jo",354,p[1]);
        l[2] = new Livro("Estudo", "Nomesa",3522,p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        p[0].fazerAniver();
        System.out.print(l[0].detalhes());
    }
}