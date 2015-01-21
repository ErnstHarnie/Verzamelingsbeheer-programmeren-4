

<%@page import="services.CategorieService"%>
<%@page import="services.TypeService"%>
<%@page import="services.VerzamelingService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dal.Categorie"%>
<%@page import="dal.Verzameling"%>
<%@page import="dal.VerzamelingsType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Categorie> categorieën = (ArrayList<Categorie>)session.getAttribute("c");
    ArrayList<Verzameling> verzamelingen = (ArrayList<Verzameling>)session.getAttribute("vm");
    ArrayList<VerzamelingsType> types = (ArrayList<VerzamelingsType>)session.getAttribute("t");
    
    %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verzamelingen</title>     
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/styles.css"/>
    </head>
    <body>
        
        <header>
            
            <div class="leftside">
                <h2>Verzamelingenbeheer</h2>
            </div>
            <div class="rightside">
             <ul class="nav nav-tabs">
                 <li><a href="index.html">Startpagina</a></li>
                 <li class="active"><a href="VerzamelingOpvragen">Verzamelingen weergeven</a></li>
                 <li><a href="TypeOpvragen">Types weergeven</a></li>
                 <li><a href="CategorieOpvragen">Categorieën weergeven</a></li>
             </ul>
            </div>
        </header>
        
        <article>
        <h2>Jouw verzamelingen:</h2><hr/>
        <table class="table table-bordered table-hover">
            
            <div><tr class="toptable"><th>Type</th><th>Naam</th><th>Beschrijving</th><th>Categorie</th><th>In bezit</th></tr></div>
            
        <%
    for(Verzameling verzameling : verzamelingen)
    {
    %>
    <tr class="midtable">
        <th><%= TypeService.GetType(verzameling.getTypeId()).getNaam() %></th><th><%= verzameling.getNaam() %></th><th><%= verzameling.getBeschrijving()%></th><th><%= CategorieService.GetCategorie(verzameling.getCategoryId()).getNaam() %><th><%= VerzamelingService.ConvertJaNee(verzameling.isInBezit()) %></th>
    </tr>
    <%}%>
        </table>
        
        </article>
    </body>
</html>
