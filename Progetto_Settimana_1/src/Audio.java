public class Audio extends MediaPlayer implements Volume{
	
	int volume;
	
	//COSTRUTTORE 
	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata);
		this.volume = volume;
		// TODO Auto-generated constructor stub
	}

	//GETTER
	@Override
	public int getVolume() {
		if(volume < 0) {
			this.volume = 0;
			System.out.println("Errore il volume non può essere minore di 0");
		}
		return volume;
	}

	@Override
	public int alzaVolume() {
		return ++volume;
	}

	@Override
	public int abbassaVolume() {
		return --volume;
	}

	@Override
	public void play() {
		if (getDurata() > 0) {
			for (int i = 1; i <= this.getDurata(); i++) {
				System.out.printf(" Titolo: " + getTitolo() + ", Minuti: " + i);
				System.out.printf(" Volume: ");
				for (int j = 0; j < this.getVolume(); j++) {
					System.out.printf("!");
				}
				System.out.println();
			}
		}else
		System.out.println("ERRORE LA DURATA E' MINORE DI 0");
	}


}
