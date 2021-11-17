package com.example.moviecatalogservice.resources;

import com.example.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(String userId) {
        return Collections.singletonList(
                new CatalogItem("Transformers", "Transformers desc", 4)
        );
    }
}
