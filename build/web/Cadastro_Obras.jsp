<%-- 
    Document   : Cadastro_Obras
    Created on : 13/08/2017, 02:39:57
    Author     : ANDERSON MEDEIROS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Obras</title>
        <link rel="stylesheet" href="_css/estilo-principal.css" type="text/css">
        <link rel="stylesheet" href="_css/obras.css" type="text/css">
        <link rel="stylesheet" href="_css/estilo-cadastro.css" type="text/css">
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="_jquery/mascaras.js"></script>
        
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
            <div class="col-12 area-cadastro">
                <div class="col-6 formCadastro">
                    <form name="formCadObras" method="post" action="cadastro_obras">
                        <h1>Obras</h1>
                        
                        
                        <label>Código: </label><input type="text" name="txtCod">
                        <label>Titulo: </label><input type="text" name="txtTitulo">
                        <label>Ano: </label><input type="text" name="txtAno">
                        <label>Descrição: </label><input type="textArea" name="txtDesc">
                        <label>Imagem: </label><input type="file" name="txtImg" accept="image/*">
                        
                        
                        
                        <input type="submit" name="btnEnviar" id="btnEnviar">
                    </form>
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
