package com.besttocode.doc.daos;

import com.besttocode.doc.models.DocModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocDAO extends MongoRepository<DocModel, String> {

    List<DocModel> findAllByUserIdOrderByUpdatedAtDesc(String userId);
}
