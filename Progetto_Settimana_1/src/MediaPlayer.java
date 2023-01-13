public abstract class MediaPlayer {
	
	private String titolo;
	private int durata;
	public int isImage;
	
	public int getDurata() {
		return durata;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public MediaPlayer(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}
	public MediaPlayer(String titolo) {
		this.titolo = titolo;
	}
	
	public void play() {
		
	}
	
	public void show() {
		
	}
}
