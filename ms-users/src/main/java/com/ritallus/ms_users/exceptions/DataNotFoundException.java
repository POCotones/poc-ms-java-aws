package com.ritallus.ms_users.exceptions;

import com.ritallus.ms_users.utils.MessageResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataNotFoundException extends RuntimeException {

    private String description;

    public DataNotFoundException(String message, String description) {
        super(message);
        this.description = description;
    }

    public DataNotFoundException(MessageResponse message) {
        super(message.getMessage());
        this.description = message.getDescription();
    }

    public DataNotFoundException(String message, Exception exception) {
        super(message, exception);
    }
}
