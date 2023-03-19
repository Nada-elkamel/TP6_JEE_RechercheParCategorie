package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

public class ProduitModele {
	
	private String motCle;
	private Long id;
	
	List<Produit> produits = new ArrayList<>();
	public String getMotCle() {
	return motCle;
	}
	public void setMotCle(String motCle) {
	this.motCle = motCle;
	}
	public List<Produit> getProduits() {
	return produits;
	}
	public void setProduits(List<Produit> produits) {
	this.produits = produits;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
