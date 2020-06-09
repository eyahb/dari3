package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Annonce2  implements Serializable {
	private static final long serialVersionUID = -1396669830860400871L;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column 
	private String adresse;
	@Column 
	private String type;
	@Column 
	private Float price;
	@Column 
	private String intSurface;
	@Column 
	private String extSurface;
	@Column 
	private int numberRooms;
	
	
	
	public Long getId() {
		return id;
	}
	public Annonce2(String adresse, String type, Float price, String intSurface, String extSurface, int numberRooms) {
		
		this.adresse = adresse;
		this.type = type;
		this.price = price;
		this.intSurface = intSurface;
		this.extSurface = extSurface;
		this.numberRooms = numberRooms;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getIntSurface() {
		return intSurface;
	}
	public void setIntSurface(String intSurface) {
		this.intSurface = intSurface;
	}
	public String getExtSurface() {
		return extSurface;
	}
	public void setExtSurface(String extSurface) {
		this.extSurface = extSurface;
	}
	public int getNumberRooms() {
		return numberRooms;
	}
	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Annonce2(Long id, String adresse, String type, Float price, String intSurface, String extSurface,
			int numberRooms) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.type = type;
		this.price = price;
		this.intSurface = intSurface;
		this.extSurface = extSurface;
		this.numberRooms = numberRooms;
	}
	public Annonce2() {
		
	}
	@Override
	public String toString() {
		return "Annonce2 [id=" + id + ", adresse=" + adresse + ", type=" + type + ", price=" + price + ", intSurface="
				+ intSurface + ", extSurface=" + extSurface + ", numberRooms=" + numberRooms + "]";
	}

}
