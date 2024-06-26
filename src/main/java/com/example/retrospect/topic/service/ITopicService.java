package com.example.retrospect.topic.service;

import com.example.retrospect.topic.dto.TopicDTO;
import com.example.retrospect.topic.entity.TopicEntity;

import java.util.List;

public interface ITopicService {

    List<TopicEntity> getAllTopics();

    void addTopic(TopicDTO topicDto);

    List<TopicEntity> getTopicsByRoomId(String roomId);
}
