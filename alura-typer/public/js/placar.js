$("#botao-placar").click(mostraPlacar);
$("#botao-sync").click(sincronizaPlacar);

function inserePlacar(){
    var corpoTabela = $(".placar").find("tbody");
    var usuario = "erika";
    var numPalavras = $("#contador-palavras").text();

    //var botaoRemover = "<a href='#' class='botao-remover'><i class='small material-icons'>delete</i></a>";
   // var linha = "<tr>"+"<td>"+ usuario +"</td>"+"<td>"+ numPalavras +"</td>"+ "<td>"+ botaoRemover +"</td>" +"</tr>";

   var linha = novaLinha(usuario, numPalavras);
   linha.find(".botao-remover").click(removeLinha);

    //corpoTabela.append(linha);
    corpoTabela.prepend(linha);
    $(".placar").slideDown(500);
    scrollPlacar();
}

function scrollPlacar(){
    var posicaoPlacar = $(".placar").offset().top;
    $("body").animate({
        scrolTop: posicaoPlacar+"px"
    }, 1000);
}


function novaLinha(usuario,numPalavras){
    var linha = $("<tr>");
    var colunaUsuario = $("<td>").text(usuario);
    var colunaPalavras = $("<td>").text(numPalavras);
    var colunaRemover = $("<td>");

    var link = $("<a>").addClass("botao-remover").attr("href","#");
    var icone = $("<i>").addClass("small").addClass("material-icons").text("delete");

    link.append(icone);
    colunaRemover.append(link);

    linha.append(colunaUsuario);
    linha.append(colunaPalavras);
    linha.append(colunaRemover);

    return linha;
}

function removeLinha(event){
    event.preventDefault();
//    $(this).parent().parent().remove();
    var linha = $(this).parent().parent();
    linha.fadeOut(1000);
    setTimeout(function(){
        linha.remove();
    },1000); 
    
}

function mostraPlacar(){
//    $(".placar").css("display","block");
    $(".placar").stop().slideToggle(600);
}
function sincronizaPlacar(){
    var placar = [];
    var linhas = $("tbody>tr");
    linhas.each(function(){
        var usuario = $(this).find("td:nth-child(1)").text();
        var palavras = $(this).find("td:nth-child(2)").text();

        var score = {
            usuario: usuario,
            pontos: palavras
        };

        placar.push(score);
    });
    var dados = {
        placar: placar
    };
    $.post("http://localhost:3000/placar", dados, function(){
        console.log("salvou")
    });
}

function atualizaPlacar(){
    $.get("http://localhost:3000/placar", function(data){
    $(data).each(function(){
        var linha =novaLinha(this.usuario, this.pontos);
        linha.find(".botao-remover").click(removeLinha);
        $("tbody").append(linha);
    });
});
}