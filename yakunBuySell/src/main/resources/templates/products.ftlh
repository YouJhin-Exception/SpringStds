<!doctype html>
<html lang="ru">
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>Hello, BUYSELL!</h1><hr>
<h4>Всякие разные товары тут</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} тугриков. | <a href="/product/${product.id}">Подробнее..</a> </p>
    </div>
</#list>
<hr>
<h3>Добавить новый товар</h3>
<form action="/product/create" method="post">
    Название товара: <input type="text" name="title"/><br><br>
    Описание товара: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город товара: <input type="text" name="city"/><br><br>
    Автор объявления: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>