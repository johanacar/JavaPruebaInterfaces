
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Servivo unH = new Humano();
		unH.setEdad(14);
		
		Servivo unP = new Perro();
		unP.setEdad(7);
	
		
		
		
		IComportamientosServivo unServivo = (IComportamientosServivo) unP;
		IComportamientosServivo otroServivo = (IComportamientosServivo) unH;
		
		
	System.out.println(unP.getEdad());
	System.out.println(unH.getEdad());
	
	unServivo.cumplirAnios();
	otroServivo.cumplirAnios();
	
	System.out.println(unP.getEdad());
	System.out.println(unH.getEdad());
		
	}

}
