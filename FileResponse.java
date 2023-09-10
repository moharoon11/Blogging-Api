package dev.haroon.blog.payload;

import org.springframework.http.HttpStatus;


import lombok.*;


@Getter
@Setter
@ToString
public class FileResponse {
	
	private String fileName;
	
	private String message;
	
	private HttpStatus status;
	
	public FileResponse() {
		
	}
	
	public FileResponse(String fileName, String message) {
		this.fileName = fileName;
		this.message = message;
	}

}
