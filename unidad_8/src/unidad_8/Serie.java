package unidad_8;

public class Serie {
	Integer TEMPORADAS_DEFECTO=3;
	Boolean ENTREGADO_DEFAULT= false;
	
	String titulo;
	Integer n_temporadas;
	Boolean entregado;
	String creador;
	
	
	public Serie(){
		this.titulo = "";
		this.n_temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFAULT;
		this.creador = "";
	}
	public Serie(String titulo,String creador){
		this.titulo = titulo;
		this.n_temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFAULT;
		this.creador = creador;
	}
	public Serie(String titulo,String creador, Integer n_temporadas){
		this.titulo = titulo;
		this.n_temporadas = n_temporadas;
		this.entregado = ENTREGADO_DEFAULT;
		this.creador = creador;
	}
	
	

}
