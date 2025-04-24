<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="Add Product" onclick="window.location.href='formForAddProduct'; return false;">

<table>
  <tr>
    <td>Name</td>
    <td>Description</td>
    <td>Price</td>
    <td>Update/Delete</td>
  </tr>

  <c:forEach var="product" items="${products}">

    <c:url var="updateLink" value="formForUpdate">
      <c:param name="ProductId" value="${product.id}"/>
    </c:url>

    <c:url var="deleteLink" value="delete">
      <c:param name="ProductId" value="${product.id}"/>
    </c:url>

    <tr>
      <th>${product.name}</th>
      <th>${product.description}</th>
      <th>${product.price}</th>
      <th>
        <a href="${updateLink}">Update</a>
        |
        <a href="${deleteLink}" onclick="if ((!confirm('are you sure'))) return false">Delete</a>
      </th>
    </tr>
  </c:forEach>
</table>
</body>
</html>
