package com.saludo.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.saludo.response.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorDetails> HandlesqlException (SQLException exception, WebRequest webRequest){
		
		ErrorDetails errorDetails = new ErrorDetails(null, "900", "El saludo ya existe en la BD");
		return new ResponseEntity <> (errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

}
