package com.gustavofarias.provanuvem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping
    public List<MateriaDto> listar() {
        return materiaService.listar();
    }

    @GetMapping("/{id}")
    public MateriaDto buscarPorId(@PathVariable Long id) {
        return materiaService.buscarPorId(id);
    }

    @PostMapping
    public MateriaDto criar(@RequestBody MateriaDto dto) {
        return materiaService.criar(dto);
    }

    @PutMapping("/{id}")
    public MateriaDto atualizar(@PathVariable Long id, @RequestBody MateriaDto dto) {
        return materiaService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        materiaService.deletar(id);
    }
}

