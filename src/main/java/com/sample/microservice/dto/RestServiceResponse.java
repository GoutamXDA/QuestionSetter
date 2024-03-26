package com.sample.microservice.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestServiceResponse {
	private boolean error;
	private Integer code;
	private String errorMessage;
	private String message;
	private List<Object> data;
	private List<String> errorList;
	
	public RestServiceResponse() {
	}
	
	public RestServiceResponse(boolean error, Integer code, String message) {
		this.error = error;
		this.code = code;
		this.message = message;
	}
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	public List<String> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}
}
