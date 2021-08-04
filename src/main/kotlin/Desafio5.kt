/*
*  Leia um caractere maiúsculo, que indica uma operação que deve ser
*  realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a
*  soma ou a média considerando somente aqueles elementos que estão
*  acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

*  Entrada
*  A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

*  Saída
*  Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*
* */

fun main(args: Array<String>) {

    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            M[i][j] = readLine()!!.toDouble()
        }
    }

    for (i in 0 until 12) {
        for (j in i + 1 until 12) {
            sum += M[i][j]
        }
    }

    if (T == "M") sum /= 66.0
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
    .format(this).replace(',','.')