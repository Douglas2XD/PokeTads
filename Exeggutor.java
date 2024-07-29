public class Exeggutor extends MeuPokemon implements PokeGrama {
    public Exeggutor(String nome, int nivel, int ataque, int defesa, boolean vivo, int qtdVitorias) {
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
        super.setNome("EXEGGUTOR");
    }

    public String getNome() {
        return super.getNome();
    }

    public void Status() {
        System.out.println("---------------------------EXEGGUTOR---------------------------");
        System.out.println("NOME:                    " + this.nome);
        System.out.println("NIVEL:                   " + this.nivel);
        System.out.println("ATAQUE:                  " + this.ataque);
        System.out.println("DEFESA:                  " + this.defesa);
        System.out.println("VITÓRIAS:                  " + this.qtdVitorias);
        System.out.println("---------------------------ATAQUES---------------------------");
        listarAtaques();
        System.out.println("---------------------------EXEGGUTOR--------------------------- \n\n");
    }

    void listarAtaques() {
        System.out.println("1- SOLAR BEAM");
        System.out.println("2- CHICOTADA");
        System.out.println("3-TORNADO DE FOLHAS");
    }

    @Override
    public double golpeGrama1() {
        System.out.println("EXEGGCUTOR USOU GOLPE: *SOLAR BEAM*");
        return 150;
    }

    @Override
    public double golpeGrama2() {
        System.out.println("EXEGGCUTOR USOU GOLPE: *CHICOTADA*");
        return 120;
    }

    @Override
    public double golpeGrama3() {
        System.out.println("EXEGGCUTOR USOU GOLPE: *TORNADO DE FOLHAS*");
        return 70;
    }

    @Override
    public double golpe() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double golpe(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double golpeGrama4() {
        // TODO Auto-generated method stub
        return 0;
    }

}
