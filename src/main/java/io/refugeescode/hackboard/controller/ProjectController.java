package io.refugeescode.hackboard.controller;

import io.refugeescode.hackboard.model.Project;
import io.refugeescode.hackboard.repository.ProjectsRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    private ProjectsRepository projectsRepository;

    public HomeController(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    //Return a list of all projects
    @RequestMapping("/projectsList")
    public List<Project> getProjects(){

        List<Project> projects = projectsRepository.findAll();
        return projects;
    }


    //return the detail data of a project
    @RequestMapping("/projectsList/viewProject/{projectId}")
    public Project viewProject(@RequestBody Long projectId)  {

        Project project = projectsRepository.findOne(projectId);
        return project;
    }


    //Remove a project
    @RequestMapping("/projectsList/viewProject/deleteProject/{projectId}")
    public void deleteProject(@RequestBody Long projectId){

        projectsRepository.delete(projectId);
    }


    //Edit a project
    @RequestMapping("/projectsList/viewProject/editProject/{projectId}")
    public Project editProject(@RequestBody Long projectId) {

        Project project =projectsRepository.findOne(projectId);
        return project;
    }


    //Add a project
    @RequestMapping(value = "/projectsList/addProject", method = RequestMethod.POST)
    public void addProject(@RequestBody Project project) {

        projectsRepository.save(project);
    }

}
