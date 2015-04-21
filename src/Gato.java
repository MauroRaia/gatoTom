import java.util.ArrayList;
import java.util.List;


public class Gato {

	Double energia = 6.0 ;
	Double velocidad = (5/energia/10) ;
	Double ratonesComidos = 0.0 ;
	List<String> misRatones = new ArrayList<String>();
	
	public void comerRaton (Raton raton) {
		
		this.energia = this.energia + (raton.peso +12);
		this.ratonesComidos = this.ratonesComidos + 1;
		this.misRatones.add(raton.nombre);
		
	}
	
	// Devuelve la energia del gato
	public Double devolverEnergiaComer(Raton raton){
		
		return this.energia = (this.energia) + ((raton.peso) + 12);
		
	}
	
	public void correr(Double metros) {
		
		this.energia = this.energia - 0.5 * metros;
		
	}
	
	public Double devolverEnergiaCorrer(Double metros){
		
		return this.energia = this.energia - (0.5 * metros);
	}
	
	public Boolean meConvieneComerA_queEstaA (Raton raton){
		
		return this.devolverEnergiaCorrer(raton.metros) < this.devolverEnergiaComer(raton);
		
	}
	
	public void nombreRatones (Gato gato){
		
		
		
	}

	public List<String> devolverNombreRatonesComidos (Gato gato){ 

		return this.misRatones;
		
	}
		
}
