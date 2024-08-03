package com.kelsonthony.springdemomongodb.domain.repository;

import com.kelsonthony.springdemomongodb.domain.model.RiceProduction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RiceProductionRepository extends MongoRepository<RiceProduction, String> {

    List<RiceProduction> findByArea(final String countryName);
}