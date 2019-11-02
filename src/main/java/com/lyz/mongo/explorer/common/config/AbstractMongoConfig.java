package com.lyz.mongo.explorer.common.config;

import com.mongodb.MongoClientURI;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author liuyuze
 */
public abstract class AbstractMongoConfig {

    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    protected MongoDbFactory mongoDbFactory(){
        return new SimpleMongoDbFactory(new MongoClientURI(uri));
    }

    public abstract MongoTemplate getMongoTemplate() throws Exception;

}
