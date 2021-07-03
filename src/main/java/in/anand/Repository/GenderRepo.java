package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.entity.Gender;

public interface GenderRepo extends JpaRepository<Gender,Serializable> {

}
