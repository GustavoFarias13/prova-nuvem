package com.gustavofarias.provanuvem.dto;

import java.util.List;

public record AnoEscolarDTO(
        Long id,
        String descricao,
        List<Long> materiasIds
) {}
