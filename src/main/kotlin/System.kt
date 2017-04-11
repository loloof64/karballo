import kotlin.js.Date

object System {

    fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int) {
        for (i in 0..length - 1) {
            dest[destPos + i] = src[srcPos + i]
        }
    }

    fun currentTimeMillis(): Long {
        var d = Date()
        return d.getTime().toLong()
    }

    fun exit(code: Int) {
        js("process.exit(code)") // For NodeJS
    }

    fun gc() {
        // Unavailable in Js
    }
}