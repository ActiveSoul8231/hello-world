<%--
  Created by IntelliJ IDEA.
  User: 18460
  Date: 2019/10/14
  Time: 17:47
<!-- jstl JSP标准标签库  -->
		<dependency>
		    <groupId>javax.servlet</groupId>
		    <artifactId>jstl</artifactId>
		    <version>1.2</version>
		</dependency>
		<!-- 返回jsp页面还需要这个依赖 -->
		<dependency>
		    <groupId>org.apache.tomcat.embed</groupId>
		    <artifactId>tomcat-embed-jasper</artifactId>
		    <scope>provided</scope>
		</dependency>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <input type="text" name="userName" placeholder="请输入用户名">
        <input type="password" name="password" placeholder="请输入密码">
        <input type="submit" value="登录">
    </form>
</body>
</html>
    
