package com.mainuddin.springboot.repository;

import com.mainuddin.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {

}
