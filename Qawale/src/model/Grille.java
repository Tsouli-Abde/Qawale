package model;

public class Grille {
	
	private Pile[][] grille;
	
	public Grille() {
		grille = new Pile[4][4];
		initialiser();
	}
	
	private void initialiser() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				grille[i][j] = new Pile();
			}
		}
		grille[0][0].ajouterGalet(Galet.Jaune);
		grille[0][0].ajouterGalet(Galet.Jaune);
		grille[0][3].ajouterGalet(Galet.Jaune);
		grille[0][3].ajouterGalet(Galet.Jaune);
		grille[3][0].ajouterGalet(Galet.Jaune);
		grille[3][0].ajouterGalet(Galet.Jaune);
		grille[3][3].ajouterGalet(Galet.Jaune);
		grille[3][3].ajouterGalet(Galet.Jaune);
	}

	public Pile[][] getGrille() {
		return grille;
	}

	public void setGrille(Pile[][] grille) {
		this.grille = grille;
	}
	
	public Pile getPileAt(int lig , int col) {
		return grille[lig][col];
	}
	
	public void viderPile(int lig, int col) {
		grille[lig][col].vider();
	}
	
	public void deposerGalet(Galet galet, int lig, int col) {
		grille[lig][col].ajouterGalet(galet);
	}
	
	public boolean testLignes() {
		for(int ligne =0 ;ligne<4; ligne++) {
			if( grille[ligne][0].galerOnTop() == grille[ligne][1].galerOnTop() && grille[ligne][1].galerOnTop()==grille[ligne][2].galerOnTop() && grille[ligne][2].galerOnTop()==grille[ligne][3].galerOnTop() ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean testColonnes() {
		for(int colonne =0 ;colonne<4; colonne++) {
			if( grille[0][colonne].galerOnTop() == grille[1][colonne].galerOnTop() && grille[1][colonne].galerOnTop()==grille[2][colonne].galerOnTop() && grille[2][colonne].galerOnTop()==grille[3][colonne].galerOnTop() ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean testDiagonale() {
		if( grille[0][0].galerOnTop()==grille[1][1].galerOnTop() && grille[1][1].galerOnTop()==grille[2][2].galerOnTop() && grille[2][2].galerOnTop()==grille[3][3].galerOnTop() ) {
			return true;
		}
		if( grille[0][3].galerOnTop()==grille[1][2].galerOnTop() && grille[1][2].galerOnTop()==grille[2][1].galerOnTop() && grille[2][1].galerOnTop()==grille[3][0].galerOnTop() ) {
			return true;
		}
		return false;
	}
	
	
}
