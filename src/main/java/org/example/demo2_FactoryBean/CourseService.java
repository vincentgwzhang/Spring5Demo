package org.example.demo2_FactoryBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Data
public class CourseService {

    private Course course;

    @Autowired
    public CourseService (@Qualifier("courseFactoryBean") Course course) {
        this.course = course;
    }

}
