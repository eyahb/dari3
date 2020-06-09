package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Annonce2;

public interface ISearchService {
	
	
	//List<Annonce> getAnnonceBy(String adresse,String type,float price,String intSurface,String extSurface,int NumberRooms);
	public List<Annonce2> getAllAnnonces();
}
