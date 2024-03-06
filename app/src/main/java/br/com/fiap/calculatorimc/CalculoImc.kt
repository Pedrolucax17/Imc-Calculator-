package br.com.fiap.calculatorimc

import kotlin.math.pow

fun imcCalculate(weight: Double, height: Double): Double{
    var imc = weight / (height / 100).pow(2)
    return imc
}

fun statusImc(imc: Double): String{
    return if(imc < 18.5){
        "Abaixo do peso"
    }else if(imc >= 18.5 && imc < 25.0){
        "Peso ideal"
    }else if(imc >= 25.0 && imc < 30.0){
        "Acima do peso"
    }else if(imc >= 30.0 && imc < 35.0){
        "Obesidade Grau I"
    }else if(imc > 35.0 && imc <= 40.0){
        "Obesidade Grau II"
    }else{
        "Obesidade Grau III"
    }
}