package engineTest;

import java.util.ArrayList;

import engine.Alphabet;
import engine.CryptAlgo;
import engine.Key;
import engine.Reflector;
import engine.Rotor;

public class QuickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet abc = new Alphabet();
		/*for (int i=0;i<26;i++){
			System.out.println(abc.getLetter(i));
		}*/

		Reflector ref = new Reflector();
		Rotor rot1 = new Rotor();
		Rotor rot2 = new Rotor();
		Rotor rot3 = new Rotor();
		Key k = new Key(rot2,rot3,rot1);
		k.setSequenceInit(0, -7);
		k.setSequenceInit(1, 1);
		k.setSequenceInit(2, -1);
		k.setSequenceOrientation(0, true);
		k.setSequenceOrientation(1, false);
		k.setSequenceOrientation(2, true);
		ArrayList<Rotor> rotList = new ArrayList<Rotor>();
		rotList.add(0, rot1);
		rotList.add(1, rot2);
		rotList.add(2, rot3);
		
		
		CryptAlgo algo = new CryptAlgo(k, rotList, ref, abc);
		algo.initReflector();
		algo.setInput("Hello World !");
		String s = algo.encrypt();
		System.out.println(s);
		
		algo.setInput("ljcgi pkxps !");
		String x = algo.encrypt();
		System.out.println(x);
		
		String l = "Une fois une lettre est encryptée, un des trois rotors va tourner d’un cran (décalage"
				+ " d’une position des deux lignes du rotor en même temps) avant de commencer"
				+ " l’encryption de la lettre suivante. C’est la valeur de la clé qui détermine le rotor qui doit"
				+ " commencer à tourner en premier et dans quelle direction il le fait, quel serait le"
				+ "deuxième et le troisième rotor à tourner et dans quelles directions.".toLowerCase();
		System.out.println(l);
		
		algo.setInput(l);
		System.out.println(algo.encrypt());
		
		String h = "gqm lmnm otx nfcdan ldo vhfxvjrǵl, "
				+ "em swy doqra krjlhc wj ldhdmox b’ca ktjm "
				+ "(rẃatqkbr w’jmq gyvygoze ulb ptdt gplifm pp "
				+ "wudhm rt xb̂in kjxfu) dlxdp xp aikekayaj "
				+ "m’neibtzrgvs cy vi zjxlyl mfeglxji. s’oly vj "
				+ "hkfsqf on jd upí dps mv́laldomd wj cubld rrq qury agoxjoyup"
				+ " r̀ ukxvjik dr nbmovoo kn rmcy ndrwvf gyihwvkhq za so niua, "
				+ "idxq qsjwwq nhctihwẁhv mz kh uzaapxìuq ojjwb g̀ iffhebq tz ymba"
				+ " rqdvnpt aojbtvpnly.";
		algo.setInput(h);
		System.out.println(algo.encrypt());
	}

}
