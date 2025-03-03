// 6. A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa em kotlin
//que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos
//quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$ 90,00 por dia e R$
//0,20 por Km rodado.

import java.util.Scanner

fun main(){
   val scanner = Scanner(System.`in`)

    System.out.println("Digite a quantidade de quilômetros percorridos: ")
    val kmPercorridos = scanner.nextDouble()

    print("Digite a quantidade de dias alugados: ")
    val diasAlugados = scanner.nextInt()

    val precoDia = 90.0
    val precoKM = 0.20

    val custoTotal = (diasAlugados * precoDia) + (kmPercorridos* precoKM)

    System.out.println("O preco total a ser pago é: R$ %.2f".format(custoTotal))

}