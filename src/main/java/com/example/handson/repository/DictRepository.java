package com.example.handson.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.handson.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DictRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Dict getKeyById(String keyValue){
        return dynamoDBMapper.load(Dict.class, keyValue);
    }
}
