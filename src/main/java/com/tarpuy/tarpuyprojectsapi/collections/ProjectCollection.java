package com.tarpuy.tarpuyprojectsapi.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectCollection {
    @Id
    private String id;
    private String title;
    private String description;
    private Double width;
    private Double collected;
    private Double goal;
    private String us;
    private String mainImage;
}
