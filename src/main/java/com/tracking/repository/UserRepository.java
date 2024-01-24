package com.tracking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tracking.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

//	@PersistenceContext
//	EntityManager entityManager;

	@Query("select u from Users u ORDER BY u.lastConnectLogin desc")
	List<Users> findByDate();
	
	Optional<Users> findById(Long id);


//	Users findByUserId(Long long1);

//	@Query("select u from Users u where punch between ")
//	Object findByDates(Users user,Date startDate ,Date endDate);

//	public default List<UserDto> getDataFromTables() {
//	    String jpqlQuery = "SELECT new com.tracking.dto.UserDto(e1.duration, e1.punchIn, e1.userId, " +
//	                       "e1.punch, e1.punchOut, e2.idleTimer, e2.idleTimerLogout) " +
//	                       "FROM punch e1 " +
//	                       "JOIN idlelogger e2 ON e1.someJoinColumn = e2.someJoinColumn";
//
//	    TypedQuery<UserDto> query = entityManager.createQuery(jpqlQuery, UserDto.class);
//	    return query.getResultList();
//	}

}
