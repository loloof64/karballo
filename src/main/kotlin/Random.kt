package java.util

import kotlin.js.Math

class Random {

    fun nextDouble(): Double = Math.random()

    fun nextFloat(): Float = Math.random().toFloat()

    fun nextInt(n: Int): Int {
        return (Math.random() * n).toInt()
    }

}
