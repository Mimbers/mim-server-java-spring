package com.mimbers.common.dto;

import com.fasterxml.jackson.annotation.*;
import com.mimbers.common.status.*;
import com.mimbers.common.status.Error;
import io.swagger.annotations.*;
import lombok.*;

import java.lang.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@JsonPropertyOrder({
        "status",
        "code",
        "message",
        "response",
})
public class ResponseDto<T> {

    public static final ResponseDto<?> OK = ResponseDto.builder()
            .descriptor(com.mimbers.common.status.Error.Common.OK)
            .build();

    @JsonProperty("response")
    private T response;

    @JsonProperty("status")
    private StatusVo status;

    @JsonIgnore
    @Builder.Default
    private ErrorDescriptor descriptor = Error.Common.OK;

    @JsonProperty("status")
    public StatusVo status() {
        return StatusVo.builder()
                .code(descriptor.code())
                .message( descriptor.message())
                .build();
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @ApiModel("StatusVo")
    public static class StatusVo {
        private String code;
        private String message;
    }
}
