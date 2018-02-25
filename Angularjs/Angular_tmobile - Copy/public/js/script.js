$(document).ready(function () {

    $("#credits").hide();
    $("#morColors").hide();

    $("#see").click(function () {
        $("#credits").show();
        $("#see").hide();
    });

    $("#less").click(function () {
        $("#see").show();
        $("#credits").hide();
    });

    $("#moreCol").click(function () {
        $("#morColors").show();
        $("#moreCol").hide();
    });

    $("#lessColors").click(function () {
        $("#moreCol").show();
        $("#morColors").hide();
    });


});
