<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo Dojo / Implement DWR</title>
<script src="//ajax.googleapis.com/ajax/libs/dojo/1.13.0/dojo/dojo.js"
data-dojo-config="async: true"></script>

<script>
require([
    'dojo/dom',
    'dojo/domReady!'
], function (dom) {
    var greeting = dom.byId('greeting');
    greeting.innerHTML += ' from Dojo!';
});
    </script>

</head>
<body>
<h1 id="greeting">Hello</h1>
</body>
</html>