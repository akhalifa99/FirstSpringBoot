package com.example.SpringTask.Sevices;

import com.example.SpringTask.Components.StaticCourseComponent;
import com.example.SpringTask.Models.Course;
import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class CourseService {
    private StaticCourseComponent staticCourseComponent;



    List<Course> courses = new ArrayList<>(List.of(new Course("Databases","DB101"),
                            new Course("Computer Science","CS102")
    ));

    public List<Course> getCoursesData(){
        return  courses;
    }
    public void addCourse(Course course){
        courses.add(course);
    }
   /* @Data
    public static class AliceCourseService {
        private final Course aliceCourse;

        public AliceCourseService(@Value("${course.courseName}") String courseName,
                                  @Value("${course.courseCode}") String courseCode) {
            this.aliceCourse = new Course(courseName, courseCode);
        }


    }
    @Data
    public static class BobCourseService {
        private final Course bobCourse;


        public BobCourseService(@Value("${course.courseName}") String courseName,
                              @Value("${course.courseCode}") String courseCode) {
            this.bobCourse = new Course(courseName, courseCode);
        }


    }*/

}

