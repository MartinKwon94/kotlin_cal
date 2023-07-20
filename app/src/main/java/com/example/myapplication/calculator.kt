package com.example.myapplication

fun main() {
    var cal = Cal()

    print("첫 번째 숫자를 입력하세요: ")
    val num1 = readLine()!!.toInt()

    print("연산자를 입력하세요 (+, -, *, /, %): ")
    val operator = readLine()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = readLine()!!.toInt()


    val result = when (operator) {
        "+" -> cal.add(num1, num2)
        "-" -> cal.sub(num1, num2)
        "*" -> cal.mul(num1, num2)
        "/" -> cal.div(num1, num2)
        else -> null
    }

    if (result != null) {
        println("결과: $result")
    } else {
        println("잘못된 연산자입니다.")
    }
}

