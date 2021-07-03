package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.entity.Timings;

public interface TimingRepo extends JpaRepository<Timings,Serializable>{

}
