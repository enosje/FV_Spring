<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Cadastro</title>
</head>
<body bgcolor="#D3D3D3"> 
<h2 align="center">Cadastro Usuário</h2>
	<form action="novoCadastro" method="post">
		<table align="center" >
			<tr>
				<td>Nome</td>
				<td align="center"><input type="text" name="nomeUsuario" /></td>
			</tr>
			<tr >
			<td bordercolor=""></td>
			<td bordercolor=""><form:errors path="usuario.nomeUsuario" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td>Senha</td>
				<td align="center"><input type="password" name="senha" /></td>
			</tr>
			<tr>
			<td></td>
			<td><form:errors path="usuario.senha" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="Cadastrar" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>