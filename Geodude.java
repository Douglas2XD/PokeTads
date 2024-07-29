public class Geodude extends MeuPokemon implements PokePedra {
    public Geodude(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
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
        super.setNome("GEODUDE");
    }

    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------GEODUDE---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------GEODUDE--------------------------- \n\n");
    }

    void listarAtaques() {
        System.out.println("1- PODER ANCESTRAL");
        System.out.println("2- PEDROADA");
        System.out.println("3-TEMPESTADE DE AREIA");
    }

    @Override
    public double golpePedra1() {
        System.out.println("GEODUDE USOU GOLPE: *PODER ANCESTRAL*");
        return 150;
    }

    @Override
    public double golpePedra2() {
        System.out.println("GEODUDE USOU GOLPE: *PEDRADA*");
        return 50;
    }

    @Override
    public double golpePedra3() {
        System.out.println("GEODUDE USOU GOLPE: *TEMPESTADE DE AREIA*");
        return 1.5;
    }

    @Override
    public double golpePedra4() {
        System.out.println("GEODUDE USOU GOLPE: *BARRO*");
        return 1.5;
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
            retorno = golpePedra1();
        } else if (param == 2) {
            retorno = golpePedra2();
        } else if (param == 3) {
            retorno = golpePedra3();
        } else if (param == 4) {
            retorno = golpePedra4();
        } else {
            retorno = golpePedra4();
        }
        return retorno;

    }

}
