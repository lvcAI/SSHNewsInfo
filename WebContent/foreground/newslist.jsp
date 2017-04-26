<%@page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  



			<div class="list-group">
			 
			 
			 	<c:forEach items="${newsList}" var="news">			
					<a href="${pageContext.request.contextPath}/news_findBynid?nid=${news.getNid() }" class="list-group-item">${news.getNtitle() } <span style="float: right;">${fn:substring(news.getNcreatedate(),0,10) }</span> </a> 
				</c:forEach>
			 
			</div>
		