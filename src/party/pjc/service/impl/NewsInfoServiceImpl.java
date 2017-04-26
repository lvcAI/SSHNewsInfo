package party.pjc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import party.pjc.dao.BaseDao;
import party.pjc.entity.NewsInfo;
import party.pjc.service.NewsInfoService;

@Service
public class NewsInfoServiceImpl implements NewsInfoService {

	@Autowired
	private BaseDao<NewsInfo> baseDao;
	
	@Override
	public void saveNews(NewsInfo news) {
		baseDao.save(news);
	}

	@Override
	public void updateNews(NewsInfo news) {
		// TODO Auto-generated method stub
		baseDao.update(news);
	}

	@Override
	public void deleteNews(NewsInfo news) {
		// TODO Auto-generated method stub
		baseDao.delete(news);
	}

	@Override
	public NewsInfo findNewsById(int id) {
		// TODO Auto-generated method stub
		return baseDao.get(NewsInfo.class, id);
	}

	@Override
	public List<NewsInfo> findAll() {
		// TODO Auto-generated method stub
		return baseDao.find("from NewsInfo");
	}


	@Override
	public List<NewsInfo> findNewsByType(int tid) {
		// TODO Auto-generated method stub
		return baseDao.find("from NewsInfo n where n.ntid=?",new Object[]{tid});
	}

}
