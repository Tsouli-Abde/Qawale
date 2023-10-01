package model;

import java.util.ArrayList;
import java.util.List;

public class Pile {
	
	private List<Galet> galets;
	
	public Pile() {
		galets = new ArrayList<Galet>();
	}

	public List<Galet> getGalets() {
		return galets;
	}

	public void setGalets(List<Galet> galets) {
		this.galets = galets;
	}
	
	public void ajouterGalet(Galet galet) {
		this.galets.add(galet);
	}
	
	public Galet supprimerGaler() {
		if( this.galets == null ) {
			return null;
		}
		Galet galet = this.galets.get(0);
		this.galets.remove(0);
		return galet;
	}
	
	public int size() {
		return this.galets.size();
	}
	
	public boolean isEmpty() {
		return (this.galets.size()==0);
	}
	
	public void vider() {
		this.galets.clear();
	}
	
	public Galet galerOnTop() {
		return this.galets.get( this.galets.size()-1 );
	}

}
