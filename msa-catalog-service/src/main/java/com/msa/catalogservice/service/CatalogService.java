package com.msa.catalogservice.service;

import com.msa.catalogservice.jpa.entity.CatalogEntity;
import com.msa.catalogservice.jpa.repository.CatalogRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CatalogService {
    CatalogRepository catalogRepository;
    Environment env;

    public Iterable<CatalogEntity> getAllCatalogs(){
        return catalogRepository.findAll();
    }
}
