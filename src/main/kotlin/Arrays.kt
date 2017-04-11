object Arrays {

    inline fun fill(array: ShortArray, value: Short) {
        for (i in 0..array.size - 1) {
            array[i] = value
        }
    }

    inline fun fill(array: IntArray, value: Int) {
        for (i in 0..array.size - 1) {
            array[i] = value
        }
    }

    inline fun fill(array: LongArray, value: Long) {
        for (i in 0..array.size - 1) {
            array[i] = value
        }
    }
}
