public class Vaporeon extends MeuPokemon implements PokeAgua {

    public Vaporeon(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
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
        super.setNome("VAPOREON");
    }

    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------VAPOREON---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------VAPOREON--------------------------- \n\n");

    }

    void listarAtaques() {
        System.out.println("1- JATO DAGUA");
        System.out.println("2- BOLHAS");
        System.out.println("3-CUSPE");
    }

    @Override
    public double golpeAgua1() {
        System.out.println("VAPOREON USOU GOLPE: *JATO DAGUA*");
        return 115;
    }

    @Override
    public double golpeAgua2() {
        System.out.println("VAPOREON USOU GOLPE: *BOLHAS*");
        return 125;
    }

    @Override
    public double golpeAgua3() {
        System.out.println("VAPOREON USOU GOLPE: *CUSPE*");
        return 25;
    }

    public double golpeAgua4() {
        System.out.println("SANTOS USOU GOLPE: *BABADA*");
        return 20;
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
            retorno = golpeAgua1();
        } else if (param == 2) {
            retorno = golpeAgua2();
        } else if (param == 3) {
            retorno = golpeAgua3();
        } else if (param == 4) {
            retorno = golpeAgua4();
        } else {
            retorno = golpeAgua4();
        }
        return retorno;

    }
}
