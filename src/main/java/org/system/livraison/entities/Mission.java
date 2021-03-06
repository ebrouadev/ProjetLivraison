package org.system.livraison.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="Mission")
public class Mission implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refMiss;
	private String typeMiss;
	private String descriptMiss;
	@ManyToMany
	@JoinTable(name="Miss_Equi",
	joinColumns=@JoinColumn(name="refMiss"),
	inverseJoinColumns=@JoinColumn(name="refEqui"))
	private Collection<Equipe>equipes; 
	@ManyToMany
	@JoinTable(name="Miss_Veh",
	joinColumns=@JoinColumn(name="refMiss"),
	inverseJoinColumns=@JoinColumn(name="refVeh"))
	private Collection<Vehicule> vehicules;
	@ManyToMany(mappedBy="missions")
	private Collection<Commande> commandes;
	
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mission(String typeMiss, String descriptMiss, Collection<Equipe> equipes, Collection<Vehicule> vehicules,
			Collection<Commande> commandes) {
		super();
		this.typeMiss = typeMiss;
		this.descriptMiss = descriptMiss;
		this.equipes = equipes;
		this.vehicules = vehicules;
		this.commandes = commandes;
	}
	public long getRefMiss() {
		return refMiss;
	}
	public void setRefMiss(long refMiss) {
		this.refMiss = refMiss;
	}
	public String getTypeMiss() {
		return typeMiss;
	}
	public void setTypeMiss(String typeMiss) {
		this.typeMiss = typeMiss;
	}
	public String getDescriptMiss() {
		return descriptMiss;
	}
	public void setDescriptMiss(String descriptMiss) {
		this.descriptMiss = descriptMiss;
	}
	public Collection<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	

	

}
