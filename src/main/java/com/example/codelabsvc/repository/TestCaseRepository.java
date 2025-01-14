package com.example.codelabsvc.repository;

import com.example.codelabsvc.entity.TestCase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestCaseRepository extends MongoRepository<TestCase, String> {
    TestCase findByName(String name);

    @Query("{'_id' : { $in : ?0 } }")
    List<TestCase> findTestCasesByTestCaseIds(List<String> testCaseIds);
}
