<%-- 
    Document   : Cadastro_Usuario
    Created on : 12/08/2017, 14:27:45
    Author     : ANDERSON MEDEIROS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Usuário</title>
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
                <div class="col-12 formCadastro">
                    <form name="formCadUsuario" method="post" action="cadastro_usuario">
                        <h1>Usuário</h1>
                        <% 
                            String cpf = request.getParameter("CPF");
                            String email = request.getParameter("EMAIL");
                        
                        %>
                        
                        <div class="col-6 teste">
                        <fieldset><legend>Dados Pessoais:</legend>
                        <div class="col-4"><label>CPF: </label><input type="text" name="txtCPF" id="cpf" value="<%= cpf%>"></div>
                        <div class="col-8"><label>Nome: </label><input type="text" name="txtNome"></div>
                        <div class="col-7"><label>Sexo: </label><div class="col-6"><input type="radio" name="txtSexo" value="M"><label>Masculino</label></div><div class="col-6"><input type="radio" name="txtSexo" value="F"><label>Feminino</label></div></div>
                        <div class="col-5"><label>Data de Nascimento: </label><input type="text" name="txtDataNasc" id="data" maxlength="10" ></div>
                        <div class="col-8"><label>Email: </label><input type="text" name="txtEmail" value="<%= email%>"></div>
                        <div class="col-4"><label>Fone: </label><input type="text" name="txtFone" id="fone"></div>
                        </fieldset>
                        </div>
                        
                        <div class="col-6">
                        <fieldset><legend>Login:</legend>
                        <div class="col-6"><label>Login: </label><input type="text" name="txtLogin"></div>
                        <div class="col-6"><label>Senha: </label><input type="password" name="txtSenha"></div>
                        </fieldset>
                        </div>
                            
                        <div class="col-6">
                        <fieldset><legend>Endereço:</legend>
                        <div class="col-4"><label>Cep: </label><input type="text" name="txtCep" id="cep"></div>
                        <div class="col-8"><label>Rua: </label><input type="text" name="txtRua"></div>
                        <div class="col-4"><label>Bairro: </label><input type="text" name="txtBairro"></div>
                        <div class="col-4"><label>Estado: </label><input type="text" name="txtEstado"></div>
                        <div class="col-4"><label>Cidade: </label><input type="text" name="txtCidade"></div>
                        </fieldset>
                        </div> 
                            
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

