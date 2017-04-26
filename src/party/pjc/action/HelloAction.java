package party.pjc.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import party.pjc.entity.NewsInfo;
import party.pjc.entity.Topic;
import party.pjc.service.NewsInfoService;
import party.pjc.service.TopicService;

@Controller
public class HelloAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private TopicService topicService;
	@Autowired
	private NewsInfoService newsInfoService;
	private List<Topic> topicList;
	private List<NewsInfo> guonei;
	private List<NewsInfo> guoji;
	private List<NewsInfo> yule;
	private List<NewsInfo> newsList;
	
	public List<NewsInfo> getNewsList() {
		return newsList;
	}


	public void setNewsList(List<NewsInfo> newsList) {
		this.newsList = newsList;
	}


	public List<Topic> getTopicList() {
		return topicList;
	}


	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}


	public List<NewsInfo> getGuonei() {
		return guonei;
	}


	public void setGuonei(List<NewsInfo> guonei) {
		this.guonei = guonei;
	}


	public List<NewsInfo> getGuoji() {
		return guoji;
	}


	public void setGuoji(List<NewsInfo> guoji) {
		this.guoji = guoji;
	}


	public List<NewsInfo> getYule() {
		return yule;
	}


	public void setYule(List<NewsInfo> yule) {
		this.yule = yule;
	}


	@Override
	public String execute() throws Exception {
		
		topicList=topicService.findAllList();
		yule=newsInfoService.findNewsByType(5);
		guoji=newsInfoService.findNewsByType(2);
		guonei=newsInfoService.findNewsByType(1);
		newsList=newsInfoService.findAll();
		ActionContext context = ActionContext.getContext();
		context.getSession().put("guonei", guonei);
		context.getSession().put("guoji", guoji);
		context.getSession().put("yule", yule);
		context.getSession().put("newsList", newsList);
		context.getSession().put("topicList", topicList);
		context.getSession().put("mainpage", "/foreground/newslist.jsp");
		return SUCCESS;
	}

	
}
