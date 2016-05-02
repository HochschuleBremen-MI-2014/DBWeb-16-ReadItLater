<%--
  Created by IntelliJ IDEA.
  User: Torben
  Date: 04.04.2016
  Time: 08:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ente.ArticleManager" %>
<%@ page import="ente.Article" %>
<html>
  <head>
    <title>L8R</title>
  </head>
  <body>
  <h1 style="text-align:center;">L8R</h1>
  <%
      Article dumdum= new Article();
      dumdum.setRead(true);
      dumdum.setUrl("bla");
      out.println(dumdum.getUrl());
  %>
  </body>
</html>
