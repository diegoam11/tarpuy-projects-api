package com.tarpuy.tarpuyprojectsapi.controllers;

import com.tarpuy.tarpuyprojectsapi.collections.ProjectCollection;
import com.tarpuy.tarpuyprojectsapi.dtos.ProjectReq;
import com.tarpuy.tarpuyprojectsapi.services.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/create")
    public ProjectCollection create(@RequestBody ProjectReq projectReq){
        return projectService.create(projectReq);
    }

    @GetMapping("/findAll")
    public List<ProjectCollection> findAll(){
        return projectService.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<ProjectCollection> findById(@PathVariable String id){
        if(projectService.findById(id).isPresent()){
            return ResponseEntity.ok(projectService.findById(id).get());
        }
        return ResponseEntity.notFound().build();
    }
}
