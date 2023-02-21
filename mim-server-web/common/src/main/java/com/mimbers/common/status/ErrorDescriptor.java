package com.mimbers.common.status;

import org.springframework.http.*;

public interface ErrorDescriptor {

	/**
	 * HTTP status
	 *
	 * @return http status
	 */
	default HttpStatus status() {
		return HttpStatus.OK;
	}

	/**
	 * Error code
	 *
	 * @return error code
	 */
	default String code() {
		return null;
	}

	/**
	 * Error message
	 *
	 * @return error message
	 */
	default String message() {
		return null;
	}
}
