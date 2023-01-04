package com.mimbers.common.exception;

import com.mimbers.common.status.*;
import lombok.*;

@Data
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final ErrorDescriptor errorDescriptor;
    private Object response;

    @Builder
    public GlobalException(ErrorDescriptor errorDescriptor, Object response) {
        super(errorDescriptor.message());
        {
            this.errorDescriptor = errorDescriptor;
            this.response = response;
        }
    }
}
