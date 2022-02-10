<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/test.css">
<title>Document</title>
</head>
<body>
	Hello World of Spring!
	<br>
	<br> Student name: ${param.studentName}
	<br>
	<br> The message: ${message}

	<img id="my_img" alt=""
		src="${pageContext.request.contextPath}/resources/images/Ghibli_logo.png"
		onclick="imageClick()">
	<script
		src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</body>
</html>