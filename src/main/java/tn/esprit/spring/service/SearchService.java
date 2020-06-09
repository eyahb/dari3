package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Annonce2;
import tn.esprit.spring.repository.SearchRepository;

@Service
public class SearchService implements ISearchService {
	
	@Autowired
	SearchRepository srp;
	public static final Logger L = LogManager.getLogger(ISearchService.class);
	

	@Override
	public List<Annonce2> getAllAnnonces() {
		return (List<Annonce2>) srp.findAll();

	}

}
