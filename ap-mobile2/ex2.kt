// 2. Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e mostre a área a ser
//pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma
//área de 2 metros quadrados.

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    System.out.println("Digite a largura da parede: ")
    val largura = scanner.nextDouble()

    System.out.print("Digite a altura da parede: ")
    val altura = scanner.nextDouble()

    val area = altura * largura
    val tinta = area / 2

    println("Para pintar uma área de %.2f m², será necessário %.2f litros de tinta.".format(area, tinta))

}