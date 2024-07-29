import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;


// import java.util.BatalhaTADSmon;
public class Main {

    private HashMap<Integer, Pokemon> pokedex = new HashMap<>(10);

    ArrayList<Double> GolpesPikachu = new ArrayList<>(3);
    ArrayList<Double> GolpesSantos = new ArrayList<>(3);
    ArrayList<Double> GolpesBulbasaur = new ArrayList<>(3);
    ArrayList<Double> GolpesEntei = new ArrayList<>(3);
    ArrayList<Double> GolpesExeggutor = new ArrayList<>(3);
    ArrayList<Double> GolpesGeodude = new ArrayList<>(3);
    ArrayList<Double> GolpesHawlucha = new ArrayList<>(3);
    ArrayList<Double> GolpesMachamp = new ArrayList<>(3);
    ArrayList<Double> GolpesSquirtle = new ArrayList<>(3);
    ArrayList<Double> GolpesVaporeon = new ArrayList<>(3);


    public static void limparConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int lerOpcaoUsuario(int numeroMaximo) throws InterruptedException {
        Scanner entrada;
        int opcao = -1;
        while (true) {
            entrada = new Scanner(System.in);
            try {
                opcao = entrada.nextInt();
                if (opcao >= 0 && opcao <= numeroMaximo) {
                    break;
                } else {
                    mostrarMensagem("Opção invalida, tente novamente!");
                    Imprimenu();
                }
            } catch (Exception e) {
                mostrarMensagem("Opção invalida, tente novamente!");
                Imprimenu();
            }

            entrada = null;
        }
        return opcao;
    }

    public static void mostrarMensagem(String mensagem) throws InterruptedException {
        limparConsole();
        System.out.println(mensagem);
        TimeUnit.SECONDS.sleep(2);
    }

    public void CriarPokemons() {

        MeuPokemon santos = new Santos("SANTOS", 6, 10, 100, true, 0);

        MeuPokemon pikachu = new Pikachu("PIKACHU", 2, 110, 100, true, 0);
        MeuPokemon bulbasaur = new Bulbasaur("BULBASAUR", 2, 110, 100, true, 0);
        MeuPokemon vaporeon = new Vaporeon("VAPOREON", 2, 100, 150, true, 0);

        MeuPokemon geodude = new Geodude("GEODUDE", 3, 90, 80, true, 0);
        MeuPokemon hawlucha = new Hawlucha("HAWLUCHA", 5, 130, 110, true, 0);
        MeuPokemon entei = new Entei("ENTEI", 3, 105, 95, true, 0);

        MeuPokemon machamp = new Machamp("MACHAMP", 8, 160, 140, true, 0);
        MeuPokemon squirtle = new Squirtle("SQUIRTLE", 2, 95, 90, true, 0);
        MeuPokemon exeggutor = new Exeggutor("EXEGGUTOR", 4, 120, 110, true, 0);
        pokedex.put(0, pikachu);
        pokedex.put(1, bulbasaur);
        pokedex.put(2, vaporeon);
        pokedex.put(3, geodude);
        pokedex.put(4, hawlucha);
        pokedex.put(5, entei);
        pokedex.put(6, santos);
        pokedex.put(7, machamp);
        pokedex.put(8, squirtle);
        pokedex.put(9, exeggutor);

    }

    void ListarPokemons() {
        System.out.println("0 - PIKACHU ");
        System.out.println("1 - BULBASAUR ");
        System.out.println("2 - VAPOREON ");
        System.out.println("3 - GEODUDE ");
        System.out.println("4 - HAWLUCHA ");
        System.out.println("5 - ENTEI ");
        System.out.println("6 - SANTOS ");
        System.out.println("7 - MACHAMP ");
        System.out.println("8 - SQUIRTLE ");
        System.out.println("9 - EXEGGCUTOR ");
    }

