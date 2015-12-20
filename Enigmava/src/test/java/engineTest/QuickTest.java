package engineTest;

import java.util.ArrayList;

import engine.Alphabet;
import engine.CryptAlgo;
import engine.Key;
import engine.Reflector;
import engine.Rotor;
import gui.GUI;

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
		GUI interfaceGraphique = new GUI();
		for(int i=0; i<26;i++) {
			interfaceGraphique.getTableReflector().setValueAt(ref.getNum(i), 0, i);
			interfaceGraphique.getTableRotor3().setValueAt(rot3.getUpperLaneValue(i), 0, i);
			interfaceGraphique.getTableRotor3().setValueAt(rot3.getLowerLaneValue(i), 1, i);
			interfaceGraphique.getTableRotor2().setValueAt(rot2.getUpperLaneValue(i), 0, i);
			interfaceGraphique.getTableRotor2().setValueAt(rot2.getLowerLaneValue(i), 1, i);
			interfaceGraphique.getTableRotor1().setValueAt(rot1.getUpperLaneValue(i), 0, i);
			interfaceGraphique.getTableRotor1().setValueAt(rot1.getLowerLaneValue(i), 1, i);
			interfaceGraphique.getTableAlphabet().setValueAt(abc.getLetter(i), 0, i);
		}
		interfaceGraphique.setVisible(true);
		/*for(int i = 0; i<chaine.length();i++) {
			algo.nextStep();
			System.out.println(algo.getOutput());

		}*/

		
		//System.out.println(s);
		
		//algo.setInput("ljcgi pkxps !");
		/*String x = algo.encrypt();
		System.out.println(x);
		
		String l = "Une fois une lettre est encryptÃ©e, un des trois rotors va tourner dâ€™un cran (dÃ©calage"
				+ " dâ€™une position des deux lignes du rotor en mÃªme temps) avant de commencer"
				+ " lâ€™encryption de la lettre suivante. Câ€™est la valeur de la clÃ© qui dÃ©termine le rotor qui doit"
				+ " commencer Ã  tourner en premier et dans quelle direction il le fait, quel serait le"
				+ "deuxiÃ¨me et le troisiÃ¨me rotor Ã  tourner et dans quelles directions.".toLowerCase();
		System.out.println(l);
		
		algo.setInput(l);
		System.out.println(algo.encrypt());
		
		String h = "gqm lmnm otx nfcdan ldo vhfxvjrgÌ�l, "
				+ "em swy doqra krjlhc wj ldhdmox bâ€™ca ktjm "
				+ "(rwÌ�atqkbr wâ€™jmq gyvygoze ulb ptdt gplifm pp "
				+ "wudhm rt xbÌ‚in kjxfu) dlxdp xp aikekayaj "
				+ "mâ€™neibtzrgvs cy vi zjxlyl mfeglxji. sâ€™oly vj "
				+ "hkfsqf on jd upiÌ� dps mvÌ�laldomd wj cubld rrq qury agoxjoyup"
				+ " rÌ€ ukxvjik dr nbmovoo kn rmcy ndrwvf gyihwvkhq za so niua, "
				+ "idxq qsjwwq nhctihwwÌ€hv mz kh uzaapxiÌ€uq ojjwb gÌ€ iffhebq tz ymba"
				+ " rqdvnpt aojbtvpnly.";
		algo.setInput(h);
		System.out.println(algo.encrypt());*/
	}

}
