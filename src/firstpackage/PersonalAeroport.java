package firstpackage;

public class PersonalAeroport extends Utilizator{
	private PlataFizic plata;
	
	public PersonalAeroport(float pretBilet, String nume, String prenume, String email, String telefon,
			Integer varsta) {
		super(pretBilet, nume, prenume, email, telefon, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculPret(LocDorit[] locuriDorite, Cursa cursa, Boolean dusIntors) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void cautaCurse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efectuarePlata() {
		// TODO Auto-generated method stub
		
	}
	
}
