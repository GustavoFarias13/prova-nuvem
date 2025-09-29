package com.gustavofarias.provanuvem.controller;

import com.gustavofarias.provanuvem.dto.AlunoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<AlunoDTO> listar() {
        return alunoService.listar();
    }

    @GetMapping("/{id}")
    public AlunoDTO buscarPorId(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }

    @PostMapping
    public AlunoDTO criar(@RequestBody AlunoDTO dto) {
        return alunoService.criar(dto);
    }

    @PutMapping("/{id}")
    public AlunoDTO atualizar(@PathVariable Long id, @RequestBody AlunoDTO dto) {
        return alunoService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}

