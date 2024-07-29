
import java.util.Random;

public class Batalha {
	public Pokemon p1;
	public Pokemon p2;

	public void configuraBatalha(Pokemon p1, Pokemon p2) throws Exception {
		if(p1 == null || p2 == null) {
			throw new Exception("O(s) pokemon(s) informado(s) e(sao) null");
		}
		if(p1.vivo == false || p2.vivo == false) {
			throw new Exception("Os pokemons informados precisam estar vivos");
		}
		this.p1 = p1;
		this.p2 = p2;
	}

	public Pokemon batalhar() {
		Pokemon vivo = null;
		Random rand = new Random(); 
		int int_random1 = rand.nextInt(10);
		int int_random2 = rand.nextInt(4);
		int_random2++;
		Pokemon primeiro = null;
		Pokemon segundo = null;
		if(int_random1 <= 5) {
			primeiro = this.p1;
			segundo = this.p2;
		}else {
			primeiro = this.p2;
			segundo = this.p1;
		}
		double defesaP1 = primeiro.defesa;
		double defesaP2 = segundo.defesa;
		double ataqueP1 = (((primeiro.nivel*0.9)+(primeiro.ataque*0.5))/2)+(primeiro.golpe(int_random2)*0.5);
		double ataqueP2 = (((segundo.nivel*0.9)+(segundo.ataque*0.5))/2)+(segundo.golpe(int_random2)*0.5);
		
		while(true) {
			defesaP2 = (defesaP2 - ataqueP1);
			if(defesaP2 <= 0) {
				vivo = primeiro;
				break;
			}
			defesaP1 = (defesaP1 - ataqueP2);
			if(defesaP1 <= 0) {
				vivo = segundo;
				break;
			}
		}
		return vivo;
	}

}
