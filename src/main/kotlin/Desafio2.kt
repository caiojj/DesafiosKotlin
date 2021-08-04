
/*
* Desafio
* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre
*  quantos valores informados são pares,quantos valores informados são
*  ímpares, quantos valores informados são positivos e quantos valores
* informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
* linha e não esquecendo o final de linha após cada uma.
*
* */

fun main(args: Array<String>) {

    val inteiros = mutableListOf<Int>()
    var pares: Int = 0
    var impares: Int = 0
    var positivos: Int = 0
    var negativos: Int = 0

    for (i in 0 until 5) {
        inteiros.add(readLine()!!.toInt())
    }

    for (i in 0 until 5) {
        when {
            inteiros[i] % 2 == 0 -> pares++
            inteiros[i] % 2 != 0 -> impares++
        }

        when {
            inteiros[i] > 0 -> positivos++
            inteiros[i] < 0 -> negativos++
        }
    }

    println("${pares} valor(es) par(es)")
    println("${impares} valor(es) impar(es)")
    println("${positivos} valor(es) positivo(s)")
    println("${negativos} valor(es) negativo(s)")
}