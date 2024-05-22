package com.senai.engsoft.thumm.spring.control;

import com.senai.engsoft.thumm.spring.model.ComentarioModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/comments")
public class ComentarioController {

    // Simulação de um repositório de comentários em memória
    private List<ComentarioModel> comments = new ArrayList<>();

    // Endpoint para obter todos os comentários
    @GetMapping
    public List<ComentarioModel> getAllComments() {
        return comments;
    }

    // Endpoint para obter um comentário por ID
    @GetMapping("/{id}")
    public ComentarioModel getCommentById(@PathVariable UUID id) {
        for (ComentarioModel comment : comments) {
            if (comment.getIdComentario().equals(id)) {
                return comment;
            }
        }
        return null; // Ou lançar uma exceção se o comentário não for encontrado
    }

    // Endpoint para criar um novo comentário
    @PostMapping
    public ComentarioModel createComment(@RequestBody ComentarioModel newComment) {
        comments.add(newComment);
        return newComment;
    }

    // Endpoint para atualizar um comentário existente
    @PutMapping("/{id}")
    public ComentarioModel updateComment(@PathVariable UUID id, @RequestBody ComentarioModel updatedComment) {
        for (int i = 0; i < comments.size(); i++) {
            if (comments.get(i).getIdComentario().equals(id)) {
                comments.set(i, updatedComment);
                return updatedComment;
            }
        }
        return null; // Ou lançar uma exceção se o comentário não for encontrado
    }

    // Endpoint para excluir um comentário
    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable UUID id) {
        comments.removeIf(comment -> comment.getIdComentario().equals(id));
    }
}