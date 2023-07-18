package com.example.myapplication
class Calculator {
    fun addOperation(operation: AddOperation, operand1: Int, operand2: Int): Double {
        return operation.operate(operand1, operand2)
        //위의 코드에서 'addOperation' 메서드는 'AddOperation' 클래스의 인스턴스인
        //'operation'과 피연산자인 'operand1'과 'operand2'를 전달받아 덧셈 연산을 수행합니다.
        //'operation.operate(operand1, operand2)'은 'AddOperation' 클래스의 'operate' 메서드를 호출하여 덧셈을 수행하고 그 결과를 반환합니다.
        //이렇게 수정된 Calculator 클래스를 사용하여 주어진 연산자와 피연산자를 전달하여 덧셈 연산을 수행할 수 있습니다.
    }
}
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
