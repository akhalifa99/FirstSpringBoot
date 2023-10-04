package com.example.SpringTask.Sevices;

import com.example.SpringTask.Models.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    List<Course> courses = new ArrayList<>(List.of(new Course("Databases","DB101"),
                            new Course("Computer Science","CS102")
    ));

    public List<Course> getCoursesData(){
        return  courses;
    }
    public void addCourse(Course course){
        courses.add(course);
    }

}
