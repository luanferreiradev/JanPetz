package com.example.janpet.controllers;

import com.example.adoption.models.Message;
import com.example.adoption.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    // Enviar uma nova mensagem
    @PostMapping
    public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
        Message newMessage = messageService.sendMessage(message);
        return ResponseEntity.ok(newMessage);
    }

    // Obter todas as mensagens entre dois usuários
    @GetMapping("/{userId1}/{userId2}")
    public ResponseEntity<List<Message>> getMessagesBetweenUsers(
            @PathVariable Long userId1,
            @PathVariable Long userId2
    ) {
        List<Message> messages = messageService.getMessagesBetweenUsers(userId1, userId2);
        return ResponseEntity.ok(messages);
    }

    // Outras operações relacionadas a mensagens podem ser adicionadas conforme necessário
}
