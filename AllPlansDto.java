package hng_java_boilerplate.plans.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import hng_java_boilerplate.plans.entity.Plan;

import java.util.List;

public record AllPlansDto(
        List<Plan> data,
        @JsonProperty("status_code")
        int statusCode,
        String message
) {
}

