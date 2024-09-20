package com.vagner.Picpay.controllers;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vagner.Picpay.exceptions.PicPayException;

@RestControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(PicPayException.class)
	public ProblemDetail handlePicPayException(PicPayException e) {
		return e.toProblemDetail();
	}
	
	
}
