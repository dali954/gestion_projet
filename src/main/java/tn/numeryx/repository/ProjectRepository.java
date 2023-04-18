package tn.numeryx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.numeryx.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
