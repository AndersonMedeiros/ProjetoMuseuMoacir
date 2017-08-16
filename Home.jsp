<%-- 
    Document   : Home
    Created on : 12/08/2017, 14:28:23
    Author     : ANDERSON MEDEIROS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>   
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="_css/estilo-principal.css" rel="stylesheet" type="text/css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="_jquery/transicao-descricao.js"></script>
</head>
<body>
<header class="col-12">
    <h1 id="t">Museu Moacir Andrade</h1>
    <label for="icon-menu">&#9776;</label>
    <input type="checkbox" id="icon-menu">
    <nav id="menu">
        <ul>
            <li><a href="Home.jsp">Home</a></li>
            <li><a href="Obras.jsp">Obras</a></li>
            <li>Explore</li>
            <li><a href="Agenda.jsp">Agenda</a></li>
            <li>Fale Conosco</li>
        </ul>
    </nav>
    <a href="Entrar_Cadastro.jsp">Entrar</a>
</header>

<section>
    <img src="_imagens/img01.jpg" alt="img01" title="img" align="center">
</section>
<section class="area-texto">
    <h2>Bem-Vindo ao Museu Moacir Andrade!</h2>
    <hr>
    <p>Através do site vamos disponibilizar todas as obras presentes no Museu Físico, além de objetos histórico presentes no museu e também no Campus Manaus Centro.</p>
</section>
<section class="col-12">
    <div class="linha">
        <div class="col-4">
            <img class="op01" src="_imagens/col1.jpg" alt="col1" title="col" width="400px" height="400px">
            <div class="descricao01">
                <h3>Opção1</h3>
                <p>Através do site vamos disponibilizar todas as obras presentes no Museu Físico, além de objetos histórico presentes no museu e também no Campus Manaus Centro.</p>
                <a href="#ha">Veja Mais</a>
            </div>
        </div>
        <div class="col-4">
            <img class="op02" src="_imagens/col2.jpg" alt="col2" title="col" width="400px" height="400px"/>
            <div class="descricao02">
                <h3>Opção1</h3>
                <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn djfndjsfnjdnfjkdfn fdsjfndjsnfjdnfjsdnf sjdfbjsdfbjdf sdkfbjsdfkjbdf jsfbjsdfkjsbfjsf dsjfkbdskjfbksjfb sjfbsjkfkjsbfs fksbfkjsbdjfbdjfbjksfbjkdbsf kfsbdjkfbskjbfjsbfjs</p>
                <a href="#ha">Veja Mais</a>
            </div>
        </div>
        <div class="col-4">
            <img class="op03" src="_imagens/col3.jpg" alt="col3" title="col" width="400px" height="400px">
            <div class="descricao03">
                <h3>Opção1</h3>
                <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn djfndjsfnjdnfjkdfn fdsjfndjsnfjdnfjsdnf sjdfbjsdfbjdf sdkfbjsdfkjbdf jsfbjsdfkjsbfjsf dsjfkbdskjfbksjfb sjfbsjkfkjsbfs fksbfkjsbdjfbdjfbjksfbjkdbsf kfsbdjkfbskjbfjsbfjs</p>
                <a href="#ha">Veja Mais</a>
            </div>
        </div>
    </div>
</section>

<footer class="col-12 ">
    <div class="area-rodape">
        <div class="col-4">
            <h3>Instituto Federal de Educação, Ciência e Tecnologia do Amazonas</h3>
            <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>
        </div>
        <div class="col-4">
            <h3>Opção1</h3>
            <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>
        </div>
        <div class="col-4">
            <a href="http://www2.ifam.edu.br/">
                <img src="_imagens/ifam-logo.png" alt="IFAM" title="Logo IFAM"/>
            </a>
        </div>
        <div class="col-12 final-rodape">
            Desenvolvido por Anderson Medeiros e Ariel Nery
        </div>
    </div>
</footer>
</body>
</html>

