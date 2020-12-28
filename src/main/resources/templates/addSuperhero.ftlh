<!DOCTYPE html>
<html lang="pl">
<head>
    <title></title>
    <meta charset="UTF-8"/>
</head>
<body>
Superhero:

<form action="/superhero" method="post">
    <label> Podaj imię super bohatera: <input type="text" name="name" required> </label><br/>
    <label> Podaj nick super bohatera <input type="text" name="nickName" required> </label><br/>
    <label> Podaj z jakiego universum pochodzi:  <input type="text" name="universe" required> </label><br/>
    <input type="submit" name="save" value="save">
</form>

</body>
</html>