<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../common/common.jsp"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
<div class="container">
	<h3>メンバー登録画面</h3>
	<div class="span8">
		<div class="row">
		<form:form modelAttribute="memberForm" action="${pageContext.request.contextPath}/member/create">

			<table class="table table-striped">
			
			  <tr>
			  <form:errors path="name" cssStyle="color:red" element="div"/>
			   <th>氏名  </th>
			    <td>
			    	<form:input path="name"  placeholder="Name"/>
			    </td>
			  </tr>
			  
			  <tr>
			  <form:errors path="mailAddress" cssStyle="color:red" element="div"/>
			    <th>メールアドレス </th>
			    <td>
			    	<form:input path="mailAddress" placeholder="Email"/>
			    </td>
			  </tr>
			  
			  <tr>
			  <form:errors path="password" cssStyle="color:red" element="div"/>
			    <th> パスワード</th>
			    <td>
			    	<form:password path="password" placeholder="Password"/>
			    </td>
			  </tr>
			  
			  <tr>
		  		<th> パスワード確認</th>   
			    <td>
			   		<form:password path="checkPassword" placeholder="password"/> 	
			     </td>
			  </tr>
			  	
			  <tr>	
			    <td>
					<br><input class="btn" type="submit" value="登録">
			    </td>
			  </tr>
			</table>
		  </form:form>
		</div>
	</div>
</div>
</body>
</html>