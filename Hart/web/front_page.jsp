<%-- 
    Document   : front_page
    Created on : Jan 21, 2009
    Author     : Barber Ransom
--%>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="usefuljavas.SessionState" %>
<%@ page session="true" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
	SessionState ss = new SessionState();
	ss = (SessionState)session.getAttribute("Session");
        
	if (ss == null)
	{
%>
            <jsp:forward page = 'GetSessionState' />
<%
	}
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front Page</title>
        <link href="hill_stylesheet.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript"><%= ss.html.getPopUpScript() %></script>
    </head>
    
    <body bgcolor="#<%= ss.html.bgcolor %>"> <!-- e7eddf (green), f5f3ea (cream) background="images/minoo5.jpg"-->

<% 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

    ss.html.setSrcPage("front_page.jsp", ss);
    ss.setLang();
%>

    <!-- Begin Main Table --> 
	<%= ss.html.begMainTable() %>
    <!-- Top Banner --> 
	<%= ss.html.banner() %>
    <!-- Logged Out Navigation -->
	<%= ss.html.sampNav() %>
    <!-- Start Top Body Content -->
	<%= ss.html.mainBodyTopRow() %>
        
	<%= ss.html.begTable() %>
	
                <tr>
                    <td class="section_header">
                        <%= ss.html.getSampPage(0) %>
                    </td>
                </tr>
                
	<%= ss.html.endTable() %>        
        
    <%= ss.html.endRow() %>
    <!-- End Body Top Content --> 
  
    <!-- Start Main Body Content -->
	<%= ss.html.mainBodyRow() %>        
        
        <!-- Section Header -->
        <table width="650" border="0" cellpadding="0" align="center" >
          <tr> 
            <td>
              <p class="section_header_center"><%= ss.exp.getExp64A() %></p>
            </td>
          </tr>
          <tr> 
            <td>
              <p class="study_word_sentence"><%= ss.exp.getExp64() %></p>
              <p class="study_word_sentence"><%= ss.exp.getExp65() %></p>
              <p class="study_word_sentence"><%= ss.exp.getExp66() %></p>
              <p class="study_word_sentence"><%= ss.exp.getExp67() %></p>
            </td>
          </tr>
        </table>
	  
	<%= ss.html.endRow() %>
    <!-- End Main Body Content-->
	
    <!-- Start Footer Content Nested Table, with Left and Right Cells -->
	<%= ss.html.sampFooter() %>
    <!-- End Footer Content, Left and Right Cells -->        
        
    <!-- End Main Table -->
	<%= ss.html.endTable() %>
    </body>
</html>
