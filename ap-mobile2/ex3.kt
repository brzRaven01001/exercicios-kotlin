// 3. Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma equação do segundo
//grau e mostre o valor de Delta. (formula Δ = b2 – 4ac)

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)


    System.out.println("Digite o valor de A: ")
    val a = scanner.nextDouble()

    System.out.println("Digite o valor de B: ")
    val b = scanner.nextDouble()

    System.out.println("Digite o valor de C: ")
    val c = scanner.nextDouble()

    val delta = b * b - 4 * a * c

    System.out.println("O valor de Delta é: $delta")
}