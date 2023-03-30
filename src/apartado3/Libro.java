package apartado3;

public class Libro {
	private int ISBN;
	private String Titulo;
	private int numPaginas;
	private String tematica;

	public Libro(int iSBN, String titulo, int numPaginas, String tematica) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		this.numPaginas = numPaginas;
		this.tematica = tematica;
	}

}
