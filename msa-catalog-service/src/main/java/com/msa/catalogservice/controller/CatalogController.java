package com.msa.catalogservice.controller;

import com.msa.catalogservice.dto.ResponseCatalog;
import com.msa.catalogservice.jpa.entity.CatalogEntity;
import com.msa.catalogservice.service.CatalogService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class CatalogController {
    Environment env;
    CatalogService catalogService;

    @Autowired
    public CatalogController(Environment env, CatalogService catalogService) {
        this.env = env;
        this.catalogService = catalogService;
    }

    @GetMapping("/health_check")
    public String status() {
        return String.format("It's Working in Catalog Service on PORT %s",
                env.getProperty("local.server.port"));
    }

    @GetMapping("/catalogs")
    public ResponseEntity<List<ResponseCatalog>> getCatalogs() {
        Iterable<CatalogEntity> catalogList = catalogService.getAllCatalogs();

        List<ResponseCatalog> result = new ArrayList<>();
        catalogList.forEach(v -> {
            result.add(new ModelMapper().map(v, ResponseCatalog.class));
        });
        System.out.println("result:"+result);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
