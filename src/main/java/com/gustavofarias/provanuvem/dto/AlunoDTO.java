package com.gustavofarias.provanuvem.dto;

public record AlunoDTO(
        Long id,
        String nome,
        String email,
        String matricula,
        Long anoEscolarId
) {}
