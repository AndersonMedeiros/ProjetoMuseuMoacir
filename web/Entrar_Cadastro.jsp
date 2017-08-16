<%-- 
    Document   : Entrar_Cadastro
    Created on : 09/08/2017, 22:07:53
    Author     : ANDERSON MEDEIROS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrar_Cadastro</title>
        <link rel="stylesheet" href="_css/estilo-principal.css" type="text/css">
        <link rel="stylesheet" href="_css/obras.css" type="text/css">
        <link rel="stylesheet" href="_css/estilo-cadastro.css" type="text/css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <header class="col-12">
            <h1 id="t">Museu Moacir Andrade</h1>
            <label for="icon-menu">&#9776;</label>
            <input type="checkbox" id="icon-menu">
            <nav id="menu">
        
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="obras.html">Obras</a></li>
                    <li>Explore</li>
                    <li><a href="agenda.html">Agenda</a></li>
                    <li>Fale Conosco</li>
                </ul>
            </nav>

        </header>

        <section>
            <div class="col-12 area-cadastro">
                <div class="col-6 formEntrar">
                    <form name="formCadUsuario" method="post" action="Entrar">
                        <h1>Já possui cadastro:</h1>
                        <label>Login: </label><input type="text" name="txtLogin">
                        <label>Senha: </label><input type="password" name="txtSenha">

                        <input type="submit" name="btnEnviar" id="btnEnviar">
                    </form>
                </div>
                <div class="col-6 formCadastrar">
                    <form name="formCadUsuario" method="post" action="Pre_Cadastro_Usuario">
                        <h1>Cadastre-se:</h1>
                        <label>CPF: </label><input type="text" name="txtCPF">
                        <label>Email: </label><input type="text" name="txtEmail">

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
