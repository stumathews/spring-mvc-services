<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<c:url value="/themes" var="themeURLBase"/>	
	<!-- <link rel="stylesheet" href="${themeURLBase}/<spring:theme code='stylesheet'/>" type="text/css" /> -->
        <link rel="stylesheet" href="${themeURLBase}/bootstrap/css/bootstrap.min.css" media="screen">
        <link rel="stylesheet" href="${themeURLBase}/bootstrap/css/bootstrap-responsive.css">
        <style>
      body {
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
      }
    </style>
</head>
<body>

    <c:import url="/navigation/TopMenu"></c:import>

    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span3">
          <c:import url="/navigation/NavMenu"></c:import> 
        </div><!--/span-->
        <div class="span9">
          <div class="container">
            <h1>Add product</h1>
            <p>To start sharing this product with the wider world, you'll need to define it.
                </br>Once your product exist, you and the world can start defining it and reviewing it.
            </p>
      
            <c:url value="/products/create" var="AddProductURL"/>
            <form action="${AddProductURL}" method="post">
                <fieldset>
                    <legend>Add product</legend>
                    <label for="who_made_it">Who made it?</label>
                    <input type="text" id="whoMadeIt" name="whoMadeIt" />  
                        <span class="help-block">Tell us who made or designed it. Maybe it belongs to someone?</span>
                    <label for="what_is_it">What is it?</label>
                    <input type="text" id="whatIsIt" name="whatIsIt" />
                        <span class="help-block">What is it basically? A watch, pillow or service?</span>
                    <label for="title">Title</label>
                    <input type="text" id="title" name="title"/>   
                        <span class="help-block">If you had to wrap it up in a title, what would it be?</span>
                    <input type="submit" value="add" class="btn" />
                </fieldset>
            </form>	
        </div>
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>© Recommendations, Reviews and Reviews 2013</p>
      </footer>

    </div><!--/.fluid-container-->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="${themeURLBase}/bootstrap/js/bootstrap.min.js"></script>

  

</body>

</html>