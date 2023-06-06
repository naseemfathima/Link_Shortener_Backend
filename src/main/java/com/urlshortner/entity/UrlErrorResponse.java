package com.urlshortner.entity;

public class UrlErrorResponse {
	
	 	private String status;
	    private String error;
	    
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}
		public UrlErrorResponse() {
			super();
		}
		public UrlErrorResponse(String status, String error) {
			super();
			this.status = status;
			this.error = error;
		}
	    
	    

}
