package com.lyz.mongo.explorer.repository;

import com.lyz.mongo.explorer.entity.ShortUrl;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShortUrlRepository extends MongoRepository<ShortUrl,String> {

//    ShortUrl findBySurl(String surl);

}
