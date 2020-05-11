package com.rauniturlproject.urlminiprojectmaven;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/urls")
public interface UrlRepository extends MongoRepository<Url, String> {
    public Optional<Url> findById(String id);
    public List<Url> findByUrlString(String urlString);
}
