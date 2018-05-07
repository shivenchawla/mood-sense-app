package moodSense;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import moodSense.HappyUser;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface HappyUserRepository extends CrudRepository<HappyUser, Long> {
  @Query(value = "select count(*) from happy_user where name='name'", nativeQuery=true)
  public Integer countById(@Param("name") String name);

  @Query(value = "select * from happy_user where name='name'", nativeQuery=true)
  public List<HappyUser> findById(@Param("name") String name);
}
