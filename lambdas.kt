// code_report 
// 

fun sort_lambda() {
    var l = listOf("bear", "cat", "elephant", "mouse")
    l = l.sortedWith(compareBy { it.length })
    println(l)
}

fun add_lambda() {
    val l = listOf(1, 2, 3, 4, 5);
    println(l.sum())
}

fun product_lambda() {
    val l = listOf(1, 2, 3, 4, 5);
    val x = l.reduce{ a, b -> a * b }
    println(x)
}

fun main(args: Array<String>) {
    add_lambda()
    product_lambda()
    sort_lambda()
}
