package com.kelsonthony.springdemomongodb.api.controller;


import com.kelsonthony.springdemomongodb.domain.model.RiceProduction;
import com.kelsonthony.springdemomongodb.domain.service.RiceProductionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rice-production")
public class RiceProductionController {

    private final RiceProductionService riceProductionService;

    public RiceProductionController(RiceProductionService riceProductionService) {
        this.riceProductionService = riceProductionService;
    }

    @GetMapping
    public List<RiceProduction> listRiceproduction() {
        return riceProductionService.listRiceproduction();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<RiceProduction>> findById(@PathVariable String id) {
        return ResponseEntity.ok(riceProductionService.findById(id));
    }

    @GetMapping("/area/{countryName}")
    public ResponseEntity<?> findByArea(@PathVariable final String countryName) {
        return ResponseEntity.ok(riceProductionService.findByArea(countryName));
    }

    @PostMapping
    public ResponseEntity<RiceProduction> create(@RequestBody RiceProduction riceProduction) {
        return ResponseEntity.ok(riceProductionService.create(riceProduction));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable final String id) {
        riceProductionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody RiceProduction riceProduction) {
        return riceProductionService.updateRiceProduction(id, riceProduction);
    }


}