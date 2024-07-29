public class Pikachu extends MeuPokemon implements PokeEletrico {

    public Pikachu(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vivo = vivo;
        this.qtdVitorias = qtdVitorias;
    }

    @Override
    public double golpe() {
        // TODO Auto-generated method stub
        return 0;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public boolean isVivo() {
        // TODO Auto-generated method stub
        return super.isVivo();
    }

    public void setNome(String nome) {
        super.setNome("PIKACHU");
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------PIKACHU---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------PIKACHU--------------------------- \n\n");
    }

    void listarAtaques() {
        System.out.println("1- INVESTIDA");
        System.out.println("2- CHOQUE DO TROVAO");
        System.out.println("3-CALDA DE FERRO");
    }

    @Override
    public double golpeEletrico() {
        System.out.println("PIKACHU USOU GOLPE: *INVESTIDA*");
        return 20;
    }

    @Override
    public double golpeEletrico2() {
        System.out.println("PIKACHU USOU GOLPE: *CHOQUE DO TROVÃO*");
        return 200;
    }

    @Override
    public double golpeEletrico3() {
        System.out.println("PIKACHU USOU GOLPE: *CALDA DE FERRO*");
        return 100;
    }

    @Override
    public double golpeEletrico4() {
        System.out.println("PIKACHU USOU GOLPE: *CALDA DE CHOCOLATE*");
        return 100.5;
    }

    @Override
    public double golpe(int param) {
        double retorno = 1;
        if (param == 1) {
            retorno = golpeEletrico();
        } else if (param == 2) {
            retorno = golpeEletrico2();
        } else if (param == 3) {
            retorno = golpeEletrico3();
        } else if (param == 4) {
            retorno = golpeEletrico4();
        } else {
            retorno = golpeEletrico();
        }
        return retorno;

    }
}
