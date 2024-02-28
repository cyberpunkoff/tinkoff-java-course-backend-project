package edu.java.model.exception;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import java.util.List;

@Builder
public record ApiErrorResponse(
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String description,
    @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String code,
    @Schema(name = "exceptionName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String exceptionName,
    @Schema(name = "exceptionMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String exceptionMessage,
    @Schema(name = "stacktrace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    List<String> stacktrace
) {
}
