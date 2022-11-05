package com.guitar.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.app.model.GuitarEntity;

@Repository
public interface GuitarRepository  extends JpaRepository<GuitarEntity, Integer>{

}
