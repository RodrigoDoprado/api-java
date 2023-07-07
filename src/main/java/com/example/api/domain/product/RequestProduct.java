package com.example.api.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
        String id,
        @NotBlank
        String title,
        String image,
        @NotNull
        Integer price
) { }
