package us.codingjobs.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import us.codingjobs.app.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
	
	@Query("select p from PostEntity p where p.email=:email and p.position=:position and p.zipCode=:zipCode")
	public PostEntity checkExistingPost(@Param("email") String email,
			@Param("position") String position,@Param("zipCode") String zipCode);
}
