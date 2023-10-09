package com.example.SpringTask.Configs;

import com.example.SpringTask.Components.StaticCourseComponent;
import com.example.SpringTask.Models.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseServiceConfig {
    @Value("${alice.courseName}")
    private String aliceCourseName;

    @Value("${alice.courseCode}")
    private String aliceCourseCode;

    @Value("${bob.courseName}")
    private String bobCourseName;

    @Value("${bob.courseCode}")
    private String bobCourseCode;

    @Bean("alice")
    public Course aliceCourse() {
        Course aliceCourse = new Course(aliceCourseName, aliceCourseCode);
        StaticCourseComponent.setAliceCourse(aliceCourse);
        return aliceCourse;
    }

    @Bean("bob")
    public Course bobCourse() {
        Course bobCourse = new Course(bobCourseName, bobCourseCode);
        StaticCourseComponent.setBobCourse(bobCourse);
        return bobCourse;
    }

}
