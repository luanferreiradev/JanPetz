package com.example.janpet.repositories;

import com.example.janpet.models.CompatibilityResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompatibilityRepository extends JpaRepository<CompatibilityResult, Long> {

    // Você pode adicionar métodos personalizados de consulta aqui, se necessário
}
