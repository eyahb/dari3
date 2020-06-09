package tn.esprit.spring.control;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/*@ViewScoped
@ManagedBean(name = "fileUploadManagedBean")
public class FileUploadView {

	private String destination = "/home/documents";

	public void upload(FileUploadEvent event) {
		FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		// Do what you want with the file
		try {
			copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void copyFile(String fileName, InputStream in) {
		try {

			// write the inputStream to a FileOutputStream
			OutputStream out = new FileOutputStream(new File(destination + fileName));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = in.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}

			in.close();
			out.flush();
			out.close();

			System.out.println("New file created!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
/*public class FileUploadView  implements Serializable {

private List<UploadedFile> uploadAttachment = new LinkedList<UploadedFile>();//getters and setters
public void handleFileUpload(FileUploadEvent event) throws IOException {
		String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/WEB-INF/template/" +event.getFile().getFileName());
		File targetFolder = new File(path);
		InputStream inputStream = event.getFile().getInputstream();
		OutputStream out = new FileOutputStream(targetFolder);
		int read = 0;
		byte[] bytes = new byte[1024];

		while ((read = inputStream.read(bytes)) != -1) {
			out.write(bytes, 0, read);
		}
		inputStream.close();
		out.flush();
		out.close();
		uploadAttachment.add(event.getFile());

	}*/
/*
@Scope(value = "session")
@Controller(value = "fileUploadView")
@ELBeanName(value = "fileUploadView")
public class FileUploadView implements Serializable {

	private static final long serialVersionUID = 6191889143079517027L;

	private UploadedFile file;

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void upload() {
		if (file != null) {
			FacesMessage message = new FacesMessage("Successful! ", file.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else
			System.out.println("file is null");
	}

	public void handleFileUpload(FileUploadEvent event) {
		l.info("eyaaaaa" + event.getFile().getFileName());
		FacesMessage msg = new FacesMessage("Successful! ", event.getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void TransferFile(String fileName, InputStream in) {
		try {
			FileOutputStream out = new FileOutputStream(new File(destination + fileName));
			int reader = 0;
			byte[] bytes = new byte[(int) file.getSize()];
			while ((reader = in.read(bytes)) != -1) {
				out.write(bytes, 0, reader);
			}
			in.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}*/
