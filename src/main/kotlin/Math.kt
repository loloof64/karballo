import kotlin.js.Math

/**
 * This class is used to simplify the conversion to Js, where java.lang.Math isn't available and kotlin.js.Math must be
 * used, forcing some uncomfortable casts
 */
object Math {
    inline fun abs(a: Int): Int = if (a >= 0) a else -a
    inline fun min(a: Int, b: Int): Int = if (a <= b) a else b
    inline fun max(a: Int, b: Int): Int = if (a <= b) a else b
    inline fun log(a: Double): Double = Math.log(a)
}
