package com.github.matsik.booking.controller.request;

import com.github.matsik.booking.config.validation.ValidStartEnd;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@ValidStartEnd
public record CreateBookingRequest(

        @NotNull(message = "Date cannot be null")
        LocalDate date,

        @NotNull(message = "Service Id cannot be null")
        ObjectId serviceId,

        @NotNull(message = "User Id cannot be null")
        ObjectId userId,

        @NotNull(message = "Start cannot be null")
        @Min(value = 0, message = "Start must be 0 or greater")
        Integer start,

        @NotNull(message = "End cannot be null")
        @Min(value = 0, message = "End must be 0 or greater")
        Integer end
) {
}
