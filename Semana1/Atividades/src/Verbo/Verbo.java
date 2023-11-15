package Verbo;

public class Verbo {
	private String radical, sufixo;
					
	public Verbo(String _radical, String _sufixo) {
		super();
		this.radical = _radical;
		this.sufixo = _sufixo;
	}


	public String getRadical() {
		return radical;
	}


	public void setRadical(String radical) {
		this.radical = radical;
	}


	public String getSufixo() {
		return sufixo;
	}


	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}


	public void conjugar() {
		System.out.println("Eu "+radical+"o");
		System.out.println("Tu "+radical+"as");
		System.out.println("Ele "+radical+"a");
		System.out.println("Nós "+radical+"omos");
		System.out.println("Vóis "+radical+"is");
		System.out.println("Eles "+radical+"am");
	}
}
