package com.example.Dop_MailOperations.bagOperations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BagRepository extends JpaRepository<BagDetails, String> {

}
