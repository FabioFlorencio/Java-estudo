package exercicios.lista.aula24;

public class TesteLampada {

	public static void main(String[] args) {

	
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garatiaMeses = 36;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões"; 
		
		
		
		
	}
	
}
