package armas;

import armaduras.Armadura;

public class Arco extends Arma{
	public int daniarArmadura(Armadura armadura) {
		return armadura.recibirDanioArco();
	}
}
