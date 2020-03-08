
public class Bilgisayar {
	private Monitor monitor;
	private kasa kasa;
	private Anakart anakart;
	
	public Bilgisayar(Monitor monitor, kasa kasa, Anakart anakart) {
		this.setAnakart(anakart);
		this.setKasa(kasa);
		this.setMonitor(monitor);
		
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public kasa getKasa() {
		return kasa;
	}

	public void setKasa(kasa kasa) {
		this.kasa = kasa;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
}
