package com.example.myapplication

class Cal {
    val addOperation = AddOperation()

    val subtractOperation = SubtractOperation()

    val multiplicationOperation = MultiplicationOperation()

    val divisionOperation = DivisionOperation()

    fun add(num1: Int, num2: Int): Double {
        return addOperation.operate(num1, num2)
    }
    fun sub(num1: Int, num2: Int): Double {
        return subtractOperation.operate(num1, num2)
    }
    fun mul(num1: Int, num2: Int): Double {
        return multiplicationOperation.operate(num1, num2)
    }
    fun div(num1: Int, num2: Int): Double {
        return divisionOperation.operate(num1, num2)
    }

}
