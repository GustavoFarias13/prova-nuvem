package com.gustavofarias.provanuvem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anos-escolares")
public class AnoEscolarController {

    private final AnoEscolarService anoEscolarService;

    public AnoEscolarController(AnoEscolarService anoEscolarService) {
        this.anoEscolarService = anoEscolarService;
    }

    @GetMapping
    public List<AnoEscolarDto> listar() {
        return anoEscolarService.listar();
    }

    @GetMapping("/{id}")
    public AnoEscolarDto buscarPorId(@PathVariable Long id) {
        return anoEscolarService.buscarPorId(id);
    }

    @PostMapping
    public AnoEscolarDto criar(@RequestBody AnoEscolarDto dto) {
        return anoEscolarService.criar(dto);
    }

    @PutMapping("/{id}")
    public AnoEscolarDto atualizar(@PathVariable Long id, @RequestBody AnoEscolarDto dto) {
        return anoEscolarService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        anoEscolarService.deletar(id);
    }
}
