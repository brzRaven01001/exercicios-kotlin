// 7. Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o salário de um
//funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    System.out.println("Digite o número de dias trabalhados no mês: ")
    val diasTrabalhados = scanner.nextInt()

    val horasDia = 8
    val valorHora = 25.0

    val salario = diasTrabalhados * horasDia * valorHora

    System.out.println("O salário do funcionário é: R$ %.2f".format(salario))
}