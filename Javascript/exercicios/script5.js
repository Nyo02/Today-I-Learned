function iniciar(){
    var gen = window.document.getElementsByName('radsex')
    var alt = window.document.getElementById('altura')

    var sexo 

    if(gen[0].checked){
        Pessoas('Masculino')


    }else genero='Feminino'

    window.alert(genero)
}

function Pessoas(altura, genero){
    
    
    Pessoas.altura
    Pessoas.genero

    this.altura = altura
    this.genero = genero
}