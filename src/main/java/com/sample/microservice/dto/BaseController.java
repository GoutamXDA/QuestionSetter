package com.sample.microservice.dto;

import java.util.List;

public class BaseController {

	protected RestServiceResponse getSuccessResponse(final String message, final List<Object> data) {
		final RestServiceResponse restServiceResponse = new RestServiceResponse(false, 200, message);
		restServiceResponse.setData(data);
		return restServiceResponse;
	}

	protected RestServiceResponse getSuccessResponse(final List<Object> data) {
		return getSuccessResponse(null, data);
	}

	protected RestServiceResponse getSuccessResponse(final String message) {
		return getSuccessResponse(message, null);
	}
}
