<%-- 
    Document   : Obras
    Created on : 12/08/2017, 14:28:49
    Author     : ANDERSON MEDEIROS
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.ObrasDao"%>
<%@page import="Model.Obras"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>        

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Obras</title>
    <link rel="stylesheet" href="_css/estilo-principal.css" type="text/css">
    <link rel="stylesheet" href="_css/obras.css" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="_jquery/transicao-descricao.js"></script>
    <script src="_jquery/manipulacao-galeria.js"></script>

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

</header>

<section>
    <div class="col-12 grade-fotos" id="grade-fotos1">
        
        
        <div class="col-3">
            <img src="_imagens/_obras/img1.jpg" alt="img01" class="img-galeria">
            <img src="_imagens/_obras/img2.jpg" alt="img02" class="img-galeria">
            <img src="_imagens/_obras/img3.jpg" alt="img03" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img4.jpg" alt="img04" class="img-galeria">
            <img src="_imagens/_obras/img5.jpg" alt="img05" class="img-galeria">
            <img src="_imagens/_obras/img6.jpg" alt="img06" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img7.jpg" alt="img07" class="img-galeria">
            <img src="_imagens/_obras/img8.jpg" alt="img08" class="img-galeria">
            <img src="_imagens/_obras/img9.jpg" alt="img09" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img10.jpg" alt="img10" class="img-galeria">
            <img src="_imagens/_obras/img11.jpg" alt="img11" class="img-galeria">
            <img src="_imagens/_obras/img12.jpg" alt="img12" class="img-galeria">
        </div>
    </div>
    <div class="col-12 grade-fotos esconder-grade" id="grade-fotos2">
        Dois
        <div class="col-3">
            <img src="_imagens/_obras/img1.jpg" alt="img01" class="img-galeria">
            <img src="_imagens/_obras/img2.jpg" alt="img02" class="img-galeria">
            <img src="_imagens/_obras/img3.jpg" alt="img03" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img4.jpg" alt="img04" class="img-galeria">
            <img src="_imagens/_obras/img5.jpg" alt="img05" class="img-galeria">
            <img src="_imagens/_obras/img6.jpg" alt="img06" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img7.jpg" alt="img07" class="img-galeria">
            <img src="_imagens/_obras/img8.jpg" alt="img08" class="img-galeria">
            <img src="_imagens/_obras/img9.jpg" alt="img09" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img10.jpg" alt="img10" class="img-galeria">
            <img src="_imagens/_obras/img11.jpg" alt="img11" class="img-galeria">
            <img src="_imagens/_obras/img12.jpg" alt="img12" class="img-galeria">
        </div>
    </div>
    <div class="col-12 grade-fotos esconder-grade" id="grade-fotos3">
        Tres
        <div class="col-3">
            <img src="_imagens/_obras/img1.jpg" alt="img01" class="img-galeria">
            <img src="_imagens/_obras/img2.jpg" alt="img02" class="img-galeria">
            <img src="_imagens/_obras/img3.jpg" alt="img03" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img4.jpg" alt="img04" class="img-galeria">
            <img src="_imagens/_obras/img5.jpg" alt="img05" class="img-galeria">
            <img src="_imagens/_obras/img6.jpg" alt="img06" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img7.jpg" alt="img07" class="img-galeria">
            <img src="_imagens/_obras/img8.jpg" alt="img08" class="img-galeria">
            <img src="_imagens/_obras/img9.jpg" alt="img09" class="img-galeria">
        </div>
        <div class="col-3">
            <img src="_imagens/_obras/img10.jpg" alt="img10" class="img-galeria">
            <img src="_imagens/_obras/img11.jpg" alt="img11" class="img-galeria">
            <img src="_imagens/_obras/img12.jpg" alt="img12" class="img-galeria">
        </div>
    </div>

    <div class="col-12 paginacao">
        <a>&laquo;</a>
        <a onclick="exibePaginaGaleria('1')";>1</a>
        <a onclick="exibePaginaGaleria('2')";>2</a>
        <a onclick="exibePaginaGaleria('3')";>3</a>
        <a>4</a>
        <a>5</a>
        <a>&raquo;</a>
    </div>

</section>


<footer class="col-12 ">
    <div class="area-rodape">
        <div class="col-4">

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
            Desenvolvido por Anderson Medeiros,Ariel Nery e Arlison Batista
        </div>
    </div>
</footer>
<script src="_jquery/modelo.js"></script>
</body>
</html>