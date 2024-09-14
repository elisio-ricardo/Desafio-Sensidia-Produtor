package com.elisio.sensidia.DesafioSensidia.domain.entities;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class User {

    @NotNull(message = "O campo userId não pode ser null")
    private String userId;

    @NotNull(message = "O email userId não pode ser null")
    private String email;
}
