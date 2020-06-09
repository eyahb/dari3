package tn.esprit.spring.control;



import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.servlet.http.Part;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import tn.esprit.spring.entity.Dossier;

import tn.esprit.spring.service.IDossierService;

@Scope(value = "session")
@Controller(value = "LocationJSFController")
@ELBeanName(value = "LocationJSFController")
@Join(path = "/DossierGarantie", to = "/DossierGarantie.jsf")
public class LocationJSFController {
	private Part file;
	private String folder = "./img\\";
	private String cin;
	
	public IDossierService getDS() {
		return DS;
	}

	public void setDS(IDossierService dS) {
		DS = dS;
	}

	@Autowired
	IDossierService DS;
	
	public void addData(){
		//Ajout Localement du fichier
		/*try (InputStream input = file.getInputStream()) {
					String fileName = file.getSubmittedFileName();
			        Files.copy(input, new File(folder, fileName).toPath());
			    }
			    catch (IOException e) {
			        e.printStackTrace();
			    }
		*/
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/uploads/")
		.path(file.getSubmittedFileName()).toUriString();
	   cin = fileDownloadUri;
	  // Dossier D = new Dossier(cin);
		//DS.ajouterDossier(D);
	   DS.ajouterDossier(new Dossier(cin));

	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	
	

}
