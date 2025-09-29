package com.gustavofarias.provanuvem.dto;

import java.time.LocalDate;
import java.util.List;

public record ProvaDTO(
        Long id,
        String descricao,
        LocalDate data,
        Long materiaId,
        List<Long> alunosIds
) {}
