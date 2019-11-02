package com.lyz.mongo.explorer.repository;

import com.lyz.mongo.explorer.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Tom on 2018/8/23.
 */
public interface MemberRepository extends MongoRepository<Member, Long> {

    Member findByLoginName(String loginName);

//    @Query("{\"username\":{\"$regex\":?0}, \"age\": ?1}")
//    Page<Member> findByLoginNameAndAge(String name, int age, Pageable page);

//    @Query(value="{\"username\":{\"$regex\":?0},\"age\":{\"$gte\":?1,\"$lte\": ?2}}")
//    Page<Member> findByNameAndAgeRange(String name,int ageFrom,int ageTo,Pageable page);

}
