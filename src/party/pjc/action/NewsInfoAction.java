package party.pjc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import party.pjc.service.NewsInfoService;

@Controller
public class NewsInfoAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private NewsInfoService newsInfoService;

	private String nid;
	private String ntid;

	public String getNtid() {
		return ntid;
	}

	public void setNtid(String ntid) {
		this.ntid = ntid;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}
	
	public String findBynid(){
		
		ActionContext context = ActionContext.getContext();
		if(nid!=""|| nid!=null){
			
			context.getSession().put("newsById", newsInfoService.findNewsById(Integer.parseInt(nid)));
			context.getSession().put("mainpage", "/foreground/newscontent.jsp");
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String findByntid(){
		ActionContext context = ActionContext.getContext();
		if(ntid!=""|| ntid!=null){
			
			context.getSession().put("newsList", newsInfoService.findNewsByType(Integer.parseInt(ntid)));
			context.getSession().put("mainpage", "/foreground/newslist.jsp");
			return SUCCESS;
		}
		return ERROR;
	}

}
