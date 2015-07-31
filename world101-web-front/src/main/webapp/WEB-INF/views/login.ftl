<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>user login</title>
</head>
<body>
	<form action="authentication" method="POST">
		<#if error??><div>${error}</div></#if>
		<div>
			<label for="username">user name</label>
			<input type="text" id="username" name="username" placeholder="user name" autofocus required />
		</div>
		<div>
			<label for="password">password</label>
			<input type="password" id="password" name="password" placeholder="password" required />
		</div>
		<div>
			<input type="submit" value="submit" />
		</div>
	</form>
</body>
</html>