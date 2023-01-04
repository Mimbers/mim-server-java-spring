package com.mimbers.common.exception;

import com.mimbers.common.status.*;
import lombok.*;

@Getter
public class CustomException extends RuntimeException {

	private final ErrorDescriptor errorDescriptor;

	@Builder
	public CustomException(ErrorDescriptor errorDescriptor) {
		super(errorDescriptor.message());
		{
			this.errorDescriptor = errorDescriptor;
		}
	}
}
