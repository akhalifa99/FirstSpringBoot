package com.example.SpringTask.Controllers;

import com.example.SpringTask.Models.Course;
import com.example.SpringTask.Sevices.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/courses")
    public List<Course> getCourses(){
        return courseService.getCoursesData();
    }
    @PostMapping(value = "/course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
}
