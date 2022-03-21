package gestion.produit.dao;

import java.util.List;

import gestion.produit.domaine.Produit;

public class TestDao {
	public static void main(String[] args) {
		ProduitDaoImpl dao = new ProduitDaoImpl();
		/*
		 * Produit p1 = dao.save(new Produit("HP 789",100,40)); Produit p2 =
		 * dao.save(new Produit("Imprimante Ericson 760",10000,16));
		 * System.out.println(p1.toString()); System.out.println(p2.toString());
		 */
		List<Produit> prods = dao.produitsParMC("%H%");
		for(Produit p:prods) {
			System.out.println(p.toString());
		}
	}
}
