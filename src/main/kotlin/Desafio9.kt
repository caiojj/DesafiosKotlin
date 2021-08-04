/*
* A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de
* Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos
* 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros
* números dessa série.

* Entrada
* O arquivo de entrada contém um valor inteiro N (0 < N < 46).

* Saída
* Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve
* haver espaço após o último valor.
* */

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    var aux: Int

    for (i in 1..n) {
        print("${a}")

        if(i != n) print(" ")

        aux = a + b
        a = b
        b = aux
    }
}