/**
 * Created by ANDERSON MEDEIROS on 20/07/2017.
 */
$(".img-galeria").click(function (e) {
    var img = e.target.src;
    var modelo = '<section class="col-12 modelo" id="modelo">' +
        '<div class="col-6 area-img">' +
        '<img src="' + img + '" alt="img1" class="img-mod">' +
        '</div>' +
        '<div class="col-6 area-descricao">' +
        '<h1>Instituto Federal de Educação, Ciência e Tecnologia do Amazonas</h1>' +
        '<p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>' +
        '</div>' +
        '<div class="btnFechar" id="btnFechar">X</div>' +
        '</section>';
    $('body').append(modelo);
    $('#btnFechar').click(function () {
        $('#modelo').remove();
    })
});

$(document).keyup(function (e) {
    if(e.which==27){
        $('#modelo').remove();
    }
});

