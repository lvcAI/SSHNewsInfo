<%@page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

	<div>
		<h2>
				${newsById.getNtitle() }
		</h2>
		<h5><span>作者:${newsById. getNauthor() } </span> <span style="float: right;">发布时间:${newsById.getNcreatedate() }</span>  </h5>
		<p>
			${newsById.getNcontent() }
		</p>
	</div>
	<hr/>
	<h4>评论</h4>
	<hr/>
			<div class="media">
				 <a href="#" class="pull-left"><img src="img/default8.jpg" class="media-object" alt='' /></a>
				<div class="media-body">
					<h4 class="media-heading">
						张三  &nbsp; &nbsp; &nbsp; &nbsp;<%=new Date() %>
					</h4>你特么才夜袭寡妇村！！！
					<div class="media">
						 <a href="#" class="pull-left"><img src="img/default8.jpg" class="media-object" alt='' /></a>
						<div class="media-body">
							<h5 class="media-heading">
								李四 &nbsp; &nbsp; &nbsp; &nbsp;<%=new Date() %>
							</h5>小子，做了还不敢承认！龟孙@王五
						</div>
					</div>
				</div>
			</div>
		