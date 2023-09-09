package com.example.janpet.controllers;

import com.example.adoption.models.CompatibilityResult;
import com.example.adoption.services.CompatibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compatibility")
public class CompatibilityController {

    private final CompatibilityService compatibilityService;

    @Autowired
    public CompatibilityController(CompatibilityService compatibilityService) {
        this.compatibilityService = compatibilityService;
    }

    // Realizar teste de compatibilidade entre o perfil do adotante e o animal
    @PostMapping
    public ResponseEntity<CompatibilityResult> testCompatibility(
            @RequestParam Long adopterUserId,
            @RequestParam Long animalId
    ) {
        CompatibilityResult result = compatibilityService.testCompatibility(adopterUserId, animalId);
        return ResponseEntity.ok(result);
    }

    // Outras operações relacionadas à compatibilidade podem ser adicionadas conforme necessário
}
