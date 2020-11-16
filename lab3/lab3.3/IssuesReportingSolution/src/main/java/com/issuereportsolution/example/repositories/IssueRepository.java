package com.issuereportsolution.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.issuereportsolution.example.entities.IssueReport;

import java.util.List;

public interface IssueRepository extends JpaRepository<IssueReport, Long>{
    @Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false")
    List<IssueReport> findAllButPrivate();
    List<IssueReport> findAllByEmail(String email);

}