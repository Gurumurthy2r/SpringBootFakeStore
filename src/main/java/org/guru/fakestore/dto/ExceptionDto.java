package org.guru.fakestore.dto;

public class ExceptionDto {
    private String message;
    private String details;

    public ExceptionDto(String message, String details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
