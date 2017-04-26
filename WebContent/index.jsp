<%@page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>新闻首页</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
<script src="${pageContext.request.contextPath}/bootstrap/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>

</head>
<body  >

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default navbar-fixed-top indexnav" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> 
					 <span class="sr-only">Toggle navigation</span><span class="icon-bar">
					 </span><span class="icon-bar"></span><span class="icon-bar"></span></button>
					  <a class="navbar-brand" href="#">i'Lvc News </a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="${pageContext.request.contextPath}/hello">首页</a>
						</li>
						
						</ul>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="搜索新闻" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#">登录/注销</a>
						</li>
						<li >
							 <a href="#">关于我</a>
						
						</li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
</div>
<div style="height: 60px;width: 100%;"></div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-3 column">
			<div class="list-group">
			  <a href="${pageContext.request.contextPath}/news_findByntid?ntid=1" class="list-group-item list-group-item-success active ">
			   国内新闻
			  </a>
			 
			 	<c:forEach items="${guonei}" var="news">			
					<a href="${pageContext.request.contextPath}/news_findBynid?nid=${news.getNid() }" class="list-group-item"title="${news.getNtitle() }"> ${fn:substring(news.getNtitle(),0,15) }</a>
				</c:forEach>
			 
			</div>
			<div class="list-group">
			  <a href="${pageContext.request.contextPath}/news_findByntid?ntid=2" class="list-group-item  list-group-item-danger active">
			   国际新闻
			  </a>
			 
			 	<c:forEach items="${guoji}" var="news">			
					<a href="${pageContext.request.contextPath}/news_findBynid?nid=${news.getNid() }" class="list-group-item"title="${news.getNtitle() }"> ${fn:substring(news.getNtitle(),0,15) }</a>
				</c:forEach>
			 
			</div>
			<div class="list-group">
			  <a href="${pageContext.request.contextPath}/news_findByntid?ntid=5" class="list-group-item active">
			   娱乐新闻
			  </a>
			 
			 	<c:forEach items="${yule}" var="news">			
					<a href="${pageContext.request.contextPath}/news_findBynid?nid=${news.getNid() }" class="list-group-item" title="${news.getNtitle() }"> ${fn:substring(news.getNtitle(),0,15) }</a>
				</c:forEach>
			 
			</div>
		</div>
		<div class="col-md-6 column">
				<div class="panel panel-success ">
				<div class="panel-heading">
					<h3 class="panel-title">
						<c:forEach items="${topicList}" var="topic">
							
							<a href="${pageContext.request.contextPath}/news_findByntid?ntid=${topic.getTid()}"><span style="line-height: 20px;font-size: 16px; "> ${topic.getTname()} </span></a>
						</c:forEach>
					</h3>
				</div>	
				
			</div>
			<div class="list-group">
			 
			 
			 <jsp:include page="${mainpage }"></jsp:include>
			 
			</div>
			
		</div>
		<div class="col-md-3 column">
			<div class="panel panel-success ">
				<div class="panel-heading">
					<h3 class="panel-title">
						图说新闻
					</h3>
					
				</div>	
				
			</div>
		</div>
	</div>
</div>
</body>
</html>