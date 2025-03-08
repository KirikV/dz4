
fun suka(part1:String): String {
    return part1
        .map { char -> char + 1 }
        .joinToString("")
        .replace("5", "s")
        .replace("4", "u")
        .map { char -> char - 3 }
        .joinToString("")
        .replace("0", "o")
}

fun pzdc(part2:String): String {
    return part2
        .reversed()
        .map { char -> char - 4 }
        .joinToString("")
        .replace("_", " ")
}

fun main(args: Array<String>) {
    var s = "F2p)v\"y233{0->c}ttelciFc".toString()
    var part1 = s.slice(0..<s.length / 2)
    var part2 = s.slice(s.length / 2..<s.length)

    println(suka(part1) + pzdc(part2))
}


//    var part1 = s.sliceArray(0..s.size / 2)
//    var part2 = s.sliceArray(s.size / 2 + 1..<s.size)
//    fun mute(part1: CharArray) {
//        part1.map { char -> char + 3 }.joinToString(" ")
//        return
//    }
//    mute(part1)
//    println(part1.map { char -> char + 3 }.joinToString(" "))
//    println(part1)









