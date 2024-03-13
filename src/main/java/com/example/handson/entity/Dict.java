package com.example.handson.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "dict_keys")
@JsonPropertyOrder({"keyValue", "keyType", "owner"})
public class Dict {

    @DynamoDBHashKey
    @JsonProperty("keyValue")
    private String key_value;

    @DynamoDBAttribute
    @JsonProperty("keyType")
    private String key_type;

    @DynamoDBAttribute
    private String owner;
}
