/**
 * Created by ANDERSON MEDEIROS on 28/07/2017.
 */
$(function(){$('.esconder-grade').hide()});

function exibePaginaGaleria(id){
    $(
        function () {
            $('.grade-fotos').hide();
            $('#grade-fotos' + id).fadeIn();
        }
    )

}