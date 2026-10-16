package com.mensageriaEmail.dtos;

import jakarta.persistence.Column;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class EmailDTO {

    @NotBlank
    private String ownerRef;
    @NotBlank
    private String emailFrom;
    @NotBlank
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
