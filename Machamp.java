
public class Machamp extends MeuPokemon implements PokeLutador {

    public Machamp(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vivo = vivo;
        this.qtdVitorias = qtdVitorias;

    }

    public boolean isVivo() {
        // TODO Auto-generated method stub
        return super.isVivo();
    }

    public void setNome(String nome) {
        super.setNome("MACHAMP");
    }

    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------MACHAMP---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------MACHAMP--------------------------- \n\n");
    }

    void listarAtaques() {
        System.out.println("1- CABECADA");
        System.out.println("2- MURRO");
        System.out.println("3-CHUTE");
    }

    @Override
    public double cabecada() {
        System.out.println("MACHAMP USOU GOLPE: *CABECADA*");
        return 25;
    }

    @Override
    public double chute() {
        System.out.println("MACHAMP USOU GOLPE: *CHUTE*");
        return 30;
    }

    @Override
    public double murro() {
        System.out.println("MACHAMP USOU GOLPE: *MURRO*");
        return 75.0;
    }

    @Override
    public double mataLeao() {
        System.out.println("MACHAMP USOU GOLPE: *MATA LEAO*");
        return 95.0;
    }

    @Override
    public double golpe() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double golpe(int param) {
        double retorno = 1;
        if (param == 1) {
            retorno = cabecada();
        } else if (param == 2) {
            retorno = chute();
        } else if (param == 3) {
            retorno = murro();
        } else if (param == 4) {
            retorno = mataLeao();
        } else {
            retorno = mataLeao();
        }
        return retorno;

    }

}
