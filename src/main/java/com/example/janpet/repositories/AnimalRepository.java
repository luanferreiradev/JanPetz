package com.example.janpet.repositories;

import com.example.janpet.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    // Você pode adicionar métodos personalizados de consulta aqui, se necessário
}

