package com.mimbers.common.status;

import lombok.*;
import lombok.experimental.*;
import org.springframework.http.*;

public class Error {

	//
	//	COMMON
	//
	@Getter
	@Accessors(fluent = true)
	@RequiredArgsConstructor
	public enum Common implements ErrorDescriptor {
		OK(HttpStatus.OK, "OK", "Success"),
		INVALID_APPLICATION_KEY(HttpStatus.BAD_REQUEST, "CE01", "Invalid Application Key"),
		ACCESS_DENIED(HttpStatus.FORBIDDEN, "CE02", "Access Denied"),
		BIND(HttpStatus.BAD_REQUEST, "CE03", "Invalid Request Error"),
		HTTP_REQUEST_NOT_FOUND_URL(HttpStatus.NOT_FOUND, "CE07", "Not Found URL"),
		NOT_FOUND(HttpStatus.OK, "CE08", "Resource not found"),
		INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "CE09", "Internal Server Error"),
		ALREADY_EXISTS(HttpStatus.CONFLICT, "CE11", "Already exists"),
		;
		private final HttpStatus status;
		private final String code;
		private final String message;
	}
}
