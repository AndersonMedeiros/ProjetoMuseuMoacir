/**
 * Created by ANDERSON MEDEIROS on 15/07/2017.
 */

$(document).ready(function () {
    $("div.descricao01,div.descricao02,div.descricao03").hide();
    $("img.op01").mouseenter(function () {
        $("div.descricao"+"01").fadeIn(2000);
        $("div.descricao02,div.descricao03").hide();
    });
    $("img.op02").mouseenter(function () {
        $("div.descricao02").fadeIn(2000);
        $("div.descricao01,div.descricao03").hide();
    });
    $("img.op03").mouseenter(function () {
        $("div.descricao03").fadeIn(2000);
        $("div.descricao01,div.descricao02").hide();
    });

});
