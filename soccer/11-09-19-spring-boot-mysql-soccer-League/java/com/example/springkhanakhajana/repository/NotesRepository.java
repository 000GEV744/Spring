package com.example.springkhanakhajana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springkhanakhajana.model.Notes;
@Repository
public interface NotesRepository extends JpaRepository<Notes,Long> {

}
