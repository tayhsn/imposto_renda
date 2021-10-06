fun main() {
    println("GOV FEDERAL - UM PAÍS DE TOLOS")
    println("CALCULO DO IMPOSTO DE RENDA")
    print("Digite aqui o seu salário: R$")
    val salario = readLine()!!.toDouble()
    val imposto = calculaImposto(salario)

    if (imposto == 0.0) print("O imposto pago sobre R$${salario} é isento")
    else print("O imposto pago sobre R$${salario} é de R$${imposto}")
}

fun calculaImposto(salario: Double): Double {
    val valorExcedente: Double
    var imposto = 0.0
    val valorIsento = 2000

    if (salario <= 2000) return 0.0
    else if (salario <= 3000) {
        valorExcedente = salario - valorIsento
        imposto = (valorExcedente * 8) / 100
    }
    else if (salario <= 4500) {
        valorExcedente = salario - valorIsento
        imposto = (valorExcedente * 18) / 100
    }
    else if (salario > 4500) {
        valorExcedente = salario - valorIsento
        imposto = (valorExcedente * 28) / 100
    }
    return imposto
}

// salario até 2000 = isento
// salario até 3000 = 8%
// salario até 4500 = 18%
// salario acima = 28%