package com.example.SpringTask.Components;

import com.example.SpringTask.Models.Course;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class StaticCourseComponent {
  /*  public Course returnStaticCourse(){
        return new Course("ML","ML101");
    }*/
    @Getter
    @Setter
    private static Course aliceCourse;
    @Getter
    @Setter
    private static Course bobCourse;

    @Autowired
    public StaticCourseComponent(@Qualifier("alice") Course aliceCourse, @Qualifier("bob") Course bobCourse) {
        StaticCourseComponent.aliceCourse = aliceCourse;
        StaticCourseComponent.bobCourse = bobCourse;
    }


}