    void verificaStatus() throws InterruptedException {
        Scanner scannerz = new Scanner(System.in);
        ListarPokemons();
        System.out.print("->  ");
    
        int aleatorio = lerOpcaoUsuario(9);
        limparConsole();
       
        Pokemon pokemonSelecionado = pokedex.get(aleatorio);

        if (pokemonSelecionado instanceof MeuPokemon) {
         
            MeuPokemon meuPokemonSelecionado = (MeuPokemon) pokemonSelecionado;
            meuPokemonSelecionado.Status();
        } else {
            System.out.println("O Pokemon selecionado não é uma instância de MeuPokemon.");
        }
    }

    public void ListarRegras() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-REGRAS-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("!OLA, TREINADOR ! ");
        System.out.println("-ESTAS SÃƒO AS REGRAS DO JOGO: \n");
        System.out.println("-VOCÃŠ INICIA COM 10 POKEMONS, QUE PODEM BATALHAR ENTRE SI; \n");
        System.out.println("-CASO SEU POKEMON MORRA, ELE NÃƒO PODERÃ� LUTAR NOVAMENTE;\n");
        System.out.println(
                "-CASO SEU POKEMON ESTEJA MORTO, NEM TENTE DESLIGAR O PC, FECHAR O JOGO, CHORAR, ELE NÃƒO IRÃ� VOLTAR VIVO;\n");
        System.out.println("-VOCE PODE ESCOLHER APENAS 2 POKEMONS POR VEZ PARA LUTAR;\n");
        System.out.println("-BOA SORTE, E DIVIRTA-SE !\n");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-REGRAS-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public Pokemon escolhePokemon(HashMap<Integer, Pokemon> pokedex) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ESCOLHA OS POKEMONS: ");
        System.out.print("-> ");
        int poke = -1;

        try {
            poke = lerOpcaoUsuario(9);
            if (pokedex.containsKey(poke)) {
                Pokemon nomePokemon = pokedex.get(poke);
                if (!nomePokemon.isVivo()) {
                    System.out.println("Pokémon escolhido não está vivo. Escolha novamente.");
                    return escolhePokemon(pokedex);
                }

                // Verifica se há apenas 1 Pokémon vivo na Pokedex
                if (contarPokemonVivos(pokedex) == 1) {
                    System.out.println("Parabéns! Você escolheu o vencedor!");
                    return nomePokemon;
                }
            } else {
                System.out.println("Pokémon não encontrado na Pokédex. Escolha novamente.");
                return escolhePokemon(pokedex);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida! Insira um número inteiro. Escolha novamente.");
            return escolhePokemon(pokedex);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return escolhePokemon(pokedex);
        }

        return pokedex.get(poke);
    }

    public static int contarPokemonVivos(HashMap<Integer, Pokemon> pokedex) {
        int contador = 0;
        for (Pokemon pokemon : pokedex.values()) {
            if (pokemon.isVivo()) {
                contador++;
            }
        }
        return contador;
    }

    private static void incrementarVitorias(Pokemon pokemon) {
        if (pokemon instanceof MeuPokemon) {
            MeuPokemon meuPokemon = (MeuPokemon) pokemon;
            meuPokemon.qtdVitorias++;
        }
    }

