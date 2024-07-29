import java.io.Serializable;

public abstract class MeuPokemon extends Pokemon implements SalvarArquivos, Serializable {

    protected int qtdVitorias;

    public abstract double golpe();

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    void Batalhar() {
        if (vivo == false) {
            System.out.println("O POKEMON NÃO PODE BATALHAR!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnivel() {
        return nivel;
    }

    public void setnivel(int nivel) {
        this.nivel = nivel;
    }

    public double getAtaque(double ataque) {
        return ataque;
    }


    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void ListarAtaques() {
        System.out.println("O POKEMON ATACA");
    }

    public boolean vivo() {
        return vivo;
    }

    public void setvivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void Status() {

        System.out.println("---------------------------POKEMON---------------------------");
        System.out.println("NOME:                                                      " + this.nome);
        System.out.println("NIVEL:                                                     " + this.nivel);
        System.out.println("ATAQUE:                                                    " + this.ataque);
        System.out.println("DEFESA:                                                    " + this.defesa);
        System.out.println("VITÓRIAS:                                                  " + this.qtdVitorias);
        System.out.println("---------------------------POKEMON--------------------------- \n\n");
    }

    public int getQtdVitorias() {
        return qtdVitorias;
    }

    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }

    public double getAtaque(int ataque) {
        return ataque;
    }

}
