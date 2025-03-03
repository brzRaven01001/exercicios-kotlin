// 4. Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o seu PREÇO
//PROMOCIONAL, com 5% de desconto.

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    System.out.println("Digite o valor do produto: R$ ")
    val preco = scanner.nextDouble()

    val desconto = preco * 0.05
    val precoPromocao = "%.2f".format(preco - desconto)

    System.out.println("O preço promocional com 5% de desconto é: R$$precoPromocao")
}