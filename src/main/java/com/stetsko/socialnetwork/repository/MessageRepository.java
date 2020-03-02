package com.stetsko.socialnetwork.repository;

import com.stetsko.socialnetwork.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag (String tag);
}
