package com.example.myapplication

// Calculator.kt
fun main() {
    val addition = Addition()
    val subtraction = Subtraction()
    val multiplication = Multiplication()
    val division = Division()

    var isCalculatorOn = true

    while (isCalculatorOn) {
        println("첫 번째 숫자를 입력하세요:")
        val num1 = readLine()?.toDoubleOrNull()
        
        println("연산자를 입력하세요 (+, -, *, /) or 종료하시려면 'q'를 입력하세요:")
        val operator = readLine()

        println("두번째 숫자를 입력하세요:")
        val num2 = readLine()?.toDoubleOrNull()

        if (operator == "q") {
            isCalculatorOn = false
        } else {
            val result = when (operator) {
                "+" -> addition.perform(num1 ?: 0.0, num2 ?: 0.0)
                "-" -> subtraction.perform(num1 ?: 0.0, num2 ?: 0.0)
                "*" -> multiplication.perform(num1 ?: 0.0, num2 ?: 0.0)
                "/" -> division.perform(num1 ?: 0.0, num2 ?: 0.0)
                else -> {
                    println("잘못된 연산자입니다.")
                    continue
                }
            }
            println("Result: $result")
        }
    }
    println("계산을 종료합니다.")
}
