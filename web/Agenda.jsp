<%-- 
    Document   : Agenda
    Created on : 12/08/2017, 14:27:18
    Author     : ANDERSON MEDEIROS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agenda</title>
    <link rel="stylesheet" href="_css/estilo-principal.css" type="text/css">
    <link rel="stylesheet" href="_css/obras.css" type="text/css">
    <link rel="stylesheet" href="_css/estilo-agenda.css" type="text/css">
    <script src="https://maps.googleapis.com/maps/api/js?callback=myMap"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="_jquery/mascaras.js"></script>
    <script>
        function Mapa() {
            var info = {
                center: new google.maps.LatLng(51.5, -0.12),
                zoom: 10,
                mapTypeId: google.maps.MapTypeId.HYBRID
            }
            var map = new google.maps.Map(document.getElementById("mapa"), info);
        }
    </script>
</head>
<body onload="Mapa()">
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
    <div class="col-12 area-agendamento">
        <div class="col-6 formAgendaVisita">
            <form name="formAgendaVisita" method="post" action="Agendamento_visita">
                <h1>Agende sua Visita: </h1>
                <label>Nome: </label><input type="text" name="txtNome">
                <label>Profissão: </label><input type="text" name="txtProfissao">
                <label>Tipo: </label><select name="txtTipoVis">
                    <option value="amigos">Amigos</option>
                    <option value="turma">Turma</option>
                    <option value="familia">Família</option>
                    <option value="sozinho(a)">Sozinho(a)</option>
                    <option value="pesquisa">Pesquisa</option>
                    <option value="outros">Outros</option>
                </select>
                <label>Data: </label><input type="text" name="txtDataVis" id="data" maxlength="10">
                <label>Hora: </label><input type="time" name="txtHVis" id="hora" maxlenght="4">
                <label>Quantidade de Visitantes: <input type="number" name="txtQtdeP" min="1" max="20">
                <input type="submit" name="btnEnviar" id="btnEnviar">
            </form>
        </div>
        <div class="col-6 mapa">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1991.9250826557957!2d-60.01389794209622!3d-3.1342617994294426!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x926c057715e51dc1%3A0x131a0659382fadd9!2sInstituto+Federal+de+Educa%C3%A7%C3%A3o%2C+Ci%C3%AAncia+e+Tecnologia+do+Amazonas+-+IFAM+-+Unidade+Centro!5e0!3m2!1spt-BR!2sbr!4v1500412814584" width="100%" height="450px" frameborder="0" style="border:0" allowfullscreen></iframe>
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
