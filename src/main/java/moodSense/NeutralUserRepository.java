package moodSense;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import moodSense.NeutralUser;

// This will be AUTO IMPLEMENTED by Spring into a Bean called NeutralUserRepository
// CRUD refers Create, Read, Update, Delete

public interface NeutralUserRepository extends CrudRepository<NeutralUser, Long> {
  @Query(value = "select count(*) from neutral_user where name='name'", nativeQuery=true)
  public Integer countById(@Param("name") String name);

  @Query(value = "select * from neutral_user where name='name'", nativeQuery=true)
  public List<HappyUser> findById(@Param("name") String name);
}
