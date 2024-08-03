package com.kelsonthony.springdemomongodb.domain.service;

import com.kelsonthony.springdemomongodb.domain.model.RiceProduction;
import com.kelsonthony.springdemomongodb.domain.repository.RiceProductionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RiceProductionService {

    private final RiceProductionRepository riceProductionRepository;

    public RiceProductionService(RiceProductionRepository riceProductionRepository) {
        this.riceProductionRepository = riceProductionRepository;
    }

    public List<RiceProduction> listRiceproduction() {
        return riceProductionRepository.findAll();
    }

    public Optional<RiceProduction> findById(String id) {
        return riceProductionRepository.findById(id);
    }

    public List<RiceProduction>  findByArea(String countryName) {
        return riceProductionRepository.findByArea(countryName);
    }

    public RiceProduction create(RiceProduction riceProduction) {
        return riceProductionRepository.save(riceProduction);
    }

    public void deleteById(String id) {
        riceProductionRepository.deleteById(id);
    }


    public ResponseEntity<?> updateRiceProduction(String id, RiceProduction riceProduction) {
        var response = riceProductionRepository.findById(id);
        if(response.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        var responseUpdated = update(id, riceProduction);
        return ResponseEntity.ok(riceProductionRepository.save(responseUpdated));
    }

    private static RiceProduction update(String id, RiceProduction riceProductionData) {
        final RiceProduction riceProductionDataUpdated =  new RiceProduction();
        riceProductionDataUpdated.setId(id);
        riceProductionDataUpdated.setArea(riceProductionData.getArea() == null? null : riceProductionData.getArea());
        riceProductionDataUpdated.setFlag(riceProductionData.getFlag() == null? null : riceProductionData.getFlag());
        riceProductionDataUpdated.setYear(riceProductionData.getYear() == null? null : riceProductionData.getYear());
        riceProductionDataUpdated.setUnit(riceProductionData.getUnit() == null? null : riceProductionData.getUnit());
        riceProductionDataUpdated.setValue(riceProductionData.getValue() == null? null : riceProductionData.getValue());
        riceProductionDataUpdated.setFlagDescription(riceProductionData.getFlagDescription() == null? null : riceProductionData.getFlagDescription());
        return riceProductionDataUpdated;
    }

}
