package com.example.janpet.repositories;

import com.example.janpet.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    // Consulta para obter todas as mensagens entre dois usuários
    List<Message> findAllBySender_IdAndReceiver_IdOrSender_IdAndReceiver_IdOrderBySentAt(
            Long senderId1, Long receiverId1, Long senderId2, Long receiverId2
    );

    // Você pode adicionar métodos personalizados de consulta aqui, se necessário
}
