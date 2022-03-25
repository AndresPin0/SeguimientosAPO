package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clasificaciones {
	
    ArrayList<Pais> paises;
    
    public Clasificaciones() {
    	
    	paises = new ArrayList<Pais>();
    }
    
    public void addPais(String pais, int oroMasculino, int plataMasculino, int bronceMasculino, int oroFemenino,int plataFemenino, int bronceFemenino) {
    	
    	paises.add(new Pais(pais, oroMasculino, plataMasculino, bronceMasculino, oroFemenino, plataFemenino, bronceFemenino));
    	

    }
    
	public void sotCount() {
		
		int n = paises.size();
		boolean inversion = true;
		for(int i = 0; i < n && inversion;i++) {
			inversion = false;
			for(int j = 1; j < n - i;j++)
			if(paises.get(j).compareCountry(paises.get(j-1))< 0) {
				Pais temp = paises.get(j);
				paises.set(j, paises.get(j -1));
				paises.set(j-1, temp);
				inversion = true;
			}
		}
	}

	public String getList() {
		
		String s = "";
		
		for(Pais p: paises) {
			s += p.toString();
			
		}
		
		return s;
	}
	public String getList1() {
		
		String s = "";
		
		for(Pais p: paises) {
			s += p.toString1();
		}
		
		return s;
	}
	public String getList2() {
		
		String s = "";
		
		for(Pais p: paises) {
			s += p.toString2();
		}
		
		return s;
	}
}