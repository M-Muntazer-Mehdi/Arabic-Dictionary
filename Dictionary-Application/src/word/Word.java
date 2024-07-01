package word;

public class Word {

	private String meaning;
	private String mashkool;
	private String sinf;
	private String asal;
	private String jins;
	private String adad;
	private String ghairMashkool;
	private String ghairAsal;
	private String jarh;
	private String rakam;
	private String id;
		
	public Word(String meaning, String mashkool, String sinf, String asal, String jins, String adad,
			String ghairMashkool, String ghairAsal, String jarh, String rakam, String id) {
		this.meaning = meaning;
		this.mashkool = mashkool;
		this.sinf = sinf;
		this.asal = asal;
		this.jins = jins;
		this.adad = adad;
		this.ghairMashkool = ghairMashkool;
		this.ghairAsal = ghairAsal;
		this.jarh = jarh;
		this.rakam = rakam;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getMashkool() {
		return mashkool;
	}
	public void setMashkool(String mashkool) {
		this.mashkool = mashkool;
	}
	public String getSinf() {
		return sinf;
	}
	public void setSinf(String sinf) {
		this.sinf = sinf;
	}
	public String getAsal() {
		return asal;
	}
	public void setAsal(String asal) {
		this.asal = asal;
	}
	public String getJins() {
		return jins;
	}
	public void setJins(String jins) {
		this.jins = jins;
	}
	public String getAdad() {
		return adad;
	}
	public void setAdad(String adad) {
		this.adad = adad;
	}
	public String getGhairMashkool() {
		return ghairMashkool;
	}
	public void setGhairMashkool(String ghairMashkool) {
		this.ghairMashkool = ghairMashkool;
	}
	public String getGhairAsal() {
		return ghairAsal;
	}
	public void setGhairAsal(String ghairAsal) {
		this.ghairAsal = ghairAsal;
	}
	public String getJarh() {
		return jarh;
	}
	public void setJarh(String jarh) {
		this.jarh = jarh;
	}
	public String getRakam() {
		return rakam;
	}
	public void setRakam(String rakm) {
		this.rakam = rakm;
	}

}
