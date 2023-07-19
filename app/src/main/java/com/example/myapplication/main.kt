package com.example.myapplication

interface CalculatorOperation {
    fun calculate(num1: Int, num2: Int): Int
}

class AddOperation : CalculatorOperation {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class SubtractOperation : CalculatorOperation {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MultiplyOperation : CalculatorOperation {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class DivideOperation : CalculatorOperation {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}
