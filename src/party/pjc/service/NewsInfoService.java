package party.pjc.service;

import java.util.List;

import party.pjc.entity.NewsInfo;

public interface NewsInfoService {

	public void saveNews(NewsInfo news);
	public void updateNews(NewsInfo news);
	public void deleteNews(NewsInfo news);
	public NewsInfo findNewsById(int id);
	public List<NewsInfo> findAll();
	public List<NewsInfo> findNewsByType(int tid);
	
}
