package moodSense;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import moodSense.SadUser;

// This will be AUTO IMPLEMENTED by Spring into a Bean called SadUserRepository
// CRUD refers Create, Read, Update, Delete

public interface SadUserRepository extends CrudRepository<SadUser, Long> {
  @Query(value = "select count(*) from sad_user where name='name'", nativeQuery=true)
  public Integer countById(@Param("name") String name);

  @Query(value = "select * from sad_user where name='name'", nativeQuery=true)
  public List<HappyUser> findById(@Param("name") String name);
}
