package model;

public class Pais {
	
	private String pais;
	private int oroMasculino;
	private int plataMasculino;
	private int bronceMasculino;
	private int oroFemenino;
	private int plataFemenino;
	private int bronceFemenino;
	private int oroCombinado;
	private int plataCombinado;
	private int bronceCombinado;
	/**
	 * @param pais
	 * @param oroMasculino
	 * @param plataMasculino
	 * @param bronceMasculino
	 * @param oroFemenino
	 * @param plataFemenino
	 * @param bronceFemenino
	 */
	public Pais(String pais, int oroMasculino, int plataMasculino, int bronceMasculino, int oroFemenino,int plataFemenino, int bronceFemenino) {
		this.pais = pais;
		this.oroMasculino = oroMasculino;
		this.plataMasculino = plataMasculino;
		this.bronceMasculino = bronceMasculino;
		this.oroFemenino = oroFemenino;
		this.plataFemenino = plataFemenino;
		this.bronceFemenino = bronceFemenino;
		this.oroCombinado = oroMasculino + oroFemenino;
		this.plataCombinado = plataMasculino + plataFemenino;
		this.bronceCombinado = bronceMasculino + bronceFemenino;

	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the oroMasculino
	 */
	public int getOroMasculino() {
		return oroMasculino;
	}
	/**
	 * @param oroMasculino the oroMasculino to set
	 */
	public void setOroMasculino(int oroMasculino) {
		this.oroMasculino = oroMasculino;
	}
	/**
	 * @return the plataMasculino
	 */
	public int getPlataMasculino() {
		return plataMasculino;
	}
	/**
	 * @param plataMasculino the plataMasculino to set
	 */
	public void setPlataMasculino(int plataMasculino) {
		this.plataMasculino = plataMasculino;
	}
	/**
	 * @return the bronceMasculino
	 */
	public int getBronceMasculino() {
		return bronceMasculino;
	}
	/**
	 * @param bronceMasculino the bronceMasculino to set
	 */
	public void setBronceMasculino(int bronceMasculino) {
		this.bronceMasculino = bronceMasculino;
	}
	/**
	 * @return the oroFemenino
	 */
	public int getOroFemenino() {
		return oroFemenino;
	}
	/**
	 * @param oroFemenino the oroFemenino to set
	 */
	public void setOroFemenino(int oroFemenino) {
		this.oroFemenino = oroFemenino;
	}
	/**
	 * @return the plataFemenino
	 */
	public int getPlataFemenino() {
		return plataFemenino;
	}
	/**
	 * @param plataFemenino the plataFemenino to set
	 */
	public void setPlataFemenino(int plataFemenino) {
		this.plataFemenino = plataFemenino;
	}
	/**
	 * @return the bronceFemenino
	 */
	public int getBronceFemenino() {
		return bronceFemenino;
	}
	/**
	 * @param bronceFemenino the bronceFemenino to set
	 */
	public void setBronceFemenino(int bronceFemenino) {
		this.bronceFemenino = bronceFemenino;
	}

	@Override
	public String toString() {
		
		return pais + " Combinado: "+ oroCombinado +" "+ plataCombinado +" "+ bronceCombinado+"\n";
	}
	public String toString1() {
		
		return pais + "Masculino: "+ oroMasculino +" "+ plataMasculino+" "+ bronceMasculino+"\n";
		
	}
	public String toString2() {
		
		return pais + "Femenino: "+ oroFemenino +" "+ plataFemenino+" "+ bronceFemenino+"\n";
		
	}
	public int compareCountry(Pais other) {
		int result = 0;
		if(this.oroMasculino < other.getOroMasculino() && this.oroFemenino < other.getOroFemenino()) {
			result = -1;
		} else if(this.oroMasculino > other.getOroMasculino() && this.oroFemenino > other.getOroFemenino()) {
			result = 1;
		}
		return result;
		
		//return this.age - other.getAge();
	}
}
