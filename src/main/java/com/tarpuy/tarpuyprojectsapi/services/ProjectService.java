package com.tarpuy.tarpuyprojectsapi.services;

import com.tarpuy.tarpuyprojectsapi.collections.ProjectCollection;
import com.tarpuy.tarpuyprojectsapi.dtos.ProjectReq;
import com.tarpuy.tarpuyprojectsapi.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectCollection> findAll(){
        return projectRepository.findAll();
    }

    public ProjectCollection create(ProjectReq projectReq){
        ProjectCollection projectCollection = new ProjectCollection();
        projectCollection.setTitle(projectReq.title());
        projectCollection.setDescription(projectReq.description());
        projectCollection.setWidth(projectReq.width());
        projectCollection.setCollected(projectReq.collected());
        projectCollection.setGoal(projectReq.goal());
        projectCollection.setUs(projectReq.us());
        projectCollection.setMainImage(projectReq.mainImage());
        return projectRepository.save(projectCollection);
    }

    public Optional<ProjectCollection> findById(String id){
        return projectRepository.findById(id);
    }
}
