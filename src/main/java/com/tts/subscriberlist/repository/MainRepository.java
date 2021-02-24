package com.tts.subscriberlist.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.subscriberlist.model.Subscriber;

public interface MainRepository extends CrudRepository<Subscriber, Long> {

}
