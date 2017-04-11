package java.util

import kotlin.js.Date

class Date {
    var year: Int
    var month: Int
    var date: Int// it's the day

    init {
        var d = Date()
        year = js("d.getYear()")
        month = js("d.getMonth()")
        date = js("d.getDate()")
    }
}
