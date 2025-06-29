package entidades;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual = 0;
    private boolean aberto = false;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ",\n autor='" + autor + '\'' +
                ",\n totPag=" + totPag +
                ",\n pagAtual=" + pagAtual +
                ",\n aberto=" + aberto +
                ",\n leitor=" + leitor.getNome() +
                    "\nidade=" + leitor.getIdade() +
                    "\nsexo=" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if(getTotPag()<pag){
            System.out.println("Voce tentou folhear uma pagina que nao existe");
            pag = 0;
        }else {
        setPagAtual(getPagAtual()+pag);
    }}

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual()-1);
    }
}
