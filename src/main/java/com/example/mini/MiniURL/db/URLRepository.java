package com.example.mini.MiniURL.db;

import com.example.mini.MiniURL.models.ShortURL;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface URLRepository extends MongoRepository<ShortURL, String> {
    public ShortURL findShort(String requestURL);
}
