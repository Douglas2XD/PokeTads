public class Bulbasaur extends MeuPokemon implements PokeGrama {

    public Bulbasaur(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = ataque;
        this.vivo = vivo;
        this.qtdVitorias = qtdVitorias;

    }

    @Override
    public boolean isVivo() {
        // TODO Auto-generated method stub
        return super.isVivo();
    }

    public void setNome(String nome) {
        super.setNome("BULBASAUR");
    }

    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------BULBASAUR---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------BULBASAUR--------------------------- \n\n");
    }

    void listarAtaques() {
        System.out.println("1- SOLAR BEAM");
        System.out.println("2- CHICOTADA");
        System.out.println("3-TORNADO DE FOLHAS");
    }

    @Override
    public double golpeGrama1() {
        System.out.println("BULBASAUR USOU GOLPE: *SOLAR BEAM*");
        return 150;
    }

    @Override
    public double golpeGrama2() {
        System.out.println("BULBASAUR USOU GOLPE: *CHICOTADA*");
        return 120;
    }

    @Override
    public double golpeGrama3() {
        System.out.println("BULBASAUR USOU GOLPE: *TORNADO DE FOLHAS*");
        return 70;
    }

    public double golpeGrama4() {
        System.out.println("BULBASAUR USOU GOLPE: *CHIBATADA MISTICA*");
        return 70;
    }

    @Override
    public double golpe(int param) {
        double retorno = 1;
        if (param == 1) {
            retorno = golpeGrama1();
        } else if (param == 2) {
            retorno = golpeGrama2();
        } else if (param == 3) {
            retorno = golpeGrama3();
        } else if (param == 4) {
            retorno = golpeGrama4();
        } else {
            retorno = golpeGrama3();
        }
        return retorno;

    }

    @Override
    public double golpe() {
        // TODO Auto-generated method stub
        return 0;
    }

}
