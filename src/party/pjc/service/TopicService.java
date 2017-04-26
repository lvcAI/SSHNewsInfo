package party.pjc.service;

import java.util.List;

import party.pjc.entity.Topic;

public interface TopicService {

	public void saveTopic(Topic topic);
	public void updateTopic(Topic topic);
	public void deleteTopic(Topic topic);
	public Topic findTopicById(int id);
	public List<Topic> findAllList();
}
