package com.tolbargy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tolbargy.model.TipoSangre;

@Repository
public interface ITipoSangreRepository extends JpaRepository<TipoSangre, Integer>{

}
