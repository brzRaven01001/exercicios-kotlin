// 1. Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre
//quantos dólares ela pode comprar. Considere US$1,00 = R$5,75.

import java.util.Scanner

fun main(){
    val scanner = Scanner(System. `in`)

    print("Digite o valor em real à ser convertido em dólar: ")
    val real = scanner.nextDouble()
    val dolar = "%.2f".format(real / 5.75)
    System.out.println("$real R$ equivalem a $$dolar")
}