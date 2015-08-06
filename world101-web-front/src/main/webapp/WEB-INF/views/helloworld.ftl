<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<link rel="stylesheet" type="text/css" href="css/helloworld.css" />
	<title>example page</title>
</head>
<body>
	<@spring.message "world101.hello" /> ${message}!
	<button id='btn' onclick="onBtnClick()">click here</button>
	
	<script type="text/javascript" src="js/helloworld.js"></script>
</body>
</html>