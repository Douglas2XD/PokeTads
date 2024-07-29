public class Entei extends MeuPokemon implements PokeFogo {

    public Entei(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
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
        super.setNome("ENTEI");
    }

    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------ENTEI---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------ENTEI--------------------------- \n\n");
    }

    void listarAtaques() {
        System.out.println("1- LABAREDA");
        System.out.println("2- NENEM");
        System.out.println("3-BAFO DE PIMENTA");
    }

    @Override
    public double golpeFogo1() {
        System.out.println("ENTEI USOU GOLPE:*LABAREDA*");
        return 225;
    }

    @Override
    public double golpeFogo2() {
        System.out.println("ENTEI USOU GOLPE: *CHAMA NENÉM*");
        return 350;
    }

    @Override
    public double golpeFogo3() {
        System.out.println("ENTEI USOU GOLPE: *BAFO DE PIMENTA*");
        return 210;
    }

    @Override
    public double golpeFogo4() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double golpe() {
        System.out.println("ENTEI USOU GOLPE: *REIGAN*");
        return 280.8;
    }

    @Override
    public double golpe(int param) {
        double retorno = 1;
        if (param == 1) {
            retorno = golpeFogo1();
        } else if (param == 2) {
            retorno = golpeFogo2();
        } else if (param == 3) {
            retorno = golpeFogo3();
        } else if (param == 4) {
            retorno = golpeFogo4();
        } else {
            retorno = golpeFogo3();
        }
        return retorno;

    }

}