    public void Imprimenu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean truee = true;
        while (truee) {
            System.out.println("************** MENU PRINCIPAL *****************");
            System.out.println("**          1 - VER POKEMONS                 **");
            System.out.println("**          2 - BATALHAR                     **");
            System.out.println("**          3 - REGRAS                       **");
            System.out.println("**          4 - SALVAR PROGRESSO             **");
            System.out.println("**          5 - CARREGAR PROGRESSO           **");
            System.out.println("**          0 - Encerrar programa            **");
            System.out.println("***********************************************");
            System.out.print("->  ");
            int escolha = lerOpcaoUsuario(5);

            

            switch (escolha) {
                case 1:
                    System.out.println("-=-=-=-=-=-=-=-=-=-=MEUS POKEMONS-=-=-=-=-=-=-=-=-=-=");
                    for (Integer key : pokedex.keySet()) {
                        Pokemon pokemon = pokedex.get(key);
                    
                        if (pokemon instanceof MeuPokemon) {
                            MeuPokemon meuPokemon = (MeuPokemon) pokemon;
                    
                            if (meuPokemon.isVivo()) {
                                System.out.println(meuPokemon.getNome() + "    VIVO" + "   QUANTIDADE DE VITÓRIAS: "
                                        + meuPokemon.getQtdVitorias());
                            } else if (!meuPokemon.isVivo() && meuPokemon.getQtdVitorias() == 0) {
                                System.out.println(meuPokemon.getNome() + "    MORTO");
                            } else {
                                System.out.println(meuPokemon.getNome() + "    MORREU MAS ALCANÇOU " + meuPokemon.getQtdVitorias()
                                        + " VITÓRIAS: ");
                            }
                        }
                    }
                    System.out.println("-=-=-=-=-=-=-=-=-=-=MEUS POKEMONS-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println(
                            "VER DETALHES DE ALGUM POKEMON:\n 1 - PARA CONTINUAR\n*APERTE QUALQUER TECLA PARA VOLTAR PARA O MENU*");
                    System.out.print("->  ");

                    int detalhes = lerOpcaoUsuario(1);;
                    if (detalhes == 1) {
                        limparConsole();
                        verificaStatus();
                    } else if (detalhes > 1 || detalhes < 0) {
                        limparConsole();
                    }

                    System.out.println("-=-=-=-=-=-=-=-=-=-=MEUS POKEMONS-=-=-=-=-=-=-=-=-=-=");
                    break;

                case 2:
                    limparConsole();
                    pokedex.forEach((idx, pokemon) -> {
                        if (pokemon.isVivo()) {
                            System.out.println(idx + " " + pokemon.getNome());
                        }
                    });
                    Pokemon pokemonEscolhido = escolhePokemon(pokedex);
                    Pokemon pokemonEscolhido2 = escolhePokemon(pokedex);
                    // System.out.println(pokemonEscolhido);
                    // System.out.println(pokemonEscolhido2);
                    if (pokemonEscolhido == pokemonEscolhido2) {
                        System.out.println("Os pokemons escolhidos são repetidos.");
                        Imprimenu();
                    } else {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=ESCOLHIDOS-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println(
                                "                   " + pokemonEscolhido.getNome() + " vs "
                                        + pokemonEscolhido2.getNome());
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=ESCOLHIDOS-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        Batalha ragnarok = new Batalha();
                        try {
                            System.out.println("VENCEDOR: ");
                            ragnarok.configuraBatalha(pokemonEscolhido, pokemonEscolhido2);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        Pokemon quemSera = ragnarok.batalhar();
                        System.out.println(quemSera.getNome() + " VENCEU");
                        if (pokemonEscolhido == quemSera) {
                            incrementarVitorias(pokemonEscolhido);
                            pokemonEscolhido2.setVivo(false);
                        } else {
                            incrementarVitorias(pokemonEscolhido2);
                            pokemonEscolhido.setVivo(false);
                        }

                        truee = false;
                        break;

                    }
                case 3:
                    ListarRegras();
                    break;
                case 4:
                    SalvarArquivos.escreveObjeto(pokedex,
                            "teste");
                    break;

                case 5:
                    HashMap<Integer, Pokemon> pokedexCarregada = (HashMap<Integer, Pokemon>) SalvarArquivos
                            .lerObjeto("teste");
                    if (pokedexCarregada != null) {
                        pokedex = pokedexCarregada;
                    } else {
                        System.out.println("Erro ao carregar o objeto.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida. Tente novamente.");
                    break;
            }
        }

    }

    public static void main(String[] args) throws Exception {

        boolean continuarJogo = true;
        Main jogo = new Main();

        jogo.CriarPokemons();
        while (continuarJogo) {
            jogo.Imprimenu();

            System.out.println("\nDeseja iniciar uma nova rodada? (1-SIM / 0-NÃƒO): ");
            System.out.print("->  ");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            if (escolha != 1) {
                System.out.println("OBRIGADO POR JOGAR!");
                System.exit(0);
            } 
        }
    }

}
