//package com.webapp.WaggingTales.repository;
//
//import com.webapp.WaggingTales.entity.RegisterEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public interface RegisterRepository extends JpaRepository<RegisterEntity, String>{
////    List<RegisterEntity> findByFirstName(String first_name);
////    List<RegisterEntity> findByLastName(String last_name);
////    List<RegisterEntity> findByUserEmail(String user_email);
//
//}
//
//package com.webapp.WaggingTales.repository;
//
//        import com.webapp.WaggingTales.entity.RegisterEntity;
//
//        import org.springframework.data.jpa.repository.JpaRepository;
//        import org.springframework.data.repository.CrudRepository;
//        import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RegisterRepository extends JpaRepository<RegisterEntity, String> {
//
//}
//last code
//
//package com.webapp.WaggingTales.repository;
//
//        import com.fasterxml.jackson.databind.JsonNode;
//        import com.webapp.WaggingTales.entity.RegisterEntity;
//        import org.springframework.data.jpa.repository.Query;
//        import org.springframework.data.repository.CrudRepository;
//        import org.springframework.data.repository.query.Param;
//        import org.springframework.stereotype.Repository;
//
//        import java.util.List;
//
//
//
//        @Repository
//        public interface RegisterRepository extends CrudRepository<RegisterEntity, String> {
//                @Query("SELECT r FROM RegisterEntity r WHERE r.firstName = :firstName")
//                List<JsonNode> findByfirstName(@Param("firstName") String firstName);
//
//                @Query("SELECT r FROM RegisterEntity r WHERE r.lastName = :lastName")
//                List<JsonNode> findBylastName(@Param("lastName") String lastName);
//
//                @Query("SELECT r FROM RegisterEntity r WHERE r.userEmail = :userEmail")
//                List<JsonNode> findByuserEmail(@Param("userEmail") String userEmail);
//        }
//
//


package com.webapp.WaggingTales.repository;

import com.webapp.WaggingTales.bean.RegisterBean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegisterRepository extends JpaRepository<RegisterBean, String> {
    void deleteById(String useremail);
}