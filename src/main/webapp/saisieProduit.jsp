<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
 <%@include file="header.jsp"%>
 <div class="container col-md-10 col-md-offset-1">
 	<div class="panel panel-primary">
 	<div class="panel-heading">Saisie Produit</div>
 	<div class="panel-body">
 	 <form action="SaveProduit.isi" method="post">
 	  <div class="form-group">
 	   <label class="control-label">Désignation</label>
 	   <input type="text" name="designation" class="form-control">
 	   <span></span>
 	  </div>
 	  
 	  <div class="form-group">
 	   <label class="control-label">Prix</label>
 	   <input type="text" name="prix" class="form-control">
 	   <span></span>
 	  </div>
 	  
 	  <div class="form-group">
 	   <label class="control-label">Qantité</label>
 	   <input type="text" name="quantite" class="form-control">
 	   <span></span>
 	  </div>
 	  
 	  <div>
 	   <button type="submit" class="btn btn-primary">Enregistrer</button>
 	  </div>
 	  
 	 </form>
 	</div>
 </div>
 
 </div>
</body>
</html>