package com.practice.Weather.domain.repository;

import com.practice.Weather.domain.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LocationRepository extends JpaRepository<Location, Long>, JpaSpecificationExecutor<Location> {

}
