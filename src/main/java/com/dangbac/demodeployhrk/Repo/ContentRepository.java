package com.dangbac.demodeployhrk.Repo;

import com.dangbac.demodeployhrk.Entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
}
