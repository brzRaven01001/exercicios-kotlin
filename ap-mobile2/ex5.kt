// 5. Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o seu novo salário,
//com 15% de aumento.

import java.util.Scanner

fun main() {
    print("Digite o salário do funcionário: R$ ")
    val salario = readLine()?.toDoubleOrNull() ?: return

    val aumento = salario * 0.15
    val novoSalario = salario + aumento

    System.out.println("O novo salário é: R$$novoSalario")
}
