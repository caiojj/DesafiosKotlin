/*
* Crie um programa que leia um número e mostre os números pares até esse
* número, inclusive ele mesmo.

* Entrada
* Você receberá 1 valor inteiro N, onde N > 0.

* Saída
* Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
* */

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        if(i % 2 == 0) println(i)
    }
}