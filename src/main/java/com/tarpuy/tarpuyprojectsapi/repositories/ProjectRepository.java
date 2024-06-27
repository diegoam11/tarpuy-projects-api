package com.tarpuy.tarpuyprojectsapi.repositories;

import com.tarpuy.tarpuyprojectsapi.collections.ProjectCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends MongoRepository<ProjectCollection, String> {
    Optional<ProjectCollection> findById(String id);
}
