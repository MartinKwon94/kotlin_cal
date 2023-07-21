package com.example.myapplication

abstract class AbstractOperation {
    abstract fun perform(a: Double, b: Double): Double
}

class Addition : AbstractOperation() {
    override fun perform(a: Double, b: Double): Double {
        return a + b
    }
}

class Subtraction : AbstractOperation() {
    override fun perform(a: Double, b: Double): Double {
        return a - b
    }
}

class Multiplication : AbstractOperation() {
    override fun perform(a: Double, b: Double): Double {
        return a * b
    }
}

class Division : AbstractOperation() {
    override fun perform(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다.")
        }
        return a / b
    }
}
