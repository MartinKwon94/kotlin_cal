package com.example.myapplication

fun main() {
    print("첫 번째 숫자를 입력하세요: ")
    val num1 = readLine()!!.toInt()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = readLine()!!.toInt()

    print("연산자를 입력하세요 (+, -, *, /, %): ")
    val operator = readLine()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        "%" -> num1 % num2
        else -> null
    }

    if (result != null) {
        println("결과: $result")
    } else {
        println("잘못된 연산자입니다.")
    }
}
