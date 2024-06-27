package com.tarpuy.tarpuyprojectsapi.dtos;

public record ProjectReq(
        String title,
        String description,
        Double width,
        Double collected,
        Double goal,
        String us,
        String mainImage
) {
}
