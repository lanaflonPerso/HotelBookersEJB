package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Photos
 *
 */
@Entity

public class Photos implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long nom;
	private String url;
	@ManyToOne
	private Chambre chambre;
	
	 
	
	public Long getId() {
		return id;
	}


	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}



	public Long getNom() {
		return nom;
	}



	public void setNom(Long nom) {
		this.nom = nom;
	}



	public Chambre getChambre() {
		return chambre;
	}



	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}


	
	public Photos(Long nom, String url, Chambre chambre) {
		super();
		this.nom= nom;
		this.url = url;
		this.chambre = chambre;
	}


	public Photos() {
		super();
	}
   
}