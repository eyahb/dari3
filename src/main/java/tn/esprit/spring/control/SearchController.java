package tn.esprit.spring.control;

import java.util.List;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entity.Annonce2;
import tn.esprit.spring.service.ISearchService;

@Scope(value = "session") 
@Controller(value = "searchController") 
@ELBeanName(value = "searchController") 
public class SearchController {
	
	
	@Autowired
	private ISearchService isr;
	
	private String title;

	private String adresse;

	private String type;
	
	private Float price;
	
	private String description;


	private String intSurface;

	private String extSurface;
	
	private int numberRooms;
	private List<Annonce2> annonces;
	
	
	
	public ISearchService getIsr() {
		return isr;
	}




	public void setIsr(ISearchService isr) {
		this.isr = isr;
	}




	public List<Annonce2> getAnnonces() {
		return annonces;
	}




	public void setAnnonces(List<Annonce2> annonces) {
		this.annonces = annonces;
	}




	/*public List<Annonce> afficheAnoonceBy(@PathVariable String adresse,@PathVariable String type,@PathVariable float price,@PathVariable String intSurface,@PathVariable String extSurface,@PathVariable int NumberRooms)
	{
		
			annonces=	isr.getAnnonceBy(adresse, type, price,intSurface,extSurface,NumberRooms);
		return annonces;
	}*/
	public List<Annonce2> retrieveAnnonce() {
		annonces =isr.getAllAnnonces();
		return annonces;
	}
	public void displayAnnonce(Annonce2 empl) {
		this.setAdresse(empl.getAdresse());
		this.setType(empl.getType());
	    this.setExtSurface(empl.getExtSurface());
		this.setIntSurface(empl.getIntSurface());
		this.setNumberRooms(empl.getNumberRooms());
		this.setPrice(empl.getPrice());}

	


	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
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




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
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

}
