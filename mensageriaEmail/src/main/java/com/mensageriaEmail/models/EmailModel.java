package com.mensageriaEmail.models;

import com.mensageriaEmail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "EMAIL")//nome da tabela q sera gerado dentro do banco
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;//limitados a 255 caracteres, q é oq o banco aguenta sem especificação
    private String subject;
    @Column(columnDefinition = "TEXT")//consegue inserir mais q 255 caracteres
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
