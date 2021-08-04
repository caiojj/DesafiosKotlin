/*
*
* Desafio
* Você deve calcular o consumo médio de um automóvel onde será informada a distância
* total percorrida (em Km) e o total de combustível consumido (em litros).
*
* Entrada
* Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km),
* e um valor real Y que representa o total de combustível consumido, com um dígito após o
* ponto decimal.
*
* Saída
* Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo
* no final a mensagem "km/l".
* */

fun main() {
    var media: Double = 0.0
    val x: Int = readLine()!!.toInt()
    val y: Double = readLine()!!.toDouble()

    media = x / y

    println(String.format("%.3f km/l", media).replace(",", "."))
}