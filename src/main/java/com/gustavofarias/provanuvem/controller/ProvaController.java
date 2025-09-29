package com.gustavofarias.provanuvem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provas")
public class ProvaController {

    private final ProvaService provaService;

    public ProvaController(ProvaService provaService) {
        this.provaService = provaService;
    }

    @GetMapping
    public List<ProvaDto> listar() {
        return provaService.listar();
    }

    @GetMapping("/{id}")
    public ProvaDto buscarPorId(@PathVariable Long id) {
        return provaService.buscarPorId(id);
    }

    @PostMapping
    public ProvaDto criar(@RequestBody ProvaDto dto) {
        return provaService.criar(dto);
    }

    @PutMapping("/{id}")
    public ProvaDto atualizar(@PathVariable Long id, @RequestBody ProvaDto dto) {
        return provaService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        provaService.deletar(id);
    }
}
