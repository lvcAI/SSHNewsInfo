package party.pjc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import party.pjc.dao.BaseDao;
import party.pjc.entity.Topic;
import party.pjc.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Resource
	private BaseDao<Topic> baseDao; 
	
	@Override
	public void saveTopic(Topic topic) {
		baseDao.save(topic);
	}

	@Override
	public void updateTopic(Topic topic) {
		baseDao.update(topic);
	}

	@Override
	public Topic findTopicById(int id) {
		return baseDao.get(Topic.class, id);
	}

	@Override
	public List<Topic> findAllList() {
	
		return baseDao.find("from Topic");
	}

	@Override
	public void deleteTopic(Topic topic) {
		
		baseDao.delete(topic);
	}

}
