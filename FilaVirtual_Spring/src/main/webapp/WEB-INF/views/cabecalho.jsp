<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="efetuaLogin" method="post">
		<table align="right">

			

			<tr>
				<td>Usuário:</td>
				<td><input type="text" name="nomeUsuario" /></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" name="senha" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="Enviar" /></td>
			</tr>

			<tr>
				<td></td>
				<td align="right">
					<h5>
						<font color="red"><a
							href="http://localhost:8080/filavirtual/">Esqueceu a senha?</a></font> <font
							color="red"><a href="cadastroUser">Cadastrar</a></font>
					</h5>
				</td>
				<td></td>
			</tr>




		</table>

	</form>
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />


	<hr>
</body>
</html>