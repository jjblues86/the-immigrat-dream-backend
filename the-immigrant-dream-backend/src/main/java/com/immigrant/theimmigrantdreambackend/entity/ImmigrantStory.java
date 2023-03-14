package com.immigrant.theimmigrantdreambackend.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "ImmmigrantStory")
public class ImmigrantStory {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    private String firstName;
    private String lastName;
    private String hobby;
    private String origin;
    private String profession;
    private String story;
    private String quote;
}
