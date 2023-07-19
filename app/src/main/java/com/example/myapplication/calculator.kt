package com.example.myapplication

class Calculator {
    private val operations: Map<String, CalculatorOperation> = mapOf(
        "+" to AddOperation(),
        "-" to SubtractOperation(),
        "*" to MultiplyOperation(),
        "/" to DivideOperation()
    )

    fun calculate(operator: String?, num1: Int, num2: Int): Int? {
        val operation = operations[operator]
        return operation?.calculate(num1, num2)
    }
}

fun main() {
    print("첫 번째 숫자를 입력하세요: ")
    val num1 = readLine()!!.toInt()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = readLine()!!.toInt()

    print("연산자를 입력하세요 (+, -, *, /, %): ")
    val operator = readLine()

    val calculator = Calculator()
    val result = calculator.calculate(operator, num1, num2)

    if (result != null) {
        println("결과: $result")
    } else {
        println("잘못된 연산자입니다.")
    }
}
