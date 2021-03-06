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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="Vehicule")
public class Vehicule implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int refVeh;
	private String immatricule;
	private long volumeVeh;
	private long poidVeh;
	private String typeVeh;
	@OneToMany(mappedBy="Objet")
	private Collection<Objet> objets;
	@ManyToMany(mappedBy="vehicules")
	private Collection<Mission> missions;
	@ManyToMany
	@JoinTable(name="Veh_Res",
	joinColumns=@JoinColumn(name="refVeh"),
	inverseJoinColumns=@JoinColumn(name="refRes"))
	private Collection<Reservation> reservations;
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicule(String immatricule, long volumeVeh, long poidVeh, String typeVeh) {
		super();
		this.immatricule = immatricule;
		this.volumeVeh = volumeVeh;
		this.poidVeh = poidVeh;
		this.typeVeh = typeVeh;
	}
	
	
	public int getCodeVehicule() {
		return refVeh;
	}
	public void setCodeVehicule(int codeVehicule) {
		this.refVeh = codeVehicule;
	}
	public String getImmatricule() {
		return immatricule;
	}
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	public long getVolumeVeh() {
		return volumeVeh;
	}
	public void setVolumeVeh(long volumeVeh) {
		this.volumeVeh = volumeVeh;
	}
	public long getPoidVeh() {
		return poidVeh;
	}
	public void setPoidVeh(long poidVeh) {
		this.poidVeh = poidVeh;
	}
	public String getTypeVeh() {
		return typeVeh;
	}
	public void setTypeVeh(String typeVeh) {
		this.typeVeh = typeVeh;
	}
	public Collection<Objet> getObjets() {
		return objets;
	}
	public void setObjets(Collection<Objet> objets) {
		this.objets = objets;
	}
	public Collection<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
	public Collection<Mission> getMissions() {
		return missions;
	}
	public void setMissions(Collection<Mission> missions) {
		this.missions = missions;
	}
	
}