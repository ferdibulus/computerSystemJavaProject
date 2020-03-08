
public class Anakart {
	private String model;
	private String uritici;
	private int yuva_sayisi;
	private String isletim_sistemi;
	public Anakart(String model, String uritici, int yuva_sayisi, String isletim_sistemi) {
		this.setModel(model);
		this.setUritici(uritici);
		this.setYuva_sayisi(yuva_sayisi);
		this.setIsletim_sistemi(isletim_sistemi);
	}
	public void isletimSisteiYukle(String isletim_sistemi) {
		this.isletim_sistemi = isletim_sistemi;
		System.out.println("Isletim sistemi yuklendi." + isletim_sistemi);
	}
	private String getModel() {
		return model;
	}
	private void setModel(String model) {
		this.model = model;
	}
	public String getUritici() {
		return uritici;
	}
	public void setUritici(String uritici) {
		this.uritici = uritici;
	}
	public int getYuva_sayisi() {
		return yuva_sayisi;
	}
	public void setYuva_sayisi(int yuva_sayisi) {
		this.yuva_sayisi = yuva_sayisi;
	}
	public String getIsletim_sistemi() {
		return isletim_sistemi;
	}
	public void setIsletim_sistemi(String isletim_sistemi) {
		this.isletim_sistemi = isletim_sistemi;
	}
	
}
