package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.entity.course;

public interface CourseRepo extends JpaRepository<course,Serializable>{

}
