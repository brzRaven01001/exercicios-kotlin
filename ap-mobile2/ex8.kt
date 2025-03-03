// 8. [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
//Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um
//fumante perderá e exiba o total em dias.

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    System.out.println("Vamos descobrir seu tempo de vida como fumante!")

    System.out.println("Quantos cigarros você fuma por dia? ")
    val cigarrosPorDia = scanner.nextInt()

    System.out.println("Há quantos anos você fuma? ")
    val anosFumando = scanner.nextInt()

    val minutosPerdidosPorCigarro = 10
    val minutosPorDia = 24 * 60
    val diasPorAno = 365

    val totalCigarros = cigarrosPorDia * anosFumando * diasPorAno
    val totalMinutosPerdidos = totalCigarros * minutosPerdidosPorCigarro
    val diasPerdidos = totalMinutosPerdidos / minutosPorDia.toDouble()

    System.out.println("Você perdeu APROXIMADAMENTE %.2f dias devido ao fumo!".format(diasPerdidos))
}