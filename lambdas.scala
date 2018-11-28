// code_report
// 

object lambdas {
    
    def sort_lambda() {
        val l = List("bear", "cat", "elephant", "mouse")
        println(l.sortWith((a, b) => a.length < b.length))
    }
    
    def example1() {
        val l = List(1, 2, 3, 4, 5)
        println(l.sum)
        println(l.product)
    }
    
    def example2() {
        val l = List(1, 2, 3, 4, 5)
        println(l.foldLeft(0)(_ + _))
        println(l.foldLeft(1)(_ * _))
    }
    
    def example3() {
        val l = List(1, 2, 3, 4, 5)
        println(l.reduce((a, b) => a + b))
        println(l.reduce((a, b) => a * b))
    }
    
    def main(args: Array[String]) {
        sort_lambda()
        example1()
        example2()
        example3()
    }
}
